package cn.iocoder.yudao.module.tms.controller.admin.fee.vo;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 出运订单费用明细分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TmsFeePageReqVO extends PageParam {

    @Schema(description = "原单类型;出运订单、调拨单", example = "2")
    private String sourceType;

    @Schema(description = "原单ID;出运订单ID、调拨单ID", example = "27529")
    private Long sourceId;

    @Schema(description = "费用类型（如运输费、关税）;字典", example = "1")
    private Integer costType;

    @Schema(description = "金额")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private BigDecimal[] amount;

    @Schema(description = "币种;名称（如 USD、CNY） 字典", example = "2")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private Integer[] currencyType;

    @Schema(description = "备注", example = "你猜")
    private String remark;

    @Schema(description = "乐观锁版本号")
    private Integer revision;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}