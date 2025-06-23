package cn.iocoder.yudao.module.system.controller.admin.user.vo.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.*;

import jakarta.validation.constraints.*;

@Schema(description = "管理后台 - 用户配置新增/修改 Request VO")
@Data
public class SystemUserConfigSaveReqVO {

    @Schema(description = "用户id", requiredMode = Schema.RequiredMode.REQUIRED, example = "12182", hidden = true)
    private Long userId;

    @Schema(description = "配置键", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "配置键不能为空")
    private String configKey;

    @Schema(description = "配置值", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "配置值不能为空")
    private String configValue;

    @Schema(description = "作用域（1前端 2后端）", hidden = true)
    private Integer scope;

}