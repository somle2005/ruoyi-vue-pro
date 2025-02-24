package cn.iocoder.yudao.module.erp.service.shop.product;

import java.util.*;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespSimpleVO;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.ErpShopProductItemRespVO;
import jakarta.validation.*;
import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import jakarta.validation.constraints.NotEmpty;

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
    * 根据店铺编号查询产品对应条目的分组
    *
    * @param productIds 店铺产品ID集合
    * @return 产品对应条目的分组
    */
    Map<Long,List<ErpShopProductItemRespVO>> getItemGroupMap(List<Long> productIds);

    /**
     * 更新店铺产品协同ERP产品明细
     **/
    void updateShopProductWithItems(@Valid ErpShopProductSaveReqVO updateReqVO);

    /**
     * 获得分页查询装配好的VO
     **/
    CommonResult<PageResult<ErpShopProductRespVO>> getShopProductPageVO(@Valid ErpShopProductPageReqVO pageReqVO);

    /**
     * 创建店铺产品协同ERP产品明细
     **/
    Long createShopProductWithItems(@Valid ErpShopProductSaveReqVO createReqVO);

    /**
     * 通过产品编码查询店铺产品
     **/
    ErpShopProductDO getShopProductByCode(@NotEmpty(message = "店铺产品编码不能为空") String code);
}