package cn.iocoder.yudao.module.erp.controller.admin.shop.product.item;

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

import cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.product.item.ErpShopProductItemDO;
import cn.iocoder.yudao.module.erp.service.shop.product.item.ErpShopProductItemService;

@Tag(name = "管理后台 - ERP 店铺产品项")
@RestController
@RequestMapping("/erp/shop-product-item")
@Validated
public class ErpShopProductItemController {

    @Resource
    private ErpShopProductItemService shopProductItemService;

    @PostMapping("/create")
    @Operation(summary = "创建ERP 店铺产品项")
    @PreAuthorize("@ss.hasPermission('erp:shop-product-item:create')")
    public CommonResult<Long> createShopProductItem(@Valid @RequestBody ErpShopProductItemSaveReqVO createReqVO) {
        return success(shopProductItemService.createShopProductItem(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 店铺产品项")
    @PreAuthorize("@ss.hasPermission('erp:shop-product-item:update')")
    public CommonResult<Boolean> updateShopProductItem(@Valid @RequestBody ErpShopProductItemSaveReqVO updateReqVO) {
        shopProductItemService.updateShopProductItem(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除ERP 店铺产品项")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:shop-product-item:delete')")
    public CommonResult<Boolean> deleteShopProductItem(@RequestParam("id") Long id) {
        shopProductItemService.deleteShopProductItem(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得ERP 店铺产品项")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:shop-product-item:query')")
    public CommonResult<ErpShopProductItemRespVO> getShopProductItem(@RequestParam("id") Long id) {
        ErpShopProductItemDO shopProductItem = shopProductItemService.getShopProductItem(id);
        return success(BeanUtils.toBean(shopProductItem, ErpShopProductItemRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得ERP 店铺产品项分页")
    @PreAuthorize("@ss.hasPermission('erp:shop-product-item:query')")
    public CommonResult<PageResult<ErpShopProductItemRespVO>> getShopProductItemPage(@Valid ErpShopProductItemPageReqVO pageReqVO) {
        PageResult<ErpShopProductItemDO> pageResult = shopProductItemService.getShopProductItemPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ErpShopProductItemRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出ERP 店铺产品项 Excel")
    @PreAuthorize("@ss.hasPermission('erp:shop-product-item:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportShopProductItemExcel(@Valid ErpShopProductItemPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ErpShopProductItemDO> list = shopProductItemService.getShopProductItemPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "ERP 店铺产品项.xls", "数据", ErpShopProductItemRespVO.class,
                        BeanUtils.toBean(list, ErpShopProductItemRespVO.class));
    }

}