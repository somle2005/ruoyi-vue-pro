package cn.iocoder.yudao.module.erp.controller.admin.logistic.category;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategoryPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategoryRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategorySaveReqVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomRuleCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import cn.iocoder.yudao.module.erp.service.logistic.category.ErpCustomRuleCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - 海关品类")
@RestController
@RequestMapping("/erp/custom-rule-category")
@Validated
public class ErpCustomRuleCategoryController {

    @Resource
    private ErpCustomRuleCategoryService customRuleCategoryService;

    @PostMapping("/create")
    @Operation(summary = "创建海关品类")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:create')")
    public CommonResult<Long> createCustomRuleCategory(@Valid @RequestBody ErpCustomRuleCategorySaveReqVO createReqVO) {
        return success(customRuleCategoryService.createCustomRuleCategory(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新海关品类")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:update')")
    public CommonResult<Boolean> updateCustomRuleCategory(@Valid @RequestBody ErpCustomRuleCategorySaveReqVO updateReqVO) {
        customRuleCategoryService.updateCustomRuleCategory(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除海关品类")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:delete')")
    public CommonResult<Boolean> deleteCustomRuleCategory(@RequestParam("id") Long id) {
        customRuleCategoryService.deleteCustomRuleCategory(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得海关品类")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:query')")
    public CommonResult<ErpCustomRuleCategoryRespVO> getCustomRuleCategory(@RequestParam("id") Long id) {
        ErpCustomRuleCategoryDO customRuleCategory = customRuleCategoryService.getCustomRuleCategory(id);
        return success(BeanUtils.toBean(customRuleCategory, ErpCustomRuleCategoryRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得海关品类分页")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:query')")
    public CommonResult<PageResult<ErpCustomRuleCategoryRespVO>> getCustomRuleCategoryPage(@Valid ErpCustomRuleCategoryPageReqVO pageReqVO) {
        PageResult<ErpCustomRuleCategoryDO> pageResult = customRuleCategoryService.getCustomRuleCategoryPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ErpCustomRuleCategoryRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出海关品类 Excel")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportCustomRuleCategoryExcel(@Valid ErpCustomRuleCategoryPageReqVO pageReqVO,
                                              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ErpCustomRuleCategoryDO> list = customRuleCategoryService.getCustomRuleCategoryPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "海关品类.xls", "数据", ErpCustomRuleCategoryRespVO.class,
            BeanUtils.toBean(list, ErpCustomRuleCategoryRespVO.class));
    }

    // ==================== 子表（海关品类子表） ====================

    @GetMapping("/custom-rule-category-item/list-by-category-id")
    @Operation(summary = "获得海关品类子表列表")
    @Parameter(name = "categoryId", description = "分类表id")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:query')")
    public CommonResult<List<ErpCustomRuleCategoryItemDO>> getCustomRuleCategoryItemListByCategoryId(@RequestParam("categoryId") Integer categoryId) {
        return success(customRuleCategoryService.getCustomRuleCategoryItemListByCategoryId(categoryId));
    }

}