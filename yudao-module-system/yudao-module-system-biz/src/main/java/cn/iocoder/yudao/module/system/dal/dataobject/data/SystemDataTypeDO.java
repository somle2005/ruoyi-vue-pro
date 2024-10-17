package cn.iocoder.yudao.module.system.dal.dataobject.data;

import lombok.*;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * 字段属性 DO
 *
 * @author 索迈管理员
 */
@TableName("system_data_type")
@KeySequence("system_data_type_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SystemDataTypeDO extends BaseDO {

    /**
     * 数据类型ID
     */
    @TableId
    private Long id;
    /**
     * 属性名称
     */
    private String attribute;
    /**
     * 属性名对应键
     */
    private String key;
    /**
     * 显示顺序
     */
    private Integer sort;
    /**
     * 是否必须
     */
    private Boolean require;
    /**
     * 数据类型
     */
    private Integer type;

}