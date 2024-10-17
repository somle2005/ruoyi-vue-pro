package cn.iocoder.yudao.module.system.controller.admin.data.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - 字段属性新增/修改 Request VO")
@Data
public class SystemDataTypeSaveReqVO {

    @Schema(description = "数据类型ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "27620")
    private Long id;

    @Schema(description = "属性名称", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "属性名称不能为空")
    private String attribute;

    @Schema(description = "属性名对应键", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "属性名对应键不能为空")
    private String key;

    @Schema(description = "显示顺序", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "显示顺序不能为空")
    private Integer sort;

    @Schema(description = "是否必须", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotNull(message = "是否必须不能为空")
    private Boolean require;

    @Schema(description = "数据类型", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "数据类型不能为空")
    private Integer type;

}