package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.tvstand;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

@Schema(description = "管理后台 - ERP 电视机架产品新增/修改 Request VO")
@Data
@Builder
public class ErpProductTvStandSaveReqVO {

//    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "20264")
//    private Long id;
//
//    @Schema(description = "产品主表id", requiredMode = Schema.RequiredMode.REQUIRED, example = "12330")
//    @NotNull(message = "产品主表id不能为空")
//    private Long productId;

    @Schema(description = "层板承重")
    private String shelfLoadCapacity;

    @Schema(description = "层板数量", example = "22979")
    private Integer shelvesCount;

    @Schema(description = "电视调节方式")
    private String tvAdjustmentMethod;

    @Schema(description = "层板调节方式")
    private String shelfAdjustmentMethod;

    @Schema(description = "设计说明", example = "随便")
    private String description;

    @Schema(description = "宽度最大值")
    private BigDecimal widthMax;

    @Schema(description = "宽度最小值")
    private BigDecimal widthMin;

    @Schema(description = "长度最大值")
    private BigDecimal lengthMax;

    @Schema(description = "长度最小值")
    private BigDecimal lengthMin;

}