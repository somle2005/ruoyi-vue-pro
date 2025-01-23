package cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo.ErpCustomRulePageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo.ErpCustomRuleRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo.ErpCustomRuleSaveReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.ErpProductRespVO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.customrule.ErpCustomRuleDO;
import cn.iocoder.yudao.module.erp.service.logistic.customrule.ErpCustomRuleService;
import cn.iocoder.yudao.module.erp.service.product.ErpProductService;
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
import java.util.Map;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;
import static cn.iocoder.yudao.framework.common.util.collection.CollectionUtils.convertSet;

@Tag(name = "管理后台 - ERP 海关规则")
@RestController
@RequestMapping("/erp/custom-rule")
@Validated
public class ErpCustomRuleController {

    @Resource
    private ErpCustomRuleService customRuleService;
    @Resource
    private ErpProductService erpProductService;

    @PostMapping("/create")
    @Operation(summary = "创建ERP 海关规则")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule:create')")
    public CommonResult<Long> createCustomRule(@Valid @RequestBody ErpCustomRuleSaveReqVO createReqVO) {
        return success(customRuleService.createCustomRule(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新ERP 海关规则")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule:update')")
    public CommonResult<Boolean> updateCustomRule(@Valid @RequestBody ErpCustomRuleSaveReqVO updateReqVO) {
        customRuleService.updateCustomRule(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除ERP 海关规则")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:custom-rule:delete')")
    public CommonResult<Boolean> deleteCustomRule(@RequestParam("id") Long id) {
        customRuleService.deleteCustomRule(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得ERP 海关规则")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule:query')")
    public CommonResult<ErpCustomRuleRespVO> getCustomRule(@RequestParam("id") Long id) {
        ErpCustomRuleDO customRule = customRuleService.getCustomRule(id);
        return success(BeanUtils.toBean(customRule, ErpCustomRuleRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得ERP 海关规则分页")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule:query')")
    public CommonResult<PageResult<ErpCustomRuleRespVO>> getCustomRulePage(@Valid ErpCustomRulePageReqVO pageReqVO) {
        PageResult<ErpCustomRuleDO> pageResult = customRuleService.getCustomRulePage(pageReqVO);
        return success(bindPageResult(pageResult));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出ERP 海关规则 Excel")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportCustomRuleExcel(@Valid ErpCustomRulePageReqVO pageReqVO,
                                      HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ErpCustomRuleRespVO> list = bindPageResult(customRuleService.getCustomRulePage(pageReqVO)).getList();
        // 导出 Excel
        ExcelUtils.write(response, "ERP 海关规则.xls", "数据", ErpCustomRuleRespVO.class, list);
    }

    private PageResult<ErpCustomRuleRespVO> bindPageResult(PageResult<ErpCustomRuleDO> pageResult) {
        if (CollUtil.isEmpty(pageResult.getList())) {
            return PageResult.empty(pageResult.getTotal());
        }
        //1.1 产品信息
        Map<Long, ErpProductRespVO> productVOMap = erpProductService.getProductVOMap(convertSet(pageResult.getList(), ErpCustomRuleDO::getProductId));
        //2开始拼接
        return BeanUtils.toBean(pageResult, ErpCustomRuleRespVO.class, erpCustomRule -> {
            MapUtils.findAndThen(productVOMap, erpCustomRule.getProductId(), erpCustomRule::setProduct);//设置产品VO实体类

        });
    }
}