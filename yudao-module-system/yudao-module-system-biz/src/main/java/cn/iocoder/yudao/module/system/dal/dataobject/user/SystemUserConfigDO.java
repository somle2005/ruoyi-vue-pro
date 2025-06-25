package cn.iocoder.yudao.module.system.dal.dataobject.user;

import lombok.*;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 用户配置 DO
 *
 * @author 高巍
 */
@TableName("system_user_config")
@KeySequence("system_user_config_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemUserConfigDO extends BaseDO {

    /**
     * ID
     */
    @TableId
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 配置键
     */
    private String configKey;
    /**
     * 配置值
     */
    private String configValue;
    /**
     * 作用域（1前端 2后端）
     */
    private Integer scope;

    /**
     * 覆盖父类字典，允许物理删除
     */
    private Boolean deleted;
}