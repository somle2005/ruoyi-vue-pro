package cn.iocoder.yudao.module.srm.controller.admin.purchase;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.enums.CommonStatusEnum;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product.*;
import cn.iocoder.yudao.module.srm.dal.dataobject.purchase.SrmSupplierProductDO;
import cn.iocoder.yudao.module.srm.service.purchase.SrmSupplierProductService;
import cn.iocoder.yudao.module.system.api.utils.Validation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - ERP 供应商产品")
@RestController
@RequestMapping("/srm/supplier-product")
@Validated
public class SrmSupplierProductController {

    @Resource
    private SrmSupplierProductService supplierProductService;

    @PostMapping("/create")
    @Operation(summary = "创建ERP 供应商产品")
    @PreAuthorize("@ss.hasPermission('srm:supplier-product:create')")
    public CommonResult<Long> createSupplierProduct(@Validated(Validation.OnCreate.class) @RequestBody SrmSupplierProductSaveReqVO createReqVO) {
        return success(supplierProductService.createSupplierProduct(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 供应商产品")
    @PreAuthorize("@ss.hasPermission('srm:supplier-product:update')")
    public CommonResult<Boolean> updateSupplierProduct(@Validated(Validation.OnUpdate.class) @RequestBody SrmSupplierProductSaveReqVO updateReqVO) {
        supplierProductService.saveOrUpdateSupplierProduct(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除ERP 供应商产品")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('srm:supplier-product:delete')")
    public CommonResult<Boolean> deleteSupplierProduct(@RequestParam("id") Long id) {
        supplierProductService.deleteSupplierProduct(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得ERP 供应商产品")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('srm:supplier-product:query')")
    public CommonResult<SrmSupplierProductRespVO> getSupplierProduct(@RequestParam("id") Long id) {
        SrmSupplierProductDO supplierProduct = supplierProductService.getSupplierProduct(id);
        return success(BeanUtils.toBean(supplierProduct, SrmSupplierProductRespVO.class));
    }

    //根据产品+供应商ID，来拿到默认的供应商产品-上一次成交价格 

    @GetMapping("/get-default-last-price")
    @Operation(summary = "根据产品+供应商ID获取默认供应商产品的上一次成交价格")
    @PreAuthorize("@ss.hasPermission('srm:supplier-product:query')")
    public CommonResult<BigDecimal> getDefaultSupplierProductLastPrice(
        @RequestParam("supplierId") @NotNull(message = "供应商ID不能为空") Long supplierId,
        @RequestParam("productId") @NotNull(message = "产品ID不能为空") Long productId) {
        SrmSupplierProductDO supplierProduct = supplierProductService.getDefaultSupplierProduct(supplierId, productId);
        return success(supplierProduct != null ? supplierProduct.getLastPurchasePrice() : null);
    }

    @PostMapping("/batch-default-last-price")
    @Operation(summary = "批量获取产品+供应商的上一次成交价，返回列表")
    public CommonResult<SrmSupplierProductBatchLastPriceRespVO> batchGetDefaultLastPrice(@Validated @RequestBody List<SrmSupplierProductDefaultLastPriceQueryVO> queryList) {
        SrmSupplierProductBatchLastPriceRespVO respVO = new SrmSupplierProductBatchLastPriceRespVO();
        List<SrmSupplierProductBatchLastPriceRespVO.Item> items = new java.util.ArrayList<>();
        if (queryList != null) {
            for (SrmSupplierProductDefaultLastPriceQueryVO query : queryList) {
                SrmSupplierProductDO supplierProduct = supplierProductService.getDefaultSupplierProduct(query.getSupplierId(), query.getProductId());
                SrmSupplierProductBatchLastPriceRespVO.Item item = new SrmSupplierProductBatchLastPriceRespVO.Item();
                item.setProductId(query.getProductId());
                item.setSupplierId(query.getSupplierId());
                item.setLastPrice(supplierProduct != null ? supplierProduct.getLastPurchasePrice() : null);
                items.add(item);
            }
        }
        respVO.setItems(items);
        return success(respVO);
    }


    @GetMapping("/page")
    @Operation(summary = "获得ERP 供应商产品分页")
    @PreAuthorize("@ss.hasPermission('srm:supplier-product:query')")
    public CommonResult<PageResult<SrmSupplierProductRespVO>> getSupplierProductPage(@Valid SrmSupplierProductPageReqVO pageReqVO) {
        PageResult<SrmSupplierProductDO> pageResult = supplierProductService.getSupplierProductPage(pageReqVO);
        return success(supplierProductService.buildSupplierProductVOPageResult(pageResult));
    }

    @GetMapping("/simple-list")
    @Operation(summary = "获得ERP 供应商产品精简列表", description = "只包含被开启的产品，主要用于前端的下拉选项")
    public CommonResult<List<SrmSupplierProductRespVO>> getProductSimpleList() {
        List<SrmSupplierProductRespVO> list = supplierProductService.getSupplierProductVOListByStatus(CommonStatusEnum.ENABLE.getStatus());
        return success(list);
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出ERP 供应商产品 Excel")
    @PreAuthorize("@ss.hasPermission('srm:supplier-product:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportSupplierProductExcel(@Valid SrmSupplierProductPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<SrmSupplierProductRespVO> list = supplierProductService.buildSupplierProductVOPageResult(supplierProductService.getSupplierProductPage(pageReqVO)).getList();
        // 导出 Excel
        ExcelUtils.writeWithRequestAttributesTimeZone(response, "ERP 供应商产品.xls", "数据", SrmSupplierProductRespVO.class, BeanUtils.toBean(list, SrmSupplierProductRespVO.class));
    }

}