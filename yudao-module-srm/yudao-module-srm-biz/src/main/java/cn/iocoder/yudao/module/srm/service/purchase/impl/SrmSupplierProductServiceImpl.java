package cn.iocoder.yudao.module.srm.service.purchase.impl;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.exception.util.ThrowUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.common.util.spring.SpringUtils;
import cn.iocoder.yudao.framework.idempotent.core.annotation.Idempotent;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierProductDTO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product.SrmSupplierProductPageReqVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product.SrmSupplierProductRespVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product.SrmSupplierProductSaveReqVO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderItemDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmSupplierDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmSupplierProductDO;
import cn.iocoder.yudao.module.srm.dal.mysql.purchase.SrmSupplierProductMapper;
import cn.iocoder.yudao.module.srm.service.purchase.SrmSupplierProductService;
import cn.iocoder.yudao.module.srm.service.purchase.SrmSupplierService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertSet;
import static cn.iocoder.yudao.module.erp.enums.ErpErrorCodeConstants.PRODUCT_CODE_DUPLICATE;
import static cn.iocoder.yudao.module.erp.enums.ErpErrorCodeConstants.PRODUCT_UNIT_NAME_DUPLICATE;
import static cn.iocoder.yudao.module.srm.enums.SrmErrorCodeConstants.SUPPLIER_MODIFY_FAIL;
import static cn.iocoder.yudao.module.srm.enums.SrmErrorCodeConstants.SUPPLIER_PRODUCT_NOT_EXISTS;

/**
 * ERP 供应商产品 Service 实现类
 *
 * @author 索迈管理员
 */
@Service
@Validated
@RequiredArgsConstructor
@Slf4j
public class SrmSupplierProductServiceImpl implements SrmSupplierProductService {

    @Resource
    MessageChannel erpCustomRuleChannel;
    private final SrmSupplierProductMapper supplierProductMapper;
    //    private final ErpProductService productService;
    private final SrmSupplierService supplierService;

    /**
     * 保证同一供应商+产品下只有一个defaultSupplier为true
     *
     * @param supplierId 供应商ID
     * @param productId  产品ID
     * @param selfId     排除自身ID（新增时可为null）
     * @param needSet    是否需要设置（如当前操作defaultSupplier为true时）
     */
    private void ensureUniqueDefaultSupplier(Long supplierId, Long productId, Long selfId, boolean needSet) {
        if (!needSet) return;
        List<SrmSupplierProductDO> list = supplierProductMapper.selectListBySupplierIdAndProductId(supplierId, productId);
        for (SrmSupplierProductDO item : list) {
            if ((!item.getId().equals(selfId)) && Boolean.TRUE.equals(item.getDefaultSupplier())) {
                item.setDefaultSupplier(false);
                supplierProductMapper.updateById(item);
            }
        }
    }

    @Override
    @Idempotent
    public Long createSupplierProduct(SrmSupplierProductSaveReqVO createReqVO) {
        // 新增逻辑：如果当前供应商+产品组合首次创建且 defaultSupplier 为 null，则设置为 true
        List<SrmSupplierProductDO> existList = supplierProductMapper.selectListBySupplierIdAndProductId(createReqVO.getSupplierId(), createReqVO.getProductId());
        if ((existList == null || existList.isEmpty()) && createReqVO.getDefaultSupplier() == null) {
            createReqVO.setDefaultSupplier(true);
        }
        validateSupplierProductCodeUnique(null, createReqVO.getCode());
        // 公共逻辑
        ensureUniqueDefaultSupplier(createReqVO.getSupplierId(), createReqVO.getProductId(), null, Boolean.TRUE.equals(createReqVO.getDefaultSupplier()));
        // 插入
        SrmSupplierProductDO supplierProduct = BeanUtils.toBean(createReqVO, SrmSupplierProductDO.class);
        supplierProductMapper.insert(supplierProduct);
        // 返回
        return supplierProduct.getId();
    }

    @Override
    public void saveOrUpdateSupplierProduct(SrmSupplierProductSaveReqVO updateReqVO) {
        Long id = updateReqVO.getId();
        validateSupplierProductCodeUnique(id, updateReqVO.getCode());
        // 校验存在
        validateSupplierProductExists(id);
        // 公共逻辑
        ensureUniqueDefaultSupplier(updateReqVO.getSupplierId(), updateReqVO.getProductId(), id, Boolean.TRUE.equals(updateReqVO.getDefaultSupplier()));
        // 更新
        SrmSupplierProductDO updateObj = BeanUtils.toBean(updateReqVO, SrmSupplierProductDO.class);
        ThrowUtil.ifSqlThrow(supplierProductMapper.updateById(updateObj), SUPPLIER_MODIFY_FAIL);
    }

    @Override
    public void saveOrUpdateSupplierProduct(SrmSupplierProductDTO dto) {
        // 根据供应商ID和产品ID查询供应商产品
        SrmSupplierProductDO existingProduct = supplierProductMapper.selectBySupplierIdAndProductId(dto.getSupplierId(), dto.getProductId());
        if (existingProduct != null) {
            // 如果存在，则更新
            SrmSupplierProductDO updateObj = BeanUtils.toBean(dto, SrmSupplierProductDO.class);
            updateObj.setId(existingProduct.getId());
            updateObj.setVersion(existingProduct.getVersion());

            // 如果没有设置上次采购价格，则将当前采购价格设为上次采购价格
            if (updateObj.getLastPurchasePrice() == null && existingProduct.getPurchasePrice() != null && existingProduct.getPurchasePrice() > 0) {
                updateObj.setLastPurchasePrice(BigDecimal.valueOf(existingProduct.getPurchasePrice()));
            }

            // 保持其他字段不变（如果DTO中没有设置）
            if (updateObj.getCode() == null) {
                updateObj.setCode(existingProduct.getCode());
            }
            if (updateObj.getDefaultSupplier() == null) {
                updateObj.setDefaultSupplier(existingProduct.getDefaultSupplier());
            }
            if (updateObj.getPurchasePriceCurrencyCode() == null) {
                updateObj.setPurchasePriceCurrencyCode(existingProduct.getPurchasePriceCurrencyCode());
            }

            supplierProductMapper.updateById(updateObj);
        } else {
            // 如果不存在，则创建新的供应商产品记录
            SrmSupplierProductDO newProduct = BeanUtils.toBean(dto, SrmSupplierProductDO.class);
            // 设置默认值
            if (newProduct.getDefaultSupplier() == null) {
                newProduct.setDefaultSupplier(true); // 如果是首次创建，设为默认供应商
            }
            supplierProductMapper.insert(newProduct);
        }
    }

    @Override
    public void updateSupplierProductPrice(Long supplierId, SrmPurchaseOrderItemDO orderItem, SrmPurchaseOrderDO srmPurchaseOrderDO) {
        try {
            // 参数校验
            if (supplierId == null) {
                log.debug("供应商ID为空，跳过更新供应商产品价格");
                return;
            }
            if (orderItem.getProductId() == null) {
                log.debug("产品ID为空，跳过更新供应商产品价格 - 供应商ID: {}", supplierId);
                return;
            }

            // 构建更新DTO
            SrmSupplierProductDTO dto = new SrmSupplierProductDTO();
            dto.setSupplierId(supplierId);
            dto.setProductId(orderItem.getProductId());

            // 更新采购价格 - 使用含税单价作为最新采购价格
            if (orderItem.getGrossPrice() != null && orderItem.getGrossPrice().compareTo(BigDecimal.ZERO) > 0) {
                dto.setLastPurchasePrice(orderItem.getGrossPrice());
            } else if (orderItem.getProductPrice() != null && orderItem.getProductPrice().compareTo(BigDecimal.ZERO) > 0) {
                // 如果没有含税单价，使用产品单价
                dto.setLastPurchasePrice(orderItem.getProductPrice());
            } else {
                log.warn("采购订单明细行没有有效价格信息，跳过更新 - 供应商ID: {}, 产品ID: {}, 含税单价: {}, 产品单价: {}", supplierId, orderItem.getProductId(), orderItem.getGrossPrice(), orderItem.getProductPrice());
                return;
            }

            // 更新税率
            if (orderItem.getTaxRate() != null && orderItem.getTaxRate().compareTo(BigDecimal.ZERO) >= 0) {
                dto.setTaxRate(orderItem.getTaxRate());
            }

            // 更新货币代码 - 使用订单主表的货币代码
            dto.setPurchasePriceCurrencyCode(srmPurchaseOrderDO.getCurrencyId().intValue());
            SrmSupplierProductService supplierProductService = SpringUtils.getBean(SrmSupplierProductService.class);
            supplierProductService.saveOrUpdateSupplierProduct(dto);

            log.info("已更新供应商产品价格 - 供应商ID: {}, 产品ID: {}, 新`上一次价格`: {}",
                supplierId, orderItem.getProductId(), dto.getLastPurchasePrice());

        } catch (Exception e) {
            log.error("更新供应商产品价格失败 - 供应商ID: {}, 产品ID: {}",
                supplierId, orderItem.getProductId(), e);
        }
    }

    @Override
    public void deleteSupplierProduct(Long id) {
        // 校验存在
        validateSupplierProductExists(id);
        // 删除
        supplierProductMapper.deleteById(id);
    }

    private void validateSupplierProductExists(Long id) {
        if(supplierProductMapper.selectById(id) == null) {
            throw exception(SUPPLIER_PRODUCT_NOT_EXISTS);
        }
    }

    private void validateSupplierProductCodeUnique(Long id, String code) {
        SrmSupplierProductDO supplierProduct = supplierProductMapper.selectByCode(code);
        if(supplierProduct == null) {
            return;
        }
        // 如果 id 为空，说明不用比较是否为相同 id 的字典类型
        if(id == null) {
            throw exception(PRODUCT_CODE_DUPLICATE);
        }
        if(!supplierProduct.getId().equals(id)) {
            throw exception(PRODUCT_UNIT_NAME_DUPLICATE);
        }
    }

    @Override
    public SrmSupplierProductDO getSupplierProduct(Long id) {
        return supplierProductMapper.selectById(id);
    }

    @Override
    public PageResult<SrmSupplierProductDO> getSupplierProductPage(SrmSupplierProductPageReqVO pageReqVO) {
        return supplierProductMapper.selectPage(pageReqVO);
    }

    @Override
    public PageResult<SrmSupplierProductRespVO> buildSupplierProductVOPageResult(PageResult<SrmSupplierProductDO> pageResult) {
        var newList = buildSupplierProductVOList(pageResult.getList());
        return new PageResult<>(newList, pageResult.getTotal());
    }

    private List<SrmSupplierProductRespVO> buildSupplierProductVOList(List<SrmSupplierProductDO> list) {
        if(CollUtil.isEmpty(list)) {
            return Collections.emptyList();
        }
        // 1.2 产品信息
        //        Map<Long, ErpProductRespVO> productMap = productService.getProductVOMap(
        //            convertSet(list, SrmSupplierProductDO::getProductId));
        // 1.3 供应商信息
        Map<Long, SrmSupplierDO> supplierMap = supplierService.getSupplierMap(convertSet(list, SrmSupplierProductDO::getSupplierId));
        return BeanUtils.toBean(list, SrmSupplierProductRespVO.class, supplierProduct -> {
            //            MapUtils.findAndThen(productMap, supplierProduct.getProductId(), product -> supplierProduct.setProductName(product.getName()));
            MapUtils.findAndThen(supplierMap, supplierProduct.getSupplierId(), supplier -> supplierProduct.setSupplierName(supplier.getName()));
            //            MapUtils.findAndThen(userMap, Long.parseLong(supplierProduct.getCreator()), user -> supplierProduct.setCreatorName(user.getNickname()));
        });
    }

    @Override
    public List<SrmSupplierProductRespVO> getSupplierProductVOListByStatus(Integer status) {
        //TODO: only return when product is of that status
        List<SrmSupplierProductDO> list = supplierProductMapper.selectList();
        return BeanUtils.toBean(list, SrmSupplierProductRespVO.class);
    }

    @Override
    public SrmSupplierProductDO getDefaultSupplierProduct(Long supplierId, Long productId) {
        List<SrmSupplierProductDO> list = supplierProductMapper.selectListBySupplierIdAndProductId(supplierId, productId);
        if (list == null || list.isEmpty()) {
            return null;
        }
        // 过滤默认供应商
        return list.stream()
            .filter(SrmSupplierProductDO::getDefaultSupplier)
            .findFirst()
            .orElse(null);
    }

    private SrmSupplierProductDO getDefaultSupplierProductByProductId(Long productId) {
        List<SrmSupplierProductDO> list = supplierProductMapper.selectListDefaultByProductId(productId);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public Map<Long, SrmSupplierProductDO> getDefaultSupplierProductByProductIds(Set<Long> productIds) {
        Map<Long, SrmSupplierProductDO> result = new java.util.HashMap<>();
        if (productIds == null || productIds.isEmpty()) {
            return result;
        }
        List<SrmSupplierProductDO> all = supplierProductMapper.selectListDefaultByProductIds(productIds);
        all.stream()
            .collect(java.util.stream.Collectors.groupingBy(SrmSupplierProductDO::getProductId))
            .forEach((productId, list) -> result.put(productId, list.get(0)));
        productIds.forEach(pid -> result.computeIfAbsent(pid, k -> null));
        return result;
    }

}