package cn.iocoder.yudao.module.system.controller.admin.field.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 字段属性 Response VO")
@Data
@ExcelIgnoreUnannotated
public class SystemFieldRespVO {

    @Schema(description = "数据类型ID", requiredMode = Schema.RequiredMode.REQUIRED, example = "27620")
    @ExcelProperty("数据类型ID")
    private Long id;

    @Schema(description = "属性名称", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("属性名称")
    private String attribute;

    @Schema(description = "属性名对应键", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("属性名对应键")
    private String key;

    @Schema(description = "显示顺序", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("显示顺序")
    private Integer sort;

    @Schema(description = "是否必须", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("是否必须")
    private Boolean require;

    @Schema(description = "数据类型", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @ExcelProperty("数据类型")
    private Integer type;

    @Schema(description = "创建时间", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}