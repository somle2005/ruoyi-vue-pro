package cn.iocoder.yudao.module.erp.controller.admin.logistic.category;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.item.vo.ErpCustomRuleCategoryItemSimpleRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategoryPageReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategoryRespVO;
import cn.iocoder.yudao.module.erp.controller.admin.logistic.category.vo.ErpCustomRuleCategorySaveReqVO;
import cn.iocoder.yudao.module.erp.controller.admin.tool.Validation;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.ErpCustomRuleCategoryDO;
import cn.iocoder.yudao.module.erp.dal.dataobject.logistic.category.item.ErpCustomRuleCategoryItemDO;
import cn.iocoder.yudao.module.erp.service.logistic.category.ErpCustomRuleCategoryService;
import cn.iocoder.yudao.module.erp.service.logistic.category.item.ErpCustomRuleCategoryItemService;
import cn.iocoder.yudao.module.system.api.dict.DictDataApi;
import cn.iocoder.yudao.module.system.api.dict.dto.DictDataRespDTO;
import cn.iocoder.yudao.module.system.api.user.AdminUserApi;
import cn.iocoder.yudao.module.system.api.user.dto.AdminUserRespDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - 海关分类")
@RestController
@RequestMapping("/erp/custom-rule-category")
@Validated
public class ErpCustomRuleCategoryController {

    @Resource
    private ErpCustomRuleCategoryService customRuleCategoryService;
    @Resource
    private ErpCustomRuleCategoryItemService customRuleCategoryItemService;
    @Resource
    DictDataApi dictDataApi;
    @Resource
    AdminUserApi adminUserApi;

    @PostMapping("/create")
    @Operation(summary = "创建海关分类")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:create')")
    public CommonResult<Long> createCustomRuleCategory(@Validated(Validation.OnCreate.class) @RequestBody ErpCustomRuleCategorySaveReqVO createReqVO) {
        return success(customRuleCategoryService.createCustomRuleCategory(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新海关分类")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:update')")
    public CommonResult<Boolean> updateCustomRuleCategory(@Validated(Validation.OnUpdate.class) @RequestBody ErpCustomRuleCategorySaveReqVO updateReqVO) {
        customRuleCategoryService.updateCustomRuleCategory(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除海关分类")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:delete')")
    public CommonResult<Boolean> deleteCustomRuleCategory(@NotNull(message = "id不能为null") @RequestParam("id") Long id) {
        customRuleCategoryService.deleteCustomRuleCategory(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得海关分类")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:query')")
    public CommonResult<ErpCustomRuleCategoryRespVO> getCustomRuleCategory(@NotNull(message = "id不能为null") @RequestParam("id") Long id) {
        ErpCustomRuleCategoryDO customRuleCategory = customRuleCategoryService.getCustomRuleCategory(id);
        List<ErpCustomRuleCategoryRespVO> vos = null;
        if (customRuleCategory != null) {
            vos = BindingResult(List.of(customRuleCategory));
        }
        return success(vos != null ? vos.get(0) : null);
    }

    @GetMapping("/page")
    @Operation(summary = "获得海关分类分页")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:query')")
    public CommonResult<PageResult<ErpCustomRuleCategoryRespVO>> getCustomRuleCategoryPage(@Valid ErpCustomRuleCategoryPageReqVO pageReqVO) {
        PageResult<ErpCustomRuleCategoryDO> pageResult = customRuleCategoryService.getCustomRuleCategoryPage(pageReqVO);
        return success(new PageResult<>(BindingResult(pageResult.getList()), pageResult.getTotal()));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出海关分类 Excel")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportCustomRuleCategoryExcel(@Valid ErpCustomRuleCategoryPageReqVO pageReqVO,
                                              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ErpCustomRuleCategoryDO> list = customRuleCategoryService.getCustomRuleCategoryPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "海关分类.xls", "数据", ErpCustomRuleCategoryRespVO.class,
            BeanUtils.toBean(BindingResult(list), ErpCustomRuleCategoryRespVO.class));
    }

    // ==================== 子表（海关分类子表） ====================

    @GetMapping("/custom-rule-category-item/list-by-category-id")
    @Operation(summary = "获得海关分类子表列表")
    @Parameter(name = "categoryId", description = "分类表id")
    @PreAuthorize("@ss.hasPermission('erp:custom-rule-category:query')")
    public CommonResult<List<ErpCustomRuleCategoryItemRespVO>> getCustomRuleCategoryItemListByCategoryId(@NotNull(message = "主表id不能为null") @RequestParam("categoryId") Integer categoryId) {
        List<ErpCustomRuleCategoryItemDO> itemDOList = customRuleCategoryService.getCustomRuleCategoryItemListByCategoryId(categoryId);
        if (CollectionUtils.isEmpty(itemDOList)) {
            return success(Collections.emptyList());
        }
        // 获取用户信息
        Set<Long> userIds = itemDOList.stream()
            .flatMap(item -> Stream.of(
                Optional.ofNullable(item.getCreator()).map(Long::parseLong),
                Optional.ofNullable(item.getUpdater()).map(Long::parseLong)
            ).filter(Optional::isPresent).map(Optional::get))
            .collect(Collectors.toSet());
        Map<Long, AdminUserRespDTO> userMap = adminUserApi.getUserMap(userIds);
        itemDOList.forEach(item -> {
            item.setCreator(userMap.get(Long.parseLong(item.getCreator())).getNickname());
            item.setUpdater(userMap.get(Long.parseLong(item.getUpdater())).getNickname());
        });
        return success(BeanUtils.toBean(itemDOList, ErpCustomRuleCategoryItemRespVO.class));
    }

    //公共方法-查询组合字段+id
    @GetMapping({"/simple-list"})
    @Operation(summary = "获得海关分类组合值精简列表", description = "材料+报关品名")
    public CommonResult<List<ErpCustomRuleCategoryItemSimpleRespVO>> getCustomRuleCategoryItemList() {
        List<ErpCustomRuleCategoryDO> list = customRuleCategoryService.getCustomRuleCategoryPage(null).getList();
        List<ErpCustomRuleCategoryRespVO> respVOS = BindingResult(list);
        return success(respVOS.stream().map(vo -> new ErpCustomRuleCategoryItemSimpleRespVO()
            .setCustomCategoryId(vo.getId())
            .setCombinedValue(vo.getCombinedValue())).toList());
    }


    private List<ErpCustomRuleCategoryRespVO> BindingResult(List<ErpCustomRuleCategoryDO> listDOs) {
        List<Long> ids = listDOs.stream().map(ErpCustomRuleCategoryDO::getId).toList();
        Map<Long, List<ErpCustomRuleCategoryItemDO>> itemMap = customRuleCategoryItemService.getCustomRuleCategoryItemMap(ids);
        //1 材料ids
        List<DictDataRespDTO> dtoList = dictDataApi.getDictDataList("erp_product_material");
        //1.1 构造map  字典的value:字典的label
        Map<String, String> materialMap = dtoList.stream().collect(Collectors.toMap(DictDataRespDTO::getValue, DictDataRespDTO::getLabel));
        // 1.2 构造人员map
        Set<Long> userIds = listDOs.stream()
            .flatMap(categoryDO -> Stream.of(
                Optional.ofNullable(categoryDO.getCreator()).map(Long::parseLong),
                Optional.ofNullable(categoryDO.getUpdater()).map(Long::parseLong)
            ).filter(Optional::isPresent).map(Optional::get))
            .collect(Collectors.toSet());
        Map<Long, AdminUserRespDTO> userMap = adminUserApi.getUserMap(userIds);

        //2 渲染
        return BeanUtils.toBean(listDOs, ErpCustomRuleCategoryRespVO.class, vo -> {
            vo.setCombinedValue(materialMap.get(vo.getMaterial().toString()) + vo.getDeclaredType());//组合值
            List<ErpCustomRuleCategoryItemDO> items = itemMap.get(vo.getId());
            Optional.ofNullable(vo.getUpdater()).ifPresent(updater -> vo.setUpdater(userMap.get(Long.parseLong(updater)).getNickname()));//创建人
            Optional.ofNullable(vo.getCreator()).ifPresent(creator -> vo.setUpdater(userMap.get(Long.parseLong(creator)).getNickname()));//更新人

            vo.setCustomRuleCategoryItems(BeanUtils.toBean(items, ErpCustomRuleCategoryItemRespVO.class, item -> {
                Optional.ofNullable(item.getUpdater()).ifPresent(updater -> item.setUpdater(userMap.get(Long.parseLong(updater)).getNickname()));//创建人
                Optional.ofNullable(item.getCreator()).ifPresent(creator -> item.setUpdater(userMap.get(Long.parseLong(creator)).getNickname()));//更新人
            }));//子表

        });
    }
}