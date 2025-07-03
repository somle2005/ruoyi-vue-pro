package cn.iocoder.yudao.module.srm.controller.admin.purchase.vo.supplier.product;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "批量获取产品+供应商的上一次成交价-查询参数")
public class SrmSupplierProductDefaultLastPriceQueryVO {
    @Schema(description = "供应商ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "供应商ID不能为空")
    private Long supplierId;

    @Schema(description = "产品ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "产品ID不能为空")
    private Long productId;

}