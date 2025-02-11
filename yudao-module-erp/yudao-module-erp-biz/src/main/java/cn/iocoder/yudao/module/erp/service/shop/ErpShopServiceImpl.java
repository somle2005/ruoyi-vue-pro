package cn.iocoder.yudao.module.erp.service.shop;

import cn.iocoder.yudao.framework.mybatis.core.query.LambdaQueryWrapperX;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;

import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;

import cn.iocoder.yudao.module.erp.dal.mysql.shop.ErpShopMapper;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.module.erp.enums.ErrorCodeConstants.*;

/**
 * ERP 店铺 Service 实现类
 *
 * @author c-tao
 */
@Service
@Validated
public class ErpShopServiceImpl implements ErpShopService {

    @Resource
    private ErpShopMapper shopMapper;

    @Override
    public Long createShop(ErpShopSaveReqVO createReqVO) {
        // 插入
        ErpShopDO shop = BeanUtils.toBean(createReqVO, ErpShopDO.class);
        shopMapper.insert(shop);
        // 返回
        return shop.getId();
    }

    @Override
    public void updateShop(ErpShopSaveReqVO updateReqVO) {
        // 校验存在
        validateShopExists(updateReqVO.getId());
        // 更新
        ErpShopDO updateObj = BeanUtils.toBean(updateReqVO, ErpShopDO.class);
        shopMapper.updateById(updateObj);
    }

    @Override
    public void deleteShop(Long id) {
        // 校验存在
        validateShopExists(id);
        // 删除
        shopMapper.deleteById(id);
    }

    private void validateShopExists(Long id) {
        if (shopMapper.selectById(id) == null) {
            throw exception(SHOP_NOT_EXISTS);
        }
    }

    /**
    * @Author LeeFJ
    * @Description 按平台和平台店铺uid查询店铺是否存在
    * @Date 15:11 2025/2/7
    * @Param platform 平台,枚举 SalesPlatform 的可选值
    * @return
    **/
    public ErpShopDO getByPlatform(String platform, String platformShopUid) {
        LambdaQueryWrapperX<ErpShopDO> wrapperX=new LambdaQueryWrapperX<>();
        wrapperX.eq(ErpShopDO::getPlatform,platform);
        wrapperX.eq(ErpShopDO::getPlatformShopUid,platformShopUid);
        return shopMapper.selectOne(wrapperX);
    }

    @Override
    public ErpShopDO getShop(Long id) {
        return shopMapper.selectById(id);
    }

    @Override
    public PageResult<ErpShopDO> getShopPage(ErpShopPageReqVO pageReqVO) {
        return shopMapper.selectPage(pageReqVO);
    }

}