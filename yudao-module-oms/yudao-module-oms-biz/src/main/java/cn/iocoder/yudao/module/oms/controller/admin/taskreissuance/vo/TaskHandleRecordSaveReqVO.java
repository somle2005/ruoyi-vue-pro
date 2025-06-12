package cn.iocoder.yudao.module.oms.controller.admin.taskreissuance.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 任务信息新增/修改 Request VO")
@Data
public class TaskHandleRecordSaveReqVO {

    @Schema(description = "主键id", requiredMode = Schema.RequiredMode.REQUIRED, example = "11704")
    private Long id;

    @Schema(description = "任务标识", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "任务标识不能为空")
    private String taskTag;

    @Schema(description = "处理参数")
    private String handleParam;

    @Schema(description = "处理状态 0待处理 1处理成功 2处理失败 3处理中", example = "2")
    private Integer handleStatus;

    @Schema(description = "处理结果")
    private String handleResult;

    @Schema(description = "当前处理次数")
    private Integer handleTimes;

    @Schema(description = "要求处理时间")
    private LocalDateTime requireHandleTime;

    @Schema(description = "完成处理时间")
    private LocalDateTime completeHandleTime;

}