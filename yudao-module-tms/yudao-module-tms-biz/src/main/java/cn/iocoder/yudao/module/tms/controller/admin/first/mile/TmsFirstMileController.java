package cn.iocoder.yudao.module.tms.controller.admin.first.mile;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.collection.MapUtils;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.module.system.api.user.AdminUserApi;
import cn.iocoder.yudao.module.system.api.user.dto.AdminUserRespDTO;
import cn.iocoder.yudao.module.system.api.utils.Validation;
import cn.iocoder.yudao.module.tms.controller.admin.fee.vo.TmsFeeRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo.TmsFirstMileItemRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.req.TmsFirstMileAuditReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.req.TmsFirstMilePageReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.req.TmsFirstMileSaveReqVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.resp.TmsFirstMileExcelVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.vo.resp.TmsFirstMileRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.vessel.tracking.vo.TmsVesselTrackingRespVO;
import cn.iocoder.yudao.module.tms.convert.first.mile.TmsFirstMileConvert;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileBO;
import cn.iocoder.yudao.module.tms.service.first.mile.TmsFirstMileService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - 头程单")
@RestController
@RequestMapping("/tms/first-mile")
@Validated
public class TmsFirstMileController {

    @Autowired
    private TmsFirstMileService firstMileService;
    @Autowired
    private AdminUserApi adminUserApi;

    @PostMapping("/create")
    @Operation(summary = "创建头程单")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:create')")
    public CommonResult<Long> createFirstMile(@Validated(Validation.OnCreate.class) @RequestBody TmsFirstMileSaveReqVO createReqVO) {
        return success(firstMileService.createFirstMile(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新头程单")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:update')")
    public CommonResult<Boolean> updateFirstMile(@Validated(Validation.OnUpdate.class) @RequestBody TmsFirstMileSaveReqVO updateReqVO) {
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
        TmsFirstMileBO firstMile = firstMileService.getFirstMileBO(id);
        List<TmsFirstMileRespVO> mileRespVOS = bindResult(Collections.singletonList(firstMile));
        if (mileRespVOS == null || mileRespVOS.isEmpty()) {
            return success(null);
        }
        return success(mileRespVOS.get(0));
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
    public void exportExcel(@Valid TmsFirstMilePageReqVO pageReqVO, HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<TmsFirstMileBO> list = firstMileService.getFirstMileBOPage(pageReqVO).getList();
        // 导出 Excel
        List<TmsFirstMileExcelVO> excelList = TmsFirstMileConvert.convertExcelList(list);
        ExcelUtils.write(response, "头程单.xlsx", "数据", TmsFirstMileExcelVO.class, excelList);
    }

    @PostMapping("/import-excel")
    @Operation(summary = "导入头程单 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:import')")
    public CommonResult<Boolean> importFirstMileExcel(@RequestParam("file") MultipartFile file) throws Exception {
        List<TmsFirstMileSaveReqVO> list = ExcelUtils.read(file, TmsFirstMileSaveReqVO.class);
        // 可根据业务需要批量保存或校验
        return success(true);
    }

    // ==================== 子表（出运订单费用明细） ====================

    @GetMapping("/fee/list-by-source-id")
    @Operation(summary = "获得出运订单费用明细列表")
    @Parameter(name = "sourceId", description = "头程单ID")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:query')")
    public CommonResult<List<TmsFeeRespVO>> getFeeListBySourceId(@RequestParam("sourceId") Long sourceId) {
        return success(firstMileService.getFeeListBySourceId(sourceId));
    }

    @PutMapping("/submit-audit")
    @Operation(summary = "提交头程单审核")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:audit')")
    public CommonResult<Boolean> submitAudit(@RequestBody List<Long> ids) {
        firstMileService.submitAudit(ids);
        return success(true);
    }

    @PutMapping("/audit-status")
    @Operation(summary = "审核/反审核")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:audit')")
    public CommonResult<Boolean> audit(@Validated @RequestBody TmsFirstMileAuditReqVO reqVO) {
        firstMileService.review(reqVO);
        return success(true);
    }

    @GetMapping("/get-latest-no")
    @Operation(summary = "获取最新的单据编号")
    @PreAuthorize("@ss.hasPermission('tms:first-mile:query')")
    public CommonResult<String> getLatestNo() {
        return success(firstMileService.getLatestCode());
    }


    private List<TmsFirstMileRespVO> bindResult(List<TmsFirstMileBO> beans) {
        if (CollUtil.isEmpty(beans)) {
            return Collections.emptyList();
        }
        // 收集所有创建人和更新人ID
        Set<Long> userIds = beans.stream()
            .flatMap(bo -> Stream.concat(
                Stream.of(bo.getCreator(), bo.getUpdater()),
                Stream.concat(
                    bo.getItems() == null ? Stream.empty() :
                        bo.getItems().stream().flatMap(item -> Stream.of(item.getCreator(), item.getUpdater())),
                    bo.getFees() == null ? Stream.empty() :
                        bo.getFees().stream().flatMap(fee -> Stream.of(fee.getCreator(), fee.getUpdater()))
                )
            ))
            .filter(Objects::nonNull)
            .map(this::safeParseLong)
            .filter(Objects::nonNull)
            .collect(Collectors.toSet());
        // 获取用户Map
        Map<Long, AdminUserRespDTO> userMap = adminUserApi.getUserMap(userIds);

        return beans.stream().map(bo -> {
            TmsFirstMileRespVO respVO = BeanUtils.toBean(bo, TmsFirstMileRespVO.class);
            // 设置创建人和更新人
            MapUtils.findAndThen(userMap, safeParseLong(bo.getCreator()), user -> respVO.setCreator(user.getNickname()));
            MapUtils.findAndThen(userMap, safeParseLong(bo.getUpdater()), user -> respVO.setUpdater(user.getNickname()));

            // 设置明细项
            if (CollUtil.isNotEmpty(bo.getItems())) {
                List<TmsFirstMileItemRespVO> items = bo.getItems().stream().map(item -> {
                    TmsFirstMileItemRespVO itemRespVO = BeanUtils.toBean(item, TmsFirstMileItemRespVO.class);
                    // 设置明细的创建人和更新人
                    MapUtils.findAndThen(userMap, safeParseLong(item.getCreator()), user -> itemRespVO.setCreator(user.getNickname()));
                    MapUtils.findAndThen(userMap, safeParseLong(item.getUpdater()), user -> itemRespVO.setUpdater(user.getNickname()));
                    return itemRespVO;
                }).collect(Collectors.toList());
                respVO.setFirstMileItemList(items);
            }
            // 设置费用信息
            if (CollUtil.isNotEmpty(bo.getFees())) {
                respVO.setFees(TmsFirstMileConvert.convertFeeList(bo.getFees()));
                MapUtils.findAndThen(userMap, safeParseLong(bo.getUpdater()), user -> respVO.setUpdater(user.getNickname()));
                MapUtils.findAndThen(userMap, safeParseLong(bo.getCreator()), user -> respVO.setCreator(user.getNickname()));
            }
            // 设置最新跟踪信息
            if (bo.getTracking() != null) {
                respVO.setTracking(BeanUtils.toBean(bo.getTracking(), TmsVesselTrackingRespVO.class));
            }
            return respVO;
        }).toList();
    }

    private Long safeParseLong(String value) {
        try {
            return Optional.ofNullable(value).map(Long::parseLong).orElse(null);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}