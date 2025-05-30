package cn.iocoder.yudao.module.tms.api.first;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 头程单DTO
 */
@Data
public class TmsFistMileDTO {

    /**
     * 头程单ID
     */
    private Long id;
    /**
     * 审核状态
     */
    private Integer auditStatus;
    /**
     * 审核意见
     */
    private String reviewComment;

    /**
     * 实际送仓时间
     */
    private LocalDateTime deliveryActualTime;
    /**
     * 发货状态
     */
    private Integer outboundStatus;
    /**
     * 出库时间
     */
    private LocalDateTime outboundTime;
    /**
     * 入库状态
     */
    private Integer inboundStatus;
    /**
     * 入库时间
     */
    private LocalDateTime inboundTime;
}
