package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 头程申请表明细分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TmsFirstMileRequestItemPageReqVO extends PageParam {

    @Schema(description = "明细编号", example = "10617")
    private Long id;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

    @Schema(description = "产品id")
    private Long productId;

    @Schema(description = "FBA条码")
    private String fbaBarCode;

    @Schema(description = "申请数量")
    private Integer qty;

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

    @Schema(description = "订购状态")
    private Integer orderStatus;

    @Schema(description = "关闭状态")
    private Integer offStatus;

    @Schema(description = "已订购数")
    private Integer orderClosedQty;

}