package cn.iocoder.yudao.module.tms.controller.admin.fee.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - 出运订单费用明细新增/修改 Request VO")
@Data
public class TmsFeeSaveReqVO {

    @Schema(description = "主键ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "4931")
    private Long id;

    @Schema(description = "原单类型;出运订单、调拨单", example = "2")
    private String sourceType;

    @Schema(description = "原单ID;出运订单ID、调拨单ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "27529")
    @NotNull(message = "原单ID不能为空")
    private Long sourceId;

    @Schema(description = "费用类型（如运输费、关税）;字典", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "费用类型不能为空")
    private Integer costType;

    @Schema(description = "金额", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "金额不能为空")
    private BigDecimal amount;

    @Schema(description = "币种;名称（如 USD、CNY） 字典", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "币种;不能为空")
    private Integer currencyType;

    @Schema(description = "备注", example = "你猜")
    private String remark;

}