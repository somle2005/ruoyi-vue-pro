package cn.iocoder.yudao.module.erp.controller.admin.product.vo.product.xxxx;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - ERP xxxx产品新增/修改 Request VO")
@Data
public class ErpProductXxxxSaveReqVO {

    @Schema(description = "编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "7892")
    private Long id;

    @Schema(description = "产品主表id", requiredMode = Schema.RequiredMode.REQUIRED, example = "12275")
    @NotNull(message = "产品主表id不能为空")
    private Long productId;

    @Schema(description = "大小")
    private Double size;

    @Schema(description = "地址")
    private String address;

}