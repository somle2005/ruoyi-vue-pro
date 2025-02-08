package cn.iocoder.yudao.module.erp.controller.admin.shop.product;

import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.constraints.*;
import jakarta.validation.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;

import cn.iocoder.yudao.module.erp.controller.admin.shop.product.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.ErpShopProductDO;
import cn.iocoder.yudao.module.erp.service.shop.product.ErpShopProductService;

@Tag(name = "管理后台 - ERP 店铺产品")
@RestController
@RequestMapping("/erp/shop-product")
@Validated
public class ErpShopProductController {

    @Resource
    private ErpShopProductService shopProductService;

    @PostMapping("/create")
    @Operation(summary = "创建ERP 店铺产品")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:create')")
    public CommonResult<Long> createShopProduct(@Valid @RequestBody ErpShopProductSaveReqVO createReqVO) {
        return success(shopProductService.createShopProduct(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 店铺产品")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:update')")
    public CommonResult<Boolean> updateShopProduct(@Valid @RequestBody ErpShopProductSaveReqVO updateReqVO) {
        shopProductService.updateShopProduct(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除ERP 店铺产品")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:shop-product:delete')")
    public CommonResult<Boolean> deleteShopProduct(@RequestParam("id") Long id) {
        shopProductService.deleteShopProduct(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得ERP 店铺产品")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:query')")
    public CommonResult<ErpShopProductRespVO> getShopProduct(@RequestParam("id") Long id) {
        ErpShopProductDO shopProduct = shopProductService.getShopProduct(id);
        return success(BeanUtils.toBean(shopProduct, ErpShopProductRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得ERP 店铺产品分页")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:query')")
    public CommonResult<PageResult<ErpShopProductRespVO>> getShopProductPage(@Valid ErpShopProductPageReqVO pageReqVO) {
        PageResult<ErpShopProductDO> pageResult = shopProductService.getShopProductPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ErpShopProductRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出ERP 店铺产品 Excel")
    @PreAuthorize("@ss.hasPermission('erp:shop-product:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportShopProductExcel(@Valid ErpShopProductPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ErpShopProductDO> list = shopProductService.getShopProductPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "ERP 店铺产品.xls", "数据", ErpShopProductRespVO.class,
                        BeanUtils.toBean(list, ErpShopProductRespVO.class));
    }

}