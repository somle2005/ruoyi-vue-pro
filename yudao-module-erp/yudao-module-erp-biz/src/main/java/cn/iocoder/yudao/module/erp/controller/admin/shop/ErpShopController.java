package cn.iocoder.yudao.module.erp.controller.admin.shop;

import com.somle.framework.common.model.ValidationGroup;
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

import cn.iocoder.yudao.module.erp.controller.admin.shop.vo.*;
import cn.iocoder.yudao.module.erp.dal.dataobject.shop.ErpShopDO;
import cn.iocoder.yudao.module.erp.service.shop.ErpShopService;

@Tag(name = "管理后台 - ERP 店铺")
@RestController
@RequestMapping("/erp/shop")
@Validated
public class ErpShopController {

    @Resource
    private ErpShopService shopService;

    @PostMapping("/create")
    @Operation(summary = "创建ERP 店铺")
    @PreAuthorize("@ss.hasPermission('erp:shop:create')")
    public CommonResult<Long> createShop(@Validated(value = {ValidationGroup.create.class}) @RequestBody ErpShopSaveReqVO createReqVO) {
        return success(shopService.createShop(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 店铺")
    @PreAuthorize("@ss.hasPermission('erp:shop:update')")
    public CommonResult<Boolean> updateShop(@Validated(value = {ValidationGroup.update.class}) @RequestBody ErpShopSaveReqVO updateReqVO) {
        shopService.updateShop(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除ERP 店铺")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:shop:delete')")
    public CommonResult<Boolean> deleteShop(@RequestParam("id") Long id) {
        shopService.deleteShop(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得ERP 店铺")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:shop:query')")
    public CommonResult<ErpShopRespVO> getShop(@RequestParam("id") Long id) {
        ErpShopDO shop = shopService.getShop(id);
        return success(BeanUtils.toBean(shop, ErpShopRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得ERP 店铺分页")
    @PreAuthorize("@ss.hasPermission('erp:shop:query')")
    public CommonResult<PageResult<ErpShopRespVO>> getShopPage(@Valid ErpShopPageReqVO pageReqVO) {
        PageResult<ErpShopDO> pageResult = shopService.getShopPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ErpShopRespVO.class));
    }

    @GetMapping("/list")
    @Operation(summary = "获得ERP 店铺分页")
    @PreAuthorize("@ss.hasPermission('erp:shop:query')")
    public CommonResult<List<ErpShopDO>> getShopList(@Valid ErpShopPageReqVO pageReqVO) {
        List<ErpShopDO> pageResult = shopService.getShopList(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ErpShopDO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出ERP 店铺 Excel")
    @PreAuthorize("@ss.hasPermission('erp:shop:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportShopExcel(@Valid ErpShopPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ErpShopDO> list = shopService.getShopPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "ERP 店铺.xls", "数据", ErpShopRespVO.class,
                        BeanUtils.toBean(list, ErpShopRespVO.class));
    }

}