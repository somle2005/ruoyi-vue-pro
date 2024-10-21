package cn.iocoder.yudao.module.system.dal.dataobject.value;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 自定义字段值 DO
 *
 * @author 索迈管理员
 */
@TableName("system_value")
@KeySequence("system_value_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemValueDO extends BaseDO {

    /**
     * ID
     */
    @TableId
    private Long id;
    /**
     * 实体类id
     */
    private Long classId;
    /**
     * 字段id
     */
    private Long fieldId;
    /**
     * 值
     */
    private String value;
    /**
     * 数据库表名
     */
    private String table;

}