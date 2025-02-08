package cn.iocoder.yudao.module.erp.service.shop.product;

import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
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

    }

}