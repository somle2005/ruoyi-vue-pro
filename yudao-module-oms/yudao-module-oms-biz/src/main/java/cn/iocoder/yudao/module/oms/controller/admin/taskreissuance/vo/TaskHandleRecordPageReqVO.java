package cn.iocoder.yudao.module.oms.controller.admin.taskreissuance.vo;

import lombok.*;
import java.util.*;
import io.swagger.v3.oas.annotations.media.Schema;
import cn.iocoder.yudao.framework.common.pojo.PageParam;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.util.date.DateUtils.FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND;

@Schema(description = "管理后台 - 任务信息分页 Request VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
public class TaskHandleRecordPageReqVO extends PageParam {

    @Schema(description = "任务标识")
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
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] requireHandleTime;

    @Schema(description = "完成处理时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] completeHandleTime;

    @Schema(description = "创建时间")
    @DateTimeFormat(pattern = FORMAT_YEAR_MONTH_DAY_HOUR_MINUTE_SECOND)
    private LocalDateTime[] createTime;

}