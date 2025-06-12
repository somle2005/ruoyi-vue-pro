package cn.iocoder.yudao.module.oms.api.dto;

import lombok.*;

import java.time.LocalDateTime;

/**
 * 任务信息 DO
 *
 * @author 谷毛毛
 */
@Data
@Builder
public class TaskHandleRecordDTO {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 任务标识
     */
    private String taskTag;
    /**
     * 处理参数
     */
    private String handleParam;
    /**
     * 处理状态 0待处理 1处理成功 2处理失败 3处理中
     */
    private Integer handleStatus;
    /**
     * 处理结果
     */
    private String handleResult;
    /**
     * 当前处理次数
     */
    private Integer handleTimes;
    /**
     * 要求处理时间
     */
    private LocalDateTime requireHandleTime;
    /**
     * 完成处理时间
     */
    private LocalDateTime completeHandleTime;


//    private Long handleCostTime;

}