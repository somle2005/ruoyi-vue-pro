package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.framework.idempotent.core.annotation.Idempotent;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemSaveReqVO;
import cn.iocoder.yudao.module.tms.service.first.mile.request.item.TmsFirstMileRequestItemService;
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

@Tag(name = "管理后台 - 头程申请表明细")
@RestController
@RequestMapping("/tms/first-mile-request-item")
@Validated
public class TmsFirstMileRequestItemController {

    @Resource
    private TmsFirstMileRequestItemService firstMileRequestItemService;

    @PostMapping("/create")
    @Operation(summary = "创建头程申请表明细")
    @Idempotent
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request-item:create')")
    public CommonResult<Long> createFirstMileRequestItem(@Valid @RequestBody TmsFirstMileRequestItemSaveReqVO createReqVO) {
        return success(firstMileRequestItemService.createFirstMileRequestItem(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新头程申请表明细")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request-item:update')")
    public CommonResult<Boolean> updateFirstMileRequestItem(@Valid @RequestBody TmsFirstMileRequestItemSaveReqVO updateReqVO) {
        firstMileRequestItemService.updateFirstMileRequestItem(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除头程申请表明细")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request-item:delete')")
    public CommonResult<Boolean> deleteFirstMileRequestItem(@RequestParam("id") Long id) {
        firstMileRequestItemService.deleteFirstMileRequestItem(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得头程申请表明细")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request-item:query')")
    public CommonResult<TmsFirstMileRequestItemRespVO> getFirstMileRequestItem(@RequestParam("id") Long id) {
        TmsFirstMileRequestItemDO firstMileRequestItem = firstMileRequestItemService.getFirstMileRequestItem(id);
        return success(BeanUtils.toBean(firstMileRequestItem, TmsFirstMileRequestItemRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得头程申请表明细分页")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request-item:query')")
    public CommonResult<PageResult<TmsFirstMileRequestItemRespVO>> getFirstMileRequestItemPage(@Valid TmsFirstMileRequestItemPageReqVO pageReqVO) {
        PageResult<TmsFirstMileRequestItemDO> pageResult = firstMileRequestItemService.getFirstMileRequestItemPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, TmsFirstMileRequestItemRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出头程申请表明细 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request-item:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportFirstMileRequestItemExcel(@Valid TmsFirstMileRequestItemPageReqVO pageReqVO,
                                                HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<TmsFirstMileRequestItemDO> list = firstMileRequestItemService.getFirstMileRequestItemPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "头程申请表明细.xls", "数据", TmsFirstMileRequestItemRespVO.class,
            BeanUtils.toBean(list, TmsFirstMileRequestItemRespVO.class));
    }

    @PostMapping("/import-excel")
    @Operation(summary = "导入头程申请表明细 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request-item:import')")
    public CommonResult
        <Boolean> importFirstMileRequestItemExcel(@RequestParam("file") MultipartFile file) throws Exception {
        List
            <TmsFirstMileRequestItemSaveReqVO> list =
            ExcelUtils.read(file, TmsFirstMileRequestItemSaveReqVO.class);
        // 可根据业务需要批量保存或校验
        return success(true);
    }


}