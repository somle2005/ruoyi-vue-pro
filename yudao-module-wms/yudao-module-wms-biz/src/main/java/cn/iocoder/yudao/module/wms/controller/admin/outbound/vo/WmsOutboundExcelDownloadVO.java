package cn.iocoder.yudao.module.wms.controller.admin.outbound.vo;

import cn.iocoder.yudao.framework.excel.core.annotations.DictFormat;
import cn.iocoder.yudao.framework.excel.core.convert.DictConvert;
import cn.iocoder.yudao.module.wms.enums.WmsDictTypeConstants;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

/**
 * @author jisencai
 * @table-fields : tenant_id,creator,code,company_id,create_time,remark,audit_status,outbound_time,type,updater,upstream_type,update_time,latest_outbound_action_id,outbound_status,upstream_id,id,upstream_code,dept_id,warehouse_id
 */
@Schema(description = "管理后台 - 出库单 导出excel VO")
@Data
@ExcelIgnoreUnannotated
public class WmsOutboundExcelDownloadVO {

    @Schema(description = "单据号")
    @ExcelProperty("单据号")
    @ColumnWidth(30)
    private String code;

    @Schema(description = "仓库", example = "宁波仓")
    @ExcelProperty("仓库")
    private String warehouseName;

    @Schema(description = "仓库ID", example = "16056")
    private Long warehouseId;

    @Schema(description = "WMS出库单类型 ; WmsOutboundType : 1-手工出库 , 2-订单出库 , 3-盘点出库", example = "1")
    @ExcelProperty(value = "出库单类型", converter = DictConvert.class)
    @DictFormat(WmsDictTypeConstants.WMS_OUTBOUND_TYPE)
    private Integer type;

    @Schema(description = "WMS出库单审批状态 ; WmsOutboundAuditStatus : 0-起草中 , 1-待审批 , 2-已驳回 , 3-已通过 , 4-已出库", example = "2")
    @ExcelProperty(value = "审核状态", converter = DictConvert.class)
    @DictFormat(WmsDictTypeConstants.WMS_OUTBOUND_AUDIT_STATUS)
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

    @Schema(description = "WMS出库状态 ; WmsOutboundStatus : 0-未出库 , 1-部分出库 , 2-已出库")
    @ExcelProperty(value = "出库状态", converter = DictConvert.class)
    @DictFormat(WmsDictTypeConstants.WMS_OUTBOUND_STATUS)
    private Integer outboundStatus;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    @ExcelProperty("更新时间")
    private LocalDateTime updateTime;

    @Schema(description = "备注")
    @ExcelProperty("特别说明")
    private String remark;
}
