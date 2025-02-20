package cn.iocoder.yudao.module.erp.controller.admin.logistic.customrule.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - ERP 海关规则新增/修改 Request VO")
@Data
public class ErpCustomRuleSaveReqVO {

    @Schema(description = "海关规则id", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long id;

    @Schema(description = "国家编码", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "国家编码不能为空")
    private Integer countryCode;


    @Schema(description = "产品id", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "产品id不能为空")
    private Long productId;

    @Schema(description = "申报品名（英文）")
    @NotEmpty(message = "申报品名（英文）不能为空")
    @Pattern(regexp = "^[^\\r\\n]*$", message = "申报品名（英文）不能包含换行符")
    @Pattern(regexp = "^\\S.*\\S$", message = "申报品名（英文）开头和结尾不能是空格")
    private String declaredTypeEn;

    @Schema(description = "申报品名")
    @Pattern(regexp = "^[^\\r\\n]*$", message = "申报品名不能包含换行符")
    @Pattern(regexp = "^\\S.*\\S$", message = "申报品名里开头和结尾不能是空格")
    private String declaredType;

    @Schema(description = "申报金额")
    @NotNull(message = "申报金额不能为空")
    @Min(value = 0, message = "申报金额不能小于0")
    private Double declaredValue;

    @Schema(description = "申报金额币种")
    @NotNull(message = "申报金额币种不能为空")
    private Integer declaredValueCurrencyCode;

    @Schema(description = "税率")
    @Min(value = 0, message = "税率不能小于0")
    private BigDecimal taxRate;

    @Schema(description = "hs编码")
    @Pattern(regexp = "^[^\\r\\n]*$", message = "hs编码不能包含换行符")
    @Pattern(regexp = "^\\S.*\\S$", message = "hs编码里开头和结尾不能是空格")
    private String hscode;

    @Schema(description = "物流属性")
    private Integer logisticAttribute;

    @Schema(description = "条形码")
    @Pattern(regexp = "^[^\\r\\n]*$", message = "条形码不能包含换行符")
    @Pattern(regexp = "^\\S.*\\S$", message = "条形码开头和结尾不能是空格")
    private String fbaBarCode;
}