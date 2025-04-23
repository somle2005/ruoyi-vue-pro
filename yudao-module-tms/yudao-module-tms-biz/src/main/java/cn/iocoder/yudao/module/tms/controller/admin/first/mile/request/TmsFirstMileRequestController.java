package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.framework.idempotent.core.annotation.Idempotent;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.TmsFirstMileRequestSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.TmsFirstMileRequestDO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequestItemDO;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestService;
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

@Tag(name = "管理后台 - 头程申请单")
@RestController
@RequestMapping("/tms/first-mile-request")
@Validated
public class TmsFirstMileRequestController {

    @Resource
    private TmsFirstMileRequestService firstMileRequestService;

    @PostMapping("/create")
    @Operation(summary = "创建头程申请单")
    @Idempotent
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:create')")
    public CommonResult<Long> createFirstMileRequest(@Valid @RequestBody TmsFirstMileRequestSaveReqVO createReqVO) {
        return success(firstMileRequestService.createFirstMileRequest(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新头程申请单")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:update')")
    public CommonResult<Boolean> updateFirstMileRequest(@Validated @RequestBody TmsFirstMileRequestSaveReqVO updateReqVO) {
        firstMileRequestService.updateFirstMileRequest(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除头程申请单")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:delete')")
    public CommonResult<Boolean> deleteFirstMileRequest(@RequestParam("id") Long id) {
        firstMileRequestService.deleteFirstMileRequest(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得头程申请单")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:query')")
    public CommonResult<TmsFirstMileRequestRespVO> getFirstMileRequest(@RequestParam("id") Long id) {
        TmsFirstMileRequestDO firstMileRequest = firstMileRequestService.getFirstMileRequest(id);
        return success(BeanUtils.toBean(firstMileRequest, TmsFirstMileRequestRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得头程申请单分页")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:query')")
    public CommonResult<PageResult<TmsFirstMileRequestRespVO>> getFirstMileRequestPage(@Validated TmsFirstMileRequestPageReqVO pageReqVO) {
        PageResult<TmsFirstMileRequestDO> pageResult = firstMileRequestService.getFirstMileRequestPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, TmsFirstMileRequestRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出头程申请单 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportFirstMileRequestExcel(@Validated TmsFirstMileRequestPageReqVO pageReqVO, HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<TmsFirstMileRequestDO> list = firstMileRequestService.getFirstMileRequestPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "头程申请单.xls", "数据", TmsFirstMileRequestRespVO.class, BeanUtils.toBean(list, TmsFirstMileRequestRespVO.class));
    }

    @PostMapping("/import-excel")
    @Operation(summary = "导入头程申请单 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:import')")
    public CommonResult<Boolean> importFirstMileRequestExcel(@RequestParam("file") MultipartFile file) throws Exception {
        List<TmsFirstMileRequestSaveReqVO> list = ExcelUtils.read(file, TmsFirstMileRequestSaveReqVO.class);
        // 可根据业务需要批量保存或校验
        return success(true);
    }

    // ==================== 子表（头程申请表明细） ====================

    @GetMapping("/first-mile-request-item/list-by-request-id")
    @Operation(summary = "获得头程申请表明细列表")
    @Parameter(name = "requestId", description = "所属申请单ID")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:query')")
    public CommonResult<List<TmsFirstMileRequestItemDO>> getFirstMileRequestItemListByRequestId(@RequestParam("requestId") Long requestId) {
        return success(firstMileRequestService.getFirstMileRequestItemListByRequestId(requestId));
    }

}