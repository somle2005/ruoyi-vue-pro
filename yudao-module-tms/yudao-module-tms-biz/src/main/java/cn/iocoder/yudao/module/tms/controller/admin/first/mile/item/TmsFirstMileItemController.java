package cn.iocoder.yudao.module.tms.controller.admin.first.mile.item;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.framework.idempotent.core.annotation.Idempotent;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemPageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemSaveReqVO;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.item.TmsFirstMileItemDO;
import cn.iocoder.yudao.module.tms.service.first.mile.item.TmsFirstMileItemService;
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

@Tag(name = "管理后台 - 头程单明细")
@RequestMapping("/tms/first-mile-item")
@Validated
public class TmsFirstMileItemController {

    @Resource
    private TmsFirstMileItemService firstMileItemService;

    @PostMapping("/create")
    @Operation(summary = "创建头程单明细")
    @Idempotent
    @PreAuthorize("@ss.hasPermission('tms:first-mile-item:create')")
    public CommonResult<Long> createFirstMileItem(@Valid @RequestBody TmsFirstMileItemSaveReqVO createReqVO) {
        return success(firstMileItemService.createFirstMileItem(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新头程单明细")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-item:update')")
    public CommonResult<Boolean> updateFirstMileItem(@Valid @RequestBody TmsFirstMileItemSaveReqVO updateReqVO) {
        firstMileItemService.updateFirstMileItem(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除头程单明细")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('tms:first-mile-item:delete')")
    public CommonResult<Boolean> deleteFirstMileItem(@RequestParam("id") Long id) {
        firstMileItemService.deleteFirstMileItem(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得头程单明细")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-item:query')")
    public CommonResult<TmsFirstMileItemRespVO> getFirstMileItem(@RequestParam("id") Long id) {
        TmsFirstMileItemDO firstMileItem = firstMileItemService.getFirstMileItem(id);
        return success(BeanUtils.toBean(firstMileItem, TmsFirstMileItemRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得头程单明细分页")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-item:query')")
    public CommonResult<PageResult<TmsFirstMileItemRespVO>> getFirstMileItemPage(@Valid TmsFirstMileItemPageReqVO pageReqVO) {
        PageResult<TmsFirstMileItemDO> pageResult = firstMileItemService.getFirstMileItemPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, TmsFirstMileItemRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出头程单明细 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-item:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportFirstMileItemExcel(@Valid TmsFirstMileItemPageReqVO pageReqVO,
                                         HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<TmsFirstMileItemDO> list = firstMileItemService.getFirstMileItemPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "头程单明细.xls", "数据", TmsFirstMileItemRespVO.class,
            BeanUtils.toBean(list, TmsFirstMileItemRespVO.class));
    }

    @PostMapping("/import-excel")
    @Operation(summary = "导入头程单明细 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-item:import')")
    public CommonResult
        <Boolean> importFirstMileItemExcel(@RequestParam("file") MultipartFile file) throws Exception {
        List
            <TmsFirstMileItemSaveReqVO> list =
            ExcelUtils.read(file, TmsFirstMileItemSaveReqVO.class);
        // 可根据业务需要批量保存或校验
        return success(true);
    }


}