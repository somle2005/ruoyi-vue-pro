package cn.iocoder.yudao.module.erp.service.shop.product;

import java.util.*;
import jakarta.validation.*;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;

/**
 * ERP 店铺产品 Service 接口
 *
 * @author 索迈管理员
 */
public interface ErpShopProductService {

    /**
     * 创建ERP 店铺产品
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createShopProduct(@Valid ErpShopProductSaveReqVO createReqVO);

    /**
     * 更新ERP 店铺产品
     *
     * @param updateReqVO 更新信息
     */
    void updateShopProduct(@Valid ErpShopProductSaveReqVO updateReqVO);

    /**
     * 删除ERP 店铺产品
     *
     * @param id 编号
     */
    void deleteShopProduct(Long id);

    /**
     * 获得ERP 店铺产品
     *
     * @param id 编号
     * @return ERP 店铺产品
     */
    ErpShopProductDO getShopProduct(Long id);

    /**
     * 获得ERP 店铺产品分页
     *
     * @param pageReqVO 分页查询
     * @return ERP 店铺产品分页
     */
    PageResult<ErpShopProductDO> getShopProductPage(ErpShopProductPageReqVO pageReqVO);

    /**
     * 根据店铺编号查询产品
     *
     * @param id 店铺编号
     * @return 产品
     */
    List<ErpShopProductDO> selectByShopId(Long id);

    /**
    * 批量创建
    **/
    void batchCreate(List<ErpShopProductDO> listToCreate);

    /**
    * 批量更新
    **/
    void batchUpdate(List<ErpShopProductDO> listToUpdate);

    /**
    * 根据店铺编号查询产品
    *
    * @param id 店铺产品ID
    * @return 产品
    */
    ErpShopProductRespVO getShopProductWithItems(Long id);

    /**
     *
     **/
    void updateShopProductWithItems(@Valid ErpShopProductSaveReqVO updateReqVO);
}