package cn.iocoder.yudao.module.srm.service.purchase;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.srm.api.supplier.dto.SrmSupplierProductDTO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product.SrmSupplierProductPageReqVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product.SrmSupplierProductRespVO;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product.SrmSupplierProductSaveReqVO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmPurchaseOrderItemDO;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmSupplierProductDO;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ERP 供应商产品 Service 接口
 *
 * @author 索迈管理员
 */
public interface SrmSupplierProductService {

    /**
     * 创建ERP 供应商产品
     *
     * @param createReqVO 创建信息
     * @return 编号
     */
    Long createSupplierProduct(@Valid SrmSupplierProductSaveReqVO createReqVO);

    /**
     * 更新ERP 供应商产品
     *
     * @param updateReqVO 更新信息
     */
    void saveOrUpdateSupplierProduct(@Valid SrmSupplierProductSaveReqVO updateReqVO);

    //更新供应商产品DTO
    void saveOrUpdateSupplierProduct(SrmSupplierProductDTO dto);


    void updateSupplierProductPrice(Long supplierId, SrmPurchaseOrderItemDO orderItem, SrmPurchaseOrderDO srmPurchaseOrderDO);

    /**
     * 删除ERP 供应商产品
     *
     * @param id 编号
     */
    void deleteSupplierProduct(Long id);

    /**
     * 获得ERP 供应商产品
     *
     * @param id 编号
     * @return ERP 供应商产品
     */
    SrmSupplierProductDO getSupplierProduct(Long id);

    /**
     * 获得ERP 供应商产品分页
     *
     * @param pageReqVO 分页查询
     * @return ERP 供应商产品分页
     */
    PageResult<SrmSupplierProductDO> getSupplierProductPage(SrmSupplierProductPageReqVO pageReqVO);

    PageResult<SrmSupplierProductRespVO> buildSupplierProductVOPageResult(PageResult<SrmSupplierProductDO> pageResult);

    List<SrmSupplierProductRespVO> getSupplierProductVOListByStatus(Integer status);

    /**
     * 根据产品ID和供应商ID获取默认供应商产品（如有多条默认，取第一条）
     *
     * @param supplierId 供应商ID
     * @param productId  产品ID
     * @return 默认供应商产品DO，若无则返回null
     */
    SrmSupplierProductDO getDefaultSupplierProduct(Long supplierId, Long productId);

    /**
     * 根据产品ID集合获取每个产品的默认供应商产品（如有多条默认，取第一条）
     *
     * @param productIds 产品ID集合
     * @return key为产品ID，value为默认供应商产品DO，若无则为null
     */
    Map<Long, SrmSupplierProductDO> getDefaultSupplierProductByProductIds(Set<Long> productIds);
}