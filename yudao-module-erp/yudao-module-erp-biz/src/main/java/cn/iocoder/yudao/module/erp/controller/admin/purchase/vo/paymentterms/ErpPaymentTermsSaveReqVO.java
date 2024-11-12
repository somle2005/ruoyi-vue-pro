package cn.iocoder.yudao.module.erp.controller.admin.purchase.vo.paymentterms;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - 付款条款管理新增/修改 Request VO")
@Data
public class ErpPaymentTermsSaveReqVO {

    @Schema(description = "付款条款id", requiredMode = Schema.RequiredMode.REQUIRED, example = "31923")
    private Long id;

    @Schema(description = "付款条款编码")
    private String code;

    @Schema(description = "描述", example = "你说的对")
    private String description;

    @Schema(description = "1代表国内，0代表国外（默认国内）", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "1代表国内，0代表国外（默认国内）不能为空")
    private Boolean isDomestic;

    @Schema(description = "描述（英文）")
    private String descriptionEn;

}