package cn.iocoder.yudao.module.tms.service.transfer;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.number.MoneyUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.item.vo.TmsTransferItemSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferAuditReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferOffStatusReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.transfer.vo.TmsTransferSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.TmsTransferDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.transfer.item.TmsTransferItemDO;
import cn.iocoder.yudao.module.tms.dal.mysql.transfer.TmsTransferMapper;
import cn.iocoder.yudao.module.tms.service.transfer.item.TmsTransferItemService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.*;
import static cn.iocoder.yudao.module.tms.enums.TmsErrorCodeConstants.TRANSFER_NOT_EXISTS;

/**
 * 调拨单 Service 实现类
 *
 * @author wdy
 */
@Service
@Validated
public class TmsTransferServiceImpl implements TmsTransferService {

    @Resource
    private TmsTransferMapper transferMapper;

    @Resource
    private TmsTransferItemService transferItemService;

    @Resource
    private ErpProductApi erpProductApi;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long createTransfer(TmsTransferSaveReqVO createReqVO) {
        // 1. 插入主表
        TmsTransferDO transfer = BeanUtils.toBean(createReqVO, TmsTransferDO.class);
        // 设置初始状态
//        transfer.setAuditStatus(0); // 待审核
//        transfer.setOutboundStatus(0); // 待出库
//        transfer.setInboundStatus(0); // 待入库
        // 计算总数量、总重量等信息
        calculateTotalInfo(transfer, createReqVO.getItems());
        transferMapper.insert(transfer);

        // 2. 插入明细表
        createReqVO.getItems().forEach(item -> {
            item.setTransferId(transfer.getId());
            transferItemService.createTransferItem(item);
        });

        // 返回主表ID
        return transfer.getId();
    }

    /**
     * 计算调拨单的总数量、总重量等信息
     *
     * @param transfer 调拨单
     * @param items    明细列表
     */
    private void calculateTotalInfo(TmsTransferDO transfer, List<TmsTransferItemSaveReqVO> items) {
        // 初始化总数量
        transfer.setTotalQty(0);
        // 初始化总重量
        transfer.setTotalWeight(BigDecimal.ZERO);
        // 初始化总体积
        transfer.setTotalVolume(BigDecimal.ZERO);

        if (CollUtil.isEmpty(items)) {
            return;
        }

        // 1. 获取所有产品ID
        List<Long> productIds = convertList(items, TmsTransferItemSaveReqVO::getProductId);
        if (CollUtil.isEmpty(productIds)) {
            return;
        }

        // 2. 批量获取产品信息
        Map<Long, ErpProductDTO> productMap = convertMap(erpProductApi.listProductDTOs(productIds), ErpProductDTO::getId);

        // 3. 计算总重量和总体积
        BigDecimal totalWeight = BigDecimal.ZERO;
        BigDecimal totalVolume = BigDecimal.ZERO;

        for (TmsTransferItemSaveReqVO item : items) {
            ErpProductDTO product = productMap.get(item.getProductId());
            if (product != null) {
                // 累加总数量
                transfer.setTotalQty(transfer.getTotalQty() + item.getQty());

                // 计算单个产品的总重量 = 产品重量 * 数量
                if (product.getWeight() != null) {
                    totalWeight = totalWeight.add(
                        MoneyUtils.priceMultiply(product.getWeight(), new BigDecimal(item.getQty()))
                    );
                }

                // 计算单个产品的总体积 = (长 * 宽 * 高) * 数量（单位：立方毫米）
                if (product.getLength() != null && product.getWidth() != null && product.getHeight() != null) {
                    BigDecimal itemVolume = new BigDecimal(product.getLength())
                        .multiply(new BigDecimal(product.getWidth()))
                        .multiply(new BigDecimal(product.getHeight()));
                    totalVolume = totalVolume.add(
                        MoneyUtils.priceMultiply(itemVolume, new BigDecimal(item.getQty()))
                    );
                }
            }
        }

        // 4. 设置总重量和总体积
        transfer.setTotalWeight(totalWeight);
        transfer.setTotalVolume(totalVolume);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateTransfer(TmsTransferSaveReqVO updateReqVO) {
        // 校验存在
        TmsTransferDO transfer = validateTransferExists(updateReqVO.getId());

        // 1. 更新主表
        TmsTransferDO updateObj = BeanUtils.toBean(updateReqVO, TmsTransferDO.class);
        // 计算总数量、总重量等信息
        calculateTotalInfo(updateObj, updateReqVO.getItems());
        transferMapper.updateById(updateObj);

        // 2. 更新明细表
        if (CollUtil.isNotEmpty(updateReqVO.getItems())) {
            List<TmsTransferItemDO> oldList = transferItemService.getTransferItemListByTransferId(updateReqVO.getId());
            List<TmsTransferItemDO> newList = BeanUtils.toBean(updateReqVO.getItems(), TmsTransferItemDO.class);

            List<List<TmsTransferItemDO>> diffList = diffList(oldList, newList, (oldVal, newVal) -> oldVal.getId().equals(newVal.getId()));

            if (CollUtil.isNotEmpty(diffList.get(0))) {
                diffList.get(0).forEach(o -> o.setTransferId(updateReqVO.getId()));
                transferItemService.createTransferItemList(diffList.get(0));
            }
            if (CollUtil.isNotEmpty(diffList.get(1))) {
                transferItemService.updateTransferItemList(diffList.get(1));
            }
            if (CollUtil.isNotEmpty(diffList.get(2))) {
                transferItemService.deleteTransferItemList(convertList(diffList.get(2), TmsTransferItemDO::getId));
            }
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteTransfer(Long id) {
        // 校验存在
        TmsTransferDO transfer = validateTransferExists(id);

        // 1. 删除主表
        transferMapper.deleteById(id);

        // 2. 删除明细表
        transferItemService.deleteTransferItemByTransferId(id);
    }

    @Override
    public TmsTransferDO getTransfer(Long id) {
        return transferMapper.selectById(id);
    }

    @Override
    public TmsTransferDO validateTransferExists(Long id) {
        TmsTransferDO transfer = transferMapper.selectById(id);
        if (transfer == null) {
            throw exception(TRANSFER_NOT_EXISTS);
        }
        return transfer;
    }

    @Override
    public PageResult<TmsTransferDO> getTransferPage(TmsTransferPageReqVO pageReqVO) {
        return null;
    }

    @Override
    public void switchOpen(TmsTransferOffStatusReqVO reqVO) {

    }

    @Override
    public void review(TmsTransferAuditReqVO reqVO) {

    }

    @Override
    public void submitAudit(List<Long> transferIds) {

    }

}