package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product;

import cn.iocoder.yudao.module.system.api.utils.Validation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.math.BigDecimal;

@Schema(description = "管理后台 - ERP 供应商产品新增/修改 Request VO")
@Data
public class SrmSupplierProductSaveReqVO {

    @Schema(description = "供应商产品编号")
    @NotNull(groups = Validation.OnUpdate.class, message = "供应商产品编号不能为空")
    private Long id;

    @Schema(description = "供应商产品编码")
    @Pattern(regexp = "^[a-zA-Z0-9-]+$", message = "SKU（编码）只能包含字母、数字、中划线")
    private String code;

    @Schema(description = "供应商编号")
    @NotNull(message = "供应商编号不能为空")
    private Long supplierId;

    @Schema(description = "产品编号")
    @NotNull(message = "产品编号不能为空")
    private Long productId;

    @NotNull(message = "包装数量不能为空")
    @Schema(description = "包装高度")
    private Double packageHeight;

    @NotNull(message = "包装数量不能为空")
    @Schema(description = "包装长度")
    private Double packageLength;

    @NotNull(message = "包装数量不能为空")
    @Schema(description = "包装重量")
    private Double packageWeight;

    @NotNull(message = "包装数量不能为空")
    @Schema(description = "包装宽度")
    private Double packageWidth;

    @Schema(description = "采购价格", example = "25304")
    private Double purchasePrice;

    @Schema(description = "采购货币代码")
    @NotNull(message = "采购货币代码不能为空")
    private Integer purchasePriceCurrencyCode;

    @Schema(description = "上次采购价格")
    private BigDecimal lastPurchasePrice;

    @Schema(description = "税率")
    private BigDecimal taxRate;

    @Schema(description = "是否默认供应商")
    private Boolean defaultSupplier;

    @Schema(description = "版本号")
    @NotNull(groups = Validation.OnUpdate.class, message = "修改时,版本号不能为空")
    private Integer version;
}