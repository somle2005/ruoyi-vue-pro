package cn.iocoder.yudao.module.wms.controller.admin.stock.ownership.move;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.StreamX;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.module.wms.controller.admin.stock.ownership.move.item.vo.WmsStockOwnershipMoveItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.ownership.move.item.vo.WmsStockOwnershipMoveItemSaveReqVO;
import cn.iocoder.yudao.module.wms.controller.admin.stock.ownership.move.vo.*;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.ownership.move.WmsStockOwnershipMoveDO;
import cn.iocoder.yudao.module.wms.dal.dataobject.stock.ownership.move.item.WmsStockOwnershipMoveItemDO;
import cn.iocoder.yudao.module.wms.service.stock.ownership.move.WmsStockOwnershipMoveService;
import cn.iocoder.yudao.module.wms.service.stock.ownership.move.item.WmsStockOwnershipMoveItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;
import static cn.iocoder.yudao.module.wms.enums.WmsErrorCodeConstants.*;

@Tag(name = "所有者库存移动")
@RestController
@RequestMapping("/wms/stock-ownership-move")
@Validated
public class WmsStockOwnershipMoveController {

    @Resource()
    @Lazy()
    private WmsStockOwnershipMoveItemService stockOwnershipMoveItemService;

    @Resource
    private WmsStockOwnershipMoveService stockOwnershipMoveService;

    /**
     * @sign : E50BC63A85635F27
     */
    @PostMapping("/create")
    @Operation(summary = "创建所有者库存移动")
    @PreAuthorize("@ss.hasPermission('wms:stock-ownership-move:create')")
    public CommonResult<Long> createStockOwnershipMove(@Valid @RequestBody WmsStockOwnershipMoveSaveReqVO createReqVO) {
        return success(stockOwnershipMoveService.createStockOwnershipMove(createReqVO).getId());
    }

    // /**
    // * @sign : B17AAF1E8A33881D
    // */
    // @PutMapping("/update")
    // @Operation(summary = "更新所有者库存移动")
    // @PreAuthorize("@ss.hasPermission('wms:stock-ownership-move:update')")
    // public CommonResult<Boolean> updateStockOwnershipMove(@Valid @RequestBody WmsStockOwnershipMoveSaveReqVO updateReqVO) {
    // stockOwnershipMoveService.updateStockOwnershipMove(updateReqVO);
    // return success(true);
    // }
    // @DeleteMapping("/delete")
    // @Operation(summary = "删除所有者库存移动")
    // @Parameter(name = "id", description = "编号", required = true)
    // @PreAuthorize("@ss.hasPermission('wms:stock-ownership-move:delete')")
    // public CommonResult<Boolean> deleteStockOwnershipMove(@RequestParam("id") Long id) {
    // stockOwnershipMoveService.deleteStockOwnershipMove(id);
    // return success(true);
    // }
    /**
     * @sign : B7406A1F19B24A11
     */
    @GetMapping("/get")
    @Operation(summary = "获得所有者库存移动")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('wms:stock-ownership-move:query')")
    public CommonResult<WmsStockOwnershipMoveRespVO> getStockOwnershipMove(@RequestParam("id") Long id) {
        // 查询数据
        WmsStockOwnershipMoveDO stockOwnershipMove = stockOwnershipMoveService.getStockOwnershipMove(id);
        if (stockOwnershipMove == null) {
            throw exception(STOCK_OWNERSHIP_MOVE_NOT_EXISTS);
        }
        // 转换
        WmsStockOwnershipMoveRespVO stockOwnershipMoveVO = BeanUtils.toBean(stockOwnershipMove, WmsStockOwnershipMoveRespVO.class);
        // 组装所有者库存移动详情
        List<WmsStockOwnershipMoveItemDO> stockOwnershipMoveItemList = stockOwnershipMoveItemService.selectByOwnershipMoveId(stockOwnershipMoveVO.getId());
        stockOwnershipMoveVO.setItemList(BeanUtils.toBean(stockOwnershipMoveItemList, WmsStockOwnershipMoveItemRespVO.class));
        // 组装
        stockOwnershipMoveService.assembleWarehouse(List.of(stockOwnershipMoveVO));
        stockOwnershipMoveItemService.assembleProduct(stockOwnershipMoveVO.getItemList());
        stockOwnershipMoveItemService.assembleCompanyAndDept(stockOwnershipMoveVO.getItemList());

        // 返回
        return success(stockOwnershipMoveVO);
    }

    /**
     * @sign : 586BDA157BC07B30
     */
    @GetMapping("/page")
    @Operation(summary = "获得所有者库存移动分页")
    @PreAuthorize("@ss.hasPermission('wms:stock-ownership-move:query')")
    public CommonResult<PageResult<WmsStockOwnershipMoveRespVO>> getStockOwnershipMovePage(@Valid WmsStockOwnershipMovePageReqVO pageReqVO) {
        // 查询数据
        PageResult<WmsStockOwnershipMoveDO> doPageResult = stockOwnershipMoveService.getStockOwnershipMovePage(pageReqVO);
        // 转换
        PageResult<WmsStockOwnershipMoveRespVO> voPageResult = BeanUtils.toBean(doPageResult, WmsStockOwnershipMoveRespVO.class);
        // 组装
        stockOwnershipMoveService.assembleWarehouse(voPageResult.getList());
        // 返回
        return success(voPageResult);
    }
    // @GetMapping("/export-excel")
    // @Operation(summary = "导出所有者库存移动 Excel")
    // @PreAuthorize("@ss.hasPermission('wms:stock-ownership-move:export')")
    // @ApiAccessLog(operateType = EXPORT)
    // public void exportStockOwnershipMoveExcel(@Valid WmsStockOwnershipMovePageReqVO pageReqVO, HttpServletResponse response) throws IOException {
    // pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
    // List<WmsStockOwnershipMoveDO> list = stockOwnershipMoveService.getStockOwnershipMovePage(pageReqVO).getList();
    // // 导出 Excel
    // ExcelUtils.write(response, "所有者库存移动.xls", "数据", WmsStockOwnershipMoveRespVO.class, BeanUtils.toBean(list, WmsStockOwnershipMoveRespVO.class));
    // }


    @PostMapping("/import-excel")
    @Operation(summary = "导入产品归属移动清单")
    @PreAuthorize("@ss.hasPermission('wms:stock-ownership-move:import')")
    public CommonResult<Boolean> importExcel(@Valid WmsStockOwnershipMoveImportVO importReqVO) throws Exception {
        //
        List<WmsStockOwnershipMoveImportExcelVO> impVOList = ExcelUtils.read(importReqVO.getFile(), WmsStockOwnershipMoveImportExcelVO.class);
        // 识别代码
        stockOwnershipMoveItemService.assembleWarehouseForImp(impVOList);
        stockOwnershipMoveItemService.assembleCompanyAndDeptForImp(impVOList);
        stockOwnershipMoveItemService.assembleProductForImp(impVOList);

        // 校验仓库ID
        Set<Long> warehouseIds = StreamX.from(impVOList).filter(Objects::nonNull).toSet(WmsStockOwnershipMoveImportExcelVO::getWarehouseId);
        if(warehouseIds.size()!=1) {
            throw exception(STOCK_OWNERSHIP_MOVE_SINGLE_WAREHOUSE_ALLOW);
        }
        // 校验数据有效性
        for (WmsStockOwnershipMoveImportExcelVO excelVO : impVOList) {
            if(excelVO.getToCompanyId()==null) {
                throw exception(STOCK_OWNERSHIP_MOVE_ITEM_TO_COMPANY_ERROR);
            }
            if(excelVO.getToDeptId()==null) {
                throw exception(STOCK_OWNERSHIP_MOVE_ITEM_FROM_DEPT_ERROR);
            }
            if(excelVO.getFromCompanyId()==null) {
                throw exception(STOCK_OWNERSHIP_MOVE_ITEM_FROM_COMPANY_ERROR);
            }
            if(excelVO.getFromDeptId()==null) {
                throw exception(STOCK_OWNERSHIP_MOVE_ITEM_FROM_DEPT_ERROR);
            }
            if(excelVO.getProductId()==null) {
                throw exception(STOCK_OWNERSHIP_MOVE_ITEM_PRODUCT_ERROR,excelVO.getProductCode());
            }
        }

        WmsStockOwnershipMoveSaveReqVO saveReqVO = new WmsStockOwnershipMoveSaveReqVO();
        saveReqVO.setWarehouseId(warehouseIds.iterator().next());

        saveReqVO.setItemList(BeanUtils.toBean(impVOList, WmsStockOwnershipMoveItemSaveReqVO.class));

        stockOwnershipMoveService.createStockOwnershipMove(saveReqVO);

        return success(true);
    }

    @GetMapping("/download-template")
    @Operation(summary = "下载模板 库存归属")
    @PreAuthorize("@ss.hasPermission('wms:stock-ownership-move:download-template')")
    public ResponseEntity<byte[]> downloadExcelTemplate() throws IOException {
        ClassPathResource resource = new ClassPathResource("templates/ownership-move-import.xlsx");
        byte[] fileContent;
        try (InputStream inputStream = resource.getInputStream()) {
            fileContent = inputStream.readAllBytes();
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
        // 设置文件名
        String fileName = "库存归属模板.xlsx";
        headers.set(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + fileName + "\"");

        return ResponseEntity.ok()
                .headers(headers)
                .body(fileContent);
    }

}
