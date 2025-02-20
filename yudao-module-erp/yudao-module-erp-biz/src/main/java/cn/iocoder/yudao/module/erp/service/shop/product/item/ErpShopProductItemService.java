package cn.iocoder.yudao.module.erp.service.shop.product.item;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * ERP 店铺产品项 Service 接口
 *
 * @author 索迈管理员
 */
public interface ErpShopProductItemService {

    /**
     * 创建ERP 店铺产品项
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createShopProductItem(@Valid ErpShopProductItemSaveReqVO createReqVO);

    /**
     * 更新ERP 店铺产品项
     *
     * @param updateReqVO 更新信息
     */
    void updateShopProductItem(@Valid ErpShopProductItemSaveReqVO updateReqVO);

    /**
     * 删除ERP 店铺产品项
     *
     * @param id 编号
     */
    void deleteShopProductItem(Long id);

    /**
     * 获得ERP 店铺产品项
     *
     * @param id 编号
     * @return ERP 店铺产品项
     */
    ErpShopProductItemDO getShopProductItem(Long id);

    /**
     * 获得ERP 店铺产品项分页
     *
     * @param pageReqVO 分页查询
     * @return ERP 店铺产品项分页
     */
    PageResult<ErpShopProductItemDO> getShopProductItemPage(ErpShopProductItemPageReqVO pageReqVO);

    /**
     * 获得ERP 店铺产品项列表, 用于 Excel 导出
     *
     * @param shopProductId 店铺产品ID
     * @return ERP 店铺产品项列表
     */
    List<ErpShopProductItemDO> getShopProductItemsByProductId(Long shopProductId);

    /**
     * 按ID集合获得全部Item
     **/
    List<ErpShopProductItemDO> getShopProductItemsByProductIds(List<Long> productIds);
}