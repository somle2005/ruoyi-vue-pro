package cn.iocoder.yudao.module.wms.controller.admin.inbound.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.wms.enums.WmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author jisencai
 * @table-fields : tenant_id,creator,code,inbound_status,company_id,create_time,inbound_time,arrival_actual_time,remark,audit_status,trace_no,type,updater,upstream_type,update_time,init_age,upstream_id,shipping_method,id,upstream_code,dept_id,arrival_plan_time,shelving_status,warehouse_id
 */
@Schema(description = "管理后台 - 入库单 Response VO")
@Data
@ExcelIgnoreUnannotated
public class WmsInboundExcelDownloadVO {

    @Schema(description = "单据号")
    @ExcelProperty("单据号")
    private String code;

    @Schema(description = "仓库", example = "宁波东")
    private String warehouseName;

    @Schema(description = "入库单类型 ; WmsInboundType : 1-手工入库 , 2-采购入库 , 3-盘点入库", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty(value = "入库单类型", converter = DictConvert.class)
    @DictFormat(WmsDictTypeConstants.WMS_INBOUND_TYPE)
    private Integer type;

    @Schema(description = "入库状态 ; WmsInboundStatus : 0-未入库 , 1-部分入库 , 2-已入库")
    @ExcelProperty(value = "入库状态", converter = DictConvert.class)
    @DictFormat(WmsDictTypeConstants.WMS_INBOUND_STATUS)
    private Integer inboundStatus;

    @Schema(description = "上架状态 ; WmsInboundShelvingStatus : 1-未上架 , 2-部分上架 , 3-已上架")
    @ExcelProperty(value = "上架状态", converter = DictConvert.class)
    @DictFormat(WmsDictTypeConstants.WMS_INBOUND_SHELVING_STATUS)
    private Integer shelveStatus;

    @Schema(description = "审批状态 ; WmsInboundAuditStatus : 0-草稿 , 1-待入库 , 2-驳回 , 3-已入库 , 4-强制入库 , 5-作废")
    @ExcelProperty(value = "审批状态", converter = DictConvert.class)
    @DictFormat(WmsDictTypeConstants.WMS_INBOUND_AUDIT_STATUS)
    private Integer auditStatus;

    @Schema(description = "WMS运输方式 ; WmsShippingMethod : 0-海运 , 1-铁路 , 2-空运 , 3-集卡")
    @ExcelProperty(value = "WMS运输方式", converter = DictConvert.class)
    @DictFormat(WmsDictTypeConstants.WMS_SHIPPING_METHOD)
    private Integer shippingMethod;

    @Schema(description = "跟踪号")
    @ExcelProperty("跟踪号")
    private String traceNo;

    @Schema(description = "计划到货时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("计划到货时间")
    private LocalDateTime arrivalPlanTime;

    @Schema(description = "实际到货时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("实际到货时间")
    private LocalDateTime arrivalActualTime;

    @Schema(description = "特别说明")
    @ExcelProperty("特别说明")
    private String remark;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "更新人姓名", example = "李四")
    @ExcelProperty("更新人姓名")
    private String updaterName;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

    @Schema(description = "创建人姓名", example = "张三")
    @ExcelProperty("创建人姓名")
    private String creatorName;

    @Schema(description = "仓库ID", example = "23620")
    private Long warehouseId;
}
