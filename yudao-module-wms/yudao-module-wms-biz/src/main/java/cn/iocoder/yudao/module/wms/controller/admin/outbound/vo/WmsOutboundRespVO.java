package cn.iocoder.yudao.module.wms.controller.admin.outbound.vo;

import cn.iocoder.yudao.module.wms.controller.admin.approval.history.vo.WmsApprovalHistoryRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.company.FmsCompanySimpleRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.dept.DeptSimpleRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.outbound.item.vo.WmsOutboundItemRespVO;
import cn.iocoder.yudao.module.wms.controller.admin.warehouse.vo.WmsWarehouseSimpleRespVO;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author jisencai
 * @table-fields : tenant_id,creator,code,company_id,create_time,remark,audit_status,outbound_time,type,updater,upstream_type,update_time,latest_outbound_action_id,outbound_status,upstream_id,id,upstream_code,dept_id,warehouse_id
 */
@Schema(description = "管理后台 - 出库单 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WmsOutboundRespVO {

    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "7690")
    @ExcelProperty("主键")
    private Long id;

    @Schema(description = "仓库ID", example = "16056")
    @ExcelProperty("仓库ID")
    private Long warehouseId;

    @Schema(description = "WMS出库单类型 ; WmsOutboundType : 1-手工出库 , 2-订单出库 , 3-盘点出库", example = "1")
    @ExcelProperty("WMS出库单类型")
    private Integer type;

    @Schema(description = "WMS出库单审批状态 ; WmsOutboundAuditStatus : 0-起草中 , 1-待审批 , 2-已驳回 , 3-已通过 , 4-已出库", example = "2")
    @ExcelProperty("WMS出库单审批状态")
    private Integer auditStatus;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "创建人姓名", example = "张三")
    @ExcelProperty("创建人姓名")
    private String creatorName;

    @Schema(description = "更新人姓名", example = "李四")
    @ExcelProperty("更新人姓名")
    private String updaterName;

    @Schema(description = "详情清单")
    @ExcelProperty("详情清单")
    private List<WmsOutboundItemRespVO> itemList;

    @Schema(description = "WMS出库状态 ; WmsOutboundStatus : 0-未出库 , 1-部分出库 , 2-已出库")
    @ExcelProperty("WMS出库状态")
    private Integer outboundStatus;

    @Schema(description = "创建者")
    @ExcelProperty("创建者")
    private String creator;

    @Schema(description = "更新者")
    @ExcelProperty("更新者")
    private String updater;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "租户编号")
    @ExcelProperty("租户编号")
    private Long tenantId;

    @Schema(description = "库存财务公司ID")
    @ExcelProperty("库存财务公司ID")
    private Long companyId;

    @Schema(description = "库存归属部门ID")
    @ExcelProperty("库存归属部门ID")
    private Long deptId;

    @Schema(description = "出库时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("出库时间")
    private LocalDateTime outboundTime;

    @Schema(description = "计划出库时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("计划出库时间")
    private LocalDateTime outboundPlanTime;

    @Schema(description = "出库动作ID，与flow关联")
    @ExcelProperty("出库动作ID")
    private Long latestOutboundActionId;

    /**
     * 仓库名称
     */
    @Schema(description = "仓库名称")
    private String warehouseName;

    @Schema(description = "仓库")
    private WmsWarehouseSimpleRespVO warehouse;

    @Schema(description = "部门")
    @ExcelProperty("部门")
    private DeptSimpleRespVO dept;

    @Schema(description = "审批历史")
    List<WmsApprovalHistoryRespVO> approvalHistoryList;

    @Schema(description = "财务公司")
    @ExcelProperty("财务公司")
    private FmsCompanySimpleRespVO company;

    @Schema(description = "备注")
    @ExcelProperty("备注")
    private String remark;

    @Schema(description = "单据号")
    @ExcelProperty("单据号")
    private String code;

    @Schema(description = "来源单据ID")
    @ExcelProperty("来源单据ID")
    private Long upstreamId;

    @Schema(description = "来源单据编码")
    @ExcelProperty("来源单据编码")
    private String upstreamCode;

    @Schema(description = "WMS来源单据类型 ; WmsBillType : 0-入库单 , 1-出库单 , 2-盘点单 , 3-换货单")
    @ExcelProperty("WMS来源单据类型")
    private Integer upstreamType;

    @Schema(description = "采购订单ID")
    @ExcelProperty("采购订单ID")
    private Long purchaseOrderId;

    @Schema(description = "采购订单编码")
    @ExcelProperty("采购订单编码")
    private Long purchaseOrderCode;
}
