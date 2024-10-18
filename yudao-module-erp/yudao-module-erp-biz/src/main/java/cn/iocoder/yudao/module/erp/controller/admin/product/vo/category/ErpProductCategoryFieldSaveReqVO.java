package cn.iocoder.yudao.module.erp.controller.admin.product.vo.category;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - 产品分类自定义字段中间新增/修改 Request VO")
@Data
public class ErpProductCategoryFieldSaveReqVO {

    @Schema(description = "分类id", requiredMode = Schema.RequiredMode.REQUIRED, example = "27828")
    @NotNull(message = "分类id不能为空")
    private Long categoryId;

    @Schema(description = "字段id", requiredMode = Schema.RequiredMode.REQUIRED, example = "20464")
    @NotNull(message = "字段id不能为空")
    private Long fieldId;

}