package cn.iocoder.yudao.module.system.controller.admin.data;

import cn.iocoder.yudao.module.system.controller.admin.data.vo.SystemDataTypePageReqVO;
import cn.iocoder.yudao.module.system.controller.admin.data.vo.SystemDataTypeRespVO;
import cn.iocoder.yudao.module.system.controller.admin.data.vo.SystemDataTypeSaveReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.data.SystemDataTypeDO;
import cn.iocoder.yudao.module.system.service.data.SystemDataTypeService;
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

/**
 * @author Administrator
 */
@Tag(name = "管理后台 - 字段属性")
@RestController
@RequestMapping("/system/data-type")
@Validated
public class SystemDataTypeController {

    @Resource
    private SystemDataTypeService dataTypeService;

    @PostMapping("/create")
    @Operation(summary = "创建字段属性")
    @PreAuthorize("@ss.hasPermission('system:data-type:create')")
    public CommonResult<Long> createDataType(@Valid @RequestBody SystemDataTypeSaveReqVO createReqVO) {
        return success(dataTypeService.createDataType(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新字段属性")
    @PreAuthorize("@ss.hasPermission('system:data-type:update')")
    public CommonResult<Boolean> updateDataType(@Valid @RequestBody SystemDataTypeSaveReqVO updateReqVO) {
        dataTypeService.updateDataType(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除字段属性")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('system:data-type:delete')")
    public CommonResult<Boolean> deleteDataType(@RequestParam("id") Long id) {
        dataTypeService.deleteDataType(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得字段属性")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('system:data-type:query')")
    public CommonResult<SystemDataTypeRespVO> getDataType(@RequestParam("id") Long id) {
        SystemDataTypeDO dataType = dataTypeService.getDataType(id);
        return success(BeanUtils.toBean(dataType, SystemDataTypeRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得字段属性分页")
    @PreAuthorize("@ss.hasPermission('system:data-type:query')")
    public CommonResult<PageResult<SystemDataTypeRespVO>> getDataTypePage(@Valid SystemDataTypePageReqVO pageReqVO) {
        PageResult<SystemDataTypeDO> pageResult = dataTypeService.getDataTypePage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, SystemDataTypeRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出字段属性 Excel")
    @PreAuthorize("@ss.hasPermission('system:data-type:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportDataTypeExcel(@Valid SystemDataTypePageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<SystemDataTypeDO> list = dataTypeService.getDataTypePage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "字段属性.xls", "数据", SystemDataTypeRespVO.class,
                        BeanUtils.toBean(list, SystemDataTypeRespVO.class));
    }

}