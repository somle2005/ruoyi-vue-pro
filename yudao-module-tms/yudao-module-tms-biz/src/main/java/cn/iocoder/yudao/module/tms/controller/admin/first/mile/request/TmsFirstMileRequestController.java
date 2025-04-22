package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;
import cn.iocoder.yudao.framework.idempotent.core.annotation.Idempotent;
import cn.iocoder.yudao.module.erp.api.product.ErpProductApi;
import cn.iocoder.yudao.module.erp.api.product.dto.ErpProductDTO;
import cn.iocoder.yudao.module.system.api.utils.Validation;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo.TmsFirstMileRequestItemRespVO;
import cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.vo.*;
import cn.iocoder.yudao.module.tms.dal.dataobject.first.mile.request.item.TmsFirstMileRequesItemtDO;
import cn.iocoder.yudao.module.tms.service.bo.TmsFirstMileRequestBO;
import cn.iocoder.yudao.module.tms.service.first.mile.request.TmsFirstMileRequestService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.EXPORT;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

@Tag(name = "管理后台 - 头程申请单")
@RestController
@RequestMapping("/tms/first-mile-request")
@Validated
public class TmsFirstMileRequestController {

    @Resource
    private TmsFirstMileRequestService firstMileRequestService;
    @Autowired
    ErpProductApi erpProductApi;

    @PostMapping("/create")
    @Operation(summary = "创建头程申请单")
    @Idempotent
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:create')")
    public CommonResult<Long> createFirstMileRequest(@Validated(Validation.OnCreate.class) @RequestBody TmsFirstMileRequestSaveReqVO createReqVO) {
        return success(firstMileRequestService.createFirstMileRequest(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新头程申请单")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:update')")
    public CommonResult<Boolean> updateFirstMileRequest(@Validated(Validation.OnUpdate.class) @RequestBody TmsFirstMileRequestSaveReqVO updateReqVO) {
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
        // 获取主表数据
        TmsFirstMileRequestBO firstMileRequestBO = firstMileRequestService.getFirstMileRequestBO(id);
        if (firstMileRequestBO == null) {
            return success(null);
        }
        // 转换为响应对象
        TmsFirstMileRequestRespVO respVO = bindSingleResult(firstMileRequestBO);
        return success(respVO);
    }

    @PostMapping("/page")
    @Operation(summary = "获得头程申请单分页")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:query')")
    public CommonResult<PageResult<TmsFirstMileRequestRespVO>> getFirstMileRequestPage(@Validated @RequestBody TmsFirstMileRequestPageReqVO pageReqVO) {
        // 获取BO分页数据
        PageResult<TmsFirstMileRequestBO> pageBO = firstMileRequestService.getFirstMileRequestBOPage(pageReqVO);

        // 转换为响应对象
        List<TmsFirstMileRequestRespVO> respVOList = pageBO.getList().stream().map(this::bindSingleResult).collect(Collectors.toList());
        // 创建结果对象
        PageResult<TmsFirstMileRequestRespVO> pageResultRespVO = new PageResult<>();
        pageResultRespVO.setTotal(pageBO.getTotal());
        pageResultRespVO.setList(respVOList);
        return success(pageResultRespVO);
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出头程申请单 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportFirstMileRequestExcel(@Validated TmsFirstMileRequestPageReqVO pageReqVO, HttpServletResponse response)
        throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        // 获取分页数据
        PageResult<TmsFirstMileRequestBO> pageBO = firstMileRequestService.getFirstMileRequestBOPage(pageReqVO);
        // 转换为响应对象列表
        List<TmsFirstMileRequestRespVO> list = pageBO.getList().stream().map(this::bindSingleResult).collect(Collectors.toList());
        // 导出 Excel
        ExcelUtils.write(response, "头程申请单.xls", "数据", TmsFirstMileRequestRespVO.class, list);
    }

    @PostMapping("/import-excel")
    @Operation(summary = "导入头程申请单 Excel")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:import')")
    public CommonResult<Boolean> importFirstMileRequestExcel(@RequestParam("file") MultipartFile file)
        throws Exception {
        List<TmsFirstMileRequestSaveReqVO> list = ExcelUtils.read(file, TmsFirstMileRequestSaveReqVO.class);
        // 可根据业务需要批量保存或校验
        return success(true);
    }

    @PutMapping("/submit-audit")
    @Operation(summary = "提交审核")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:submit-audit')")
    public CommonResult<Boolean> submitAudit(@Valid @RequestBody TmsFirstMileRequestSubmitAuditReqVO reqVO) {
        firstMileRequestService.submitAudit(reqVO.getIds());
        return success(true);
    }

    @PutMapping("/audit-status")
    @Operation(summary = "审核/反审核")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:audit-status')")
    public CommonResult<Boolean> audit(TmsFirstMileRequestAuditReqVO reqVO) {
        firstMileRequestService.review(reqVO);
        return success(true);
    }

    //启用/关闭申请单子项
    @PutMapping("/update-item-status")
    @Operation(summary = "启用/禁用申请单子项")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:update-item-status')")
    public CommonResult<Boolean> updateItemStatus(@Valid @RequestBody TmsFirstMileRequestItemOffReqVO reqVO) {
        firstMileRequestService.switchTmsFirstMileOpenStatus(reqVO.getItemIds(), reqVO.getEnable());
        return success(true);
    }

    @PostMapping("/merge")
    @Operation(summary = "合并头程申请单")
    @PreAuthorize("@ss.hasPermission('tms:first-mile-request:merge')")
    public CommonResult<Boolean> mergeFirstMileRequest(@RequestBody List<Long> ids) {

        // TODO: 实现合并头程申请单逻辑

        return success(true);
    }


    /**
     * 将TmsFirstMileRequestBO转换为TmsFirstMileRequestRespVO 实现主表和子表数据的绑定
     *
     * @param firstMileRequestBO 包含主表和子表数据的BO对象
     * @return 转换后的响应对象
     */
    private TmsFirstMileRequestRespVO bindSingleResult(TmsFirstMileRequestBO firstMileRequestBO) {
        // 转换主表数据
        TmsFirstMileRequestRespVO respVO = BeanUtils.toBean(firstMileRequestBO, TmsFirstMileRequestRespVO.class);
        //list - productId
        List<Long> productIds = firstMileRequestBO.getItems().stream().map(TmsFirstMileRequesItemtDO::getProductId).distinct().toList();
        Map<Long, ErpProductDTO> productMap = erpProductApi.getProductMap(productIds);
        // 设置子表数据
        if (firstMileRequestBO.getItems() != null) {
            List<TmsFirstMileRequestItemRespVO> items = firstMileRequestBO.getItems().stream()
                .map(item -> BeanUtils.toBean(item, TmsFirstMileRequestItemRespVO.class, itemRespVO -> {
                    itemRespVO
                        .setProduct(productMap.get(item.getProductId()))
                        .setBarCode(productMap.get(item.getProductId()).getBarCode());
                }))
                .collect(Collectors.toList());
            respVO.setItems(items);
            // 设置明细数量
            respVO.setItemCount(items.size());
        } else {
            respVO.setItemCount(0);
        }

        return respVO;
    }

}