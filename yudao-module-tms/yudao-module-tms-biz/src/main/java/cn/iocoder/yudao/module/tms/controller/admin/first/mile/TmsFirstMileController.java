package cn.iocoder.yudao.module.tms.controller.admin.first.mile;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.framework.idempotent.core.annotation.Idempotent;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMileRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.TmsFirstMileSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.fee.TmsFeeDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.TmsFirstMileDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.first.mile.TmsFirstMileService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - 头程单")
@RestController
@RequestMapping("/tms/first-mile")
@Validated
public class TmsFirstMileController {

    @Resource
    private TmsFirstMileService firstMileService;

    @PostMapping("/create")
    @Operation(summary = "创建头程单")
    @Idempotent
    @PreAuthorize("@ss.hasPermission('tms:first-mile:create')")
    public CommonResult<Long> createFirstMile(@Valid @RequestBody TmsFirstMileSaveReqVO createReqVO) {
        return success(firstMileService.createFirstMile(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新头程单")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:update')")
    public CommonResult<Boolean> updateFirstMile(@Valid @RequestBody TmsFirstMileSaveReqVO updateReqVO) {
        firstMileService.updateFirstMile(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除头程单")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('tms:first-mile:delete')")
    public CommonResult<Boolean> deleteFirstMile(@RequestParam("id") Long id) {
        firstMileService.deleteFirstMile(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得头程单")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('tms:first-mile:query')")
    public CommonResult<TmsFirstMileRespVO> getFirstMile(@RequestParam("id") Long id) {
        TmsFirstMileDO firstMile = firstMileService.getFirstMile(id);
        return success(BeanUtils.toBean(firstMile, TmsFirstMileRespVO.class));
    }

    @PostMapping("/page")
    @Operation(summary = "获得头程单分页")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:query')")
    public CommonResult<PageResult<TmsFirstMileRespVO>> getFirstMilePage(@Valid @RequestBody TmsFirstMilePageReqVO pageReqVO) {
        PageResult<TmsFirstMileBO> pageResult = firstMileService.getFirstMileBOPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, TmsFirstMileRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出头程单 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportFirstMileExcel(@Valid TmsFirstMilePageReqVO pageReqVO, HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<TmsFirstMileBO> list = firstMileService.getFirstMileBOPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "头程单.xls", "数据", TmsFirstMileRespVO.class, BeanUtils.toBean(list, TmsFirstMileRespVO.class));
    }

    @PostMapping("/import-excel")
    @Operation(summary = "导入头程单 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:import')")
    public CommonResult<Boolean> importFirstMileExcel(@RequestParam("file") MultipartFile file) throws Exception {
        List<TmsFirstMileSaveReqVO> list = ExcelUtils.read(file, TmsFirstMileSaveReqVO.class);
        // 可根据业务需要批量保存或校验
        return success(true);
    }

    // ==================== 子表（头程单明细） ====================

    @GetMapping("/first-mile-item/list-by-first-mile-id")
    @Operation(summary = "获得头程单明细列表")
    @Parameter(name = "firstMileId", description = "头程主表ID")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:query')")
    public CommonResult<List<TmsFirstMileItemDO>> getFirstMileItemListByFirstMileId(@RequestParam("firstMileId") Long firstMileId) {
        return success(firstMileService.getFirstMileItemListByFirstMileId(firstMileId));
    }

    // ==================== 子表（出运订单费用明细） ====================

    @GetMapping("/fee/list-by-source-id")
    @Operation(summary = "获得出运订单费用明细列表")
    @Parameter(name = "sourceId", description = "原单ID;出运订单ID、调拨单ID")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:query')")
    public CommonResult<List<TmsFeeDO>> getFeeListBySourceId(@RequestParam("sourceId") Long sourceId) {
        return success(firstMileService.getFeeListBySourceId(sourceId));
    }

}