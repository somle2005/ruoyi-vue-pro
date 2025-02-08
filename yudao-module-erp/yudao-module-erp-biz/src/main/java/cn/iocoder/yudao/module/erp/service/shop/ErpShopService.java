package cn.iocoder.yudao.module.erp.service.shop;

import com.somle.framework.domain.sales.SalesPlatform;
import jakarta.validation.*;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

/**
 * ERP 店铺 Service 接口
 *
 * @author c-tao
 */
public interface ErpShopService {

    /**
     * 创建ERP 店铺
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createShop(@Valid ErpShopSaveReqVO createReqVO);

    /**
     * 更新ERP 店铺
     *
     * @param updateReqVO 更新信息
     */
    void updateShop(@Valid ErpShopSaveReqVO updateReqVO);

    /**
     * 删除ERP 店铺
     *
     * @param id 编号
     */
    void deleteShop(Long id);

    /**
     * 验证ERP 店铺是否存在
     *
     * @param platform 平台
     * @param platformShopUid 平台店铺编号
     * @return 是否存在
     */
    ErpShopDO getByPlatform(SalesPlatform platform, String platformShopUid);

    /**
     * 获得ERP 店铺
     *
     * @param id 编号
     * @return ERP 店铺
     */
    ErpShopDO getShop(Long id);

    /**
     * 获得ERP 店铺分页
     *
     * @param pageReqVO 分页查询
     * @return ERP 店铺分页
     */
    PageResult<ErpShopDO> getShopPage(ErpShopPageReqVO pageReqVO);

}