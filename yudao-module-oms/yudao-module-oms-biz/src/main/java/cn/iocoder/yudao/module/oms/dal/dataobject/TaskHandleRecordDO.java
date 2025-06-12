package cn.iocoder.yudao.module.oms.dal.dataobject;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 任务信息 DO
 *
 * @author 谷毛毛
 */
@TableName("task_handle_record")
@KeySequence("task_handle_record_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskHandleRecordDO extends BaseDO {

    /**
     * 主键id
     */
    @TableId
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