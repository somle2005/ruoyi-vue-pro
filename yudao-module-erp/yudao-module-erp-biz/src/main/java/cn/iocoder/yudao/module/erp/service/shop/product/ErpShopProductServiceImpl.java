package cn.iocoder.yudao.module.erp.service.shop.product;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespSimpleVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemSaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import cn.iocoder.yudao.module.erp.service.product.ErpProductService;
import cn.iocoder.yudao.module.erp.service.shop.product.item.ErpShopProductItemService;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.erp.dal.mysql.shop.product.ErpShopProductMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.error;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

/**
 * ERP 店铺产品 Service 实现类
 *
 * @author 索迈管理员
 */
@Service
@Validated
public class ErpShopProductServiceImpl implements ErpShopProductService {

    @Resource
    private ErpShopProductMapper shopProductMapper;

    @Resource
    private ErpShopProductItemService shopProductItemService;

    @Resource
    private ErpProductService productService;

    @Override
    public Long createShopProduct(ErpShopProductSaveReqVO createReqVO) {
        // 插入
        ErpShopProductDO shopProduct = BeanUtils.toBean(createReqVO, ErpShopProductDO.class);
        shopProductMapper.insert(shopProduct);
        // 返回
        return shopProduct.getId();
    }

    @Override
    public void updateShopProduct(ErpShopProductSaveReqVO updateReqVO) {
        // 校验存在
        validateShopProductExists(updateReqVO.getId());
        // 更新
        ErpShopProductDO updateObj = BeanUtils.toBean(updateReqVO, ErpShopProductDO.class);
        shopProductMapper.updateById(updateObj);
    }

    @Override
    public void deleteShopProduct(Long id) {
        // 校验存在
        validateShopProductExists(id);
        // 删除
        shopProductMapper.deleteById(id);
    }

    private void validateShopProductExists(Long id) {
        if (shopProductMapper.selectById(id) == null) {
            throw exception(SHOP_PRODUCT_NOT_EXISTS);
        }
    }

    @Override
    public ErpShopProductDO getShopProduct(Long id) {
        return shopProductMapper.selectById(id);
    }

    @Override
    public PageResult<ErpShopProductDO> getShopProductPage(ErpShopProductPageReqVO pageReqVO) {
        return shopProductMapper.selectPage(pageReqVO);
    }

    @Override
    public List<ErpShopProductDO> selectByShopId(Long id) {
        return shopProductMapper.selectList(
            LambdaQueryWrapperX.create(ErpShopProductDO.class).eq(ErpShopProductDO::getShopId,id)
        );
    }

    @Override
    public void batchCreate(List<ErpShopProductDO> listToCreate) {
        shopProductMapper.insertBatch(listToCreate);
    }

    @Override
    public void batchUpdate(List<ErpShopProductDO> listToUpdate) {
        shopProductMapper.updateBatch(listToUpdate);
    }

    /**
     * 根据店铺编号查询产品
     *
     * @param id 店铺产品ID
     * @return 产品
     */
    @Override
    public ErpShopProductRespVO getShopProductWithItems(Long id) {
        ErpShopProductDO shopProduct = this.getShopProduct(id);
        if (shopProduct == null) {
            throw exception(SHOP_PRODUCT_NOT_EXISTS);
        }
        ErpShopProductRespVO respVO = BeanUtils.toBean(shopProduct, ErpShopProductRespVO.class);
        List<ErpShopProductItemDO> items = shopProductItemService.getShopProductItemsByProductId(shopProduct.getId());
        List<ErpShopProductItemRespVO> itemRespVOS=BeanUtils.toBean(items, ErpShopProductItemRespVO.class);
        List<ErpProductRespVO> productList= productService.getProductVOList(StreamX.from(items).map(ErpShopProductItemDO::getProductId).toList());
        List<ErpProductRespSimpleVO> simpleProductList = BeanUtils.toBean(productList, ErpProductRespSimpleVO.class);
        StreamX.from(itemRespVOS).assemble(simpleProductList,ErpProductRespSimpleVO::getId,ErpShopProductItemRespVO::getProductId,ErpShopProductItemRespVO::setProduct);
        respVO.setItems(itemRespVOS);
        return respVO;
    }

    @Override
    public Map<Long, List<ErpShopProductItemRespVO>> getItemGroupMap(List<Long> productIds) {
        if(CollectionUtils.isEmpty(productIds)) {
            return Map.of();
        }
        List<ErpShopProductItemDO> itemsInDB=shopProductItemService.getShopProductItemsByProductIds(productIds);
        List<ErpShopProductItemRespVO> respItemsVOs=BeanUtils.toBean(itemsInDB, ErpShopProductItemRespVO.class);
        List<ErpProductRespVO> productList= productService.getProductVOList(StreamX.from(itemsInDB).map(ErpShopProductItemDO::getProductId).toList());
        Map<Long,ErpProductRespSimpleVO> productMap= StreamX.from(productList).toMap(ErpProductRespVO::getId, t->BeanUtils.toBean(t, ErpProductRespSimpleVO.class));
        StreamX.from(respItemsVOs).assemble(productMap,ErpShopProductItemRespVO::getProductId,ErpShopProductItemRespVO::setProduct);
        Map<Long,List<ErpShopProductItemRespVO>> itemsGroup=StreamX.from(respItemsVOs).groupBy(ErpShopProductItemRespVO::getShopProductId);
        return itemsGroup;
    }

    @Override
    @Transactional
    public void updateShopProductWithItems(ErpShopProductSaveReqVO updateReqVO) {
        // 保存主表
        this.updateShopProduct(updateReqVO);
        // 处理重表数据
        List<ErpShopProductItemDO> itemsInDB = shopProductItemService.getShopProductItemsByProductId(updateReqVO.getId());
        Set<Long> itemIdsInDB = StreamX.from(itemsInDB).toSet(ErpShopProductItemDO::getId);
        Set<Long> itemIdsToDelete = new HashSet<>(itemIdsInDB);

        // 循环处理
        for (ErpShopProductItemSaveReqVO itemVO : updateReqVO.getItems()) {
            // 此ID不使用前端传入的ID
            itemVO.setShopProductId(updateReqVO.getId());
            // id为空的需要新增
            if(itemVO.getId()==null) {
                shopProductItemService.createShopProductItem(itemVO);
            } else {
                shopProductItemService.updateShopProductItem(itemVO);
            }
            // 移除不需要删除的ID
            itemIdsToDelete.remove(itemVO.getId());
        }

        // 删除需要删除的
        for (Long itemId : itemIdsToDelete) {
            shopProductItemService.deleteShopProductItem(itemId);
        }




    }

}