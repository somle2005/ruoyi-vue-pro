package cn.iocoder.yudao.module.erp.controller.admin.shop.product.item.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - ERP 店铺产品项新增/修改 Request VO")
@Data
public class ErpShopProductItemSaveReqVO {

    @Schema(description = "店铺产品项编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "15443")
    private Long id;

    @Schema(description = "产品编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "27593")
    @NotNull(message = "产品编号不能为空")
    private Long productId;

    @Schema(description = "备注", example = "你说的对")
    private String remark;

}