package cn.iocoder.yudao.module.tms.controller.admin.first.mile.item.vo;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 头程单明细分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TmsFirstMileItemPageReqVO extends PageParam {

    @Schema(description = "创建人ID")
    private Long creator;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

    @Schema(description = "更新人ID")
    private Long updater;

    @Schema(description = "更新时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] updateTime;

    @Schema(description = "申请项ID")
    private Integer requestItemId;

    @Schema(description = "产品ID")
    private Integer productId;

    @Schema(description = "箱数")
    private Integer[] boxQty;

    @Schema(description = "库存公司")
    private Long companyId;

    @Schema(description = "库存归属部门ID")
    private Long deptId;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "实际发货数")
    private Integer[] outboundClosedQty;

    @Schema(description = "计划发货数")
    private Integer[] outboundPlanQty;

    @Schema(description = "已入库数量")
    private Integer[] inboundClosedQty;

    @Schema(description = "发出仓ID")
    private Long fromWarehouseId;

    @Schema(description = "包装长（cm）")
    private BigDecimal[] packageLength;

    @Schema(description = "包装宽（cm）")
    private BigDecimal[] packageWidth;

    @Schema(description = "包装高（cm）")
    private BigDecimal[] packageHeight;

    @Schema(description = "毛重（kg）")
    private BigDecimal[] packageWeight;

    @Schema(description = "体积（m³）")

    private BigDecimal[] volume;

}