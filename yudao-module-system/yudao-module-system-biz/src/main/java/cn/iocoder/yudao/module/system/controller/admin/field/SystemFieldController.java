package cn.iocoder.yudao.module.system.controller.admin.field;

import cn.iocoder.yudao.framework.common.enums.CommonStatusEnum;
import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;
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
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertList;

import cn.iocoder.yudao.module.system.controller.admin.field.vo.*;
import cn.iocoder.yudao.module.system.dal.dataobject.field.SystemFieldDO;
import cn.iocoder.yudao.module.system.service.field.SystemFieldService;

/**
 * @author Administrator
 */
@Tag(name = "管理后台 - 字段属性")
@RestController
@RequestMapping("/system/field")
@Validated
public class SystemFieldController {

    @Resource
    private SystemFieldService fieldService;

    @PostMapping("/create")
    @Operation(summary = "创建字段属性")
    @PreAuthorize("@ss.hasPermission('system:field:create')")
    public CommonResult<Long> createField(@Valid @RequestBody SystemFieldSaveReqVO createReqVO) {
        return success(fieldService.createField(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新字段属性")
    @PreAuthorize("@ss.hasPermission('system:field:update')")
    public CommonResult<Boolean> updateField(@Valid @RequestBody SystemFieldSaveReqVO updateReqVO) {
        fieldService.updateField(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除字段属性")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('system:field:delete')")
    public CommonResult<Boolean> deleteField(@RequestParam("id") Long id) {
        fieldService.deleteField(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得字段属性")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('system:field:query')")
    public CommonResult<SystemFieldRespVO> getField(@RequestParam("id") Long id) {
        SystemFieldDO field = fieldService.getField(id);
        return success(BeanUtils.toBean(field, SystemFieldRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得字段属性分页")
    @PreAuthorize("@ss.hasPermission('system:field:query')")
    public CommonResult<PageResult<SystemFieldRespVO>> getFieldPage(@Valid SystemFieldPageReqVO pageReqVO) {
        PageResult<SystemFieldDO> pageResult = fieldService.getFieldPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, SystemFieldRespVO.class));
    }

    @GetMapping("/simple-list")
    @Operation(summary = "获得字段精简列表", description = "主要用于前端的下拉选项")
    public CommonResult<List<SystemFieldRespVO>> getFieldSimpleList() {
        List<SystemFieldDO> list = fieldService.getFieldList();
        return success(convertList(list, field -> new SystemFieldRespVO()
                .setId(field.getId()).setAttribute(field.getAttribute())));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出字段属性 Excel")
    @PreAuthorize("@ss.hasPermission('system:field:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportFieldExcel(@Valid SystemFieldPageReqVO pageReqVO,
                                 HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<SystemFieldDO> list = fieldService.getFieldPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "字段属性.xls", "数据", SystemFieldRespVO.class,
                BeanUtils.toBean(list, SystemFieldRespVO.class));
    }

}