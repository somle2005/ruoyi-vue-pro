package cn.iocoder.yudao.module.erp.dal.dataobject.sale;

import lombok.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * ERP 渠道 DO
 *
 * @author 王奇辉
 */
@TableName("erp_channel")
@KeySequence("erp_channel_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpChannelDO extends BaseDO {

    public static final Long PARENT_ID_ROOT = 0L;
    /**
     * 渠道编号
     */
    @TableId
    private Long id;
    /**
     * 渠道编码
     */
    private String code;
    /**
     * 渠道名称
     */
    private String name;
    /**
     * 渠道状态（1启用，0禁用）
     */
    private Boolean status;
    /**
     * 父渠道编号
     */
    private Long parentId;

}