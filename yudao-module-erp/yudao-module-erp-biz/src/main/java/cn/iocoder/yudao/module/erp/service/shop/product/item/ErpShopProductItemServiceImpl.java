package cn.iocoder.yudao.module.erp.service.shop.product.item;

import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.erp.dal.mysql.shop.product.item.ErpShopProductItemMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

/**
 * ERP 店铺产品项 Service 实现类
 *
 * @author 索迈管理员
 */
@Service
@Validated
public class ErpShopProductItemServiceImpl implements ErpShopProductItemService {

    @Resource
    private ErpShopProductItemMapper shopProductItemMapper;

    @Override
    public Long createShopProductItem(ErpShopProductItemSaveReqVO createReqVO) {
        // 插入
        ErpShopProductItemDO shopProductItem = BeanUtils.toBean(createReqVO, ErpShopProductItemDO.class);
        shopProductItemMapper.insert(shopProductItem);
        // 返回
        return shopProductItem.getId();
    }

    @Override
    public void updateShopProductItem(ErpShopProductItemSaveReqVO updateReqVO) {
        // 校验存在
        validateShopProductItemExists(updateReqVO.getId());
        // 更新
        ErpShopProductItemDO updateObj = BeanUtils.toBean(updateReqVO, ErpShopProductItemDO.class);
        shopProductItemMapper.updateById(updateObj);
    }

    @Override
    public void deleteShopProductItem(Long id) {
        // 校验存在
        validateShopProductItemExists(id);
        // 删除
        shopProductItemMapper.deleteById(id);
    }

    private void validateShopProductItemExists(Long id) {
        if (shopProductItemMapper.selectById(id) == null) {
            throw exception(SHOP_PRODUCT_ITEM_NOT_EXISTS);
        }
    }

    @Override
    public ErpShopProductItemDO getShopProductItem(Long id) {
        return shopProductItemMapper.selectById(id);
    }

    @Override
    public PageResult<ErpShopProductItemDO> getShopProductItemPage(ErpShopProductItemPageReqVO pageReqVO) {
        return shopProductItemMapper.selectPage(pageReqVO);
    }

}