package cn.iocoder.yudao.module.erp.service.shop;

import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.ErpShopProductRespVO;
import jakarta.validation.*;
import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
     * @Author LeeFJ
     * @Description 按平台和平台店铺uid查询店铺是否存在
     * @Date 15:11 2025/2/7
     * @Param platform 平台,枚举 SalesPlatform 的可选值
     * @return
     **/
    public ErpShopDO getByPlatform(String platform, String platformShopUid);

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

    /**
     * 按ShopId集合获取全部不店铺
     **/
    Map<Long, ErpShopRespVO> getShopMapByIds(Set<Long> shopIds);
}