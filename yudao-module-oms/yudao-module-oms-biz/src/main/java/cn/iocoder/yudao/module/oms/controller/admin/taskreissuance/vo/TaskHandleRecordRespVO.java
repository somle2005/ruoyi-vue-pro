package cn.iocoder.yudao.module.oms.controller.admin.taskreissuance.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;
import com.alibaba.excel.annotation.*;

@Schema(description = "管理后台 - 任务信息 Response VO")
@Data
@ExcelIgnoreUnannotated
public class TaskHandleRecordRespVO {

    @Schema(description = "主键id", requiredMode = Schema.RequiredMode.REQUIRED, example = "11704")
    @ExcelProperty("主键id")
    private Long id;

    @Schema(description = "任务标识", requiredMode = Schema.RequiredMode.REQUIRED)
    @ExcelProperty("任务标识")
    private String taskTag;

    @Schema(description = "处理参数")
    @ExcelProperty("处理参数")
    private String handleParam;

    @Schema(description = "处理状态 0待处理 1处理成功 2处理失败 3处理中", example = "2")
    @ExcelProperty("处理状态 0待处理 1处理成功 2处理失败 3处理中")
    private Integer handleStatus;

    @Schema(description = "处理结果")
    @ExcelProperty("处理结果")
    private String handleResult;

    @Schema(description = "当前处理次数")
    @ExcelProperty("当前处理次数")
    private Integer handleTimes;

    @Schema(description = "要求处理时间")
    @ExcelProperty("要求处理时间")
    private LocalDateTime requireHandleTime;

    @Schema(description = "完成处理时间")
    @ExcelProperty("完成处理时间")
    private LocalDateTime completeHandleTime;

    @Schema(description = "创建时间")
    @ExcelProperty("创建时间")
    private LocalDateTime createTime;

}