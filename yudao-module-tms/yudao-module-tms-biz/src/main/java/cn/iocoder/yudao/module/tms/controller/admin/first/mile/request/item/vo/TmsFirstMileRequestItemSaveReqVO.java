package cn.iocoder.yudao.module.tms.controller.admin.first.mile.request.item.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - 头程申请表明细新增/修改 Request VO")
@Data
public class TmsFirstMileRequestItemSaveReqVO {

    @Schema(description = "ID")
    @NotNull(message = "ID不能为空")
    private Long id;

    @Schema(description = "产品id")
    private Long productId;

    @Schema(description = "FBA条码")
    private String fbaBarCode;

    @Schema(description = "申请数量", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "申请数量不能为空")
    private Integer qty;

    @Schema(description = "包装长（cm）")
    private BigDecimal packageLength;

    @Schema(description = "包装宽（cm）")
    private BigDecimal packageWidth;

    @Schema(description = "包装高（cm）")
    private BigDecimal packageHeight;

    @Schema(description = "毛重（kg）")
    private BigDecimal packageWeight;

    @Schema(description = "体积（m³）")
    private BigDecimal volume;

}