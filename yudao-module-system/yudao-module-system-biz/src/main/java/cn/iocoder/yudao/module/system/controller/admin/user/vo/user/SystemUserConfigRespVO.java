package cn.iocoder.yudao.module.system.controller.admin.user.vo.user;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 用户配置 Response VO")
@Data
@ExcelIgnoreUnannotated
public class SystemUserConfigRespVO {

    @Schema(description = "ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "13557")
    @ExcelProperty("ID")
    private Long id;

    @Schema(description = "用户id", requiredMode = Schema.RequiredMode.REQUIRED, example = "12182")
    @ExcelProperty("用户id")
    private Long userId;

    @Schema(description = "配置键", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("配置键")
    private String configKey;

    @Schema(description = "配置值", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("配置值")
    private String configValue;

    @Schema(description = "作用域（1前端 2后端）", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("作用域（1前端 2后端）")
    private Integer scope;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}