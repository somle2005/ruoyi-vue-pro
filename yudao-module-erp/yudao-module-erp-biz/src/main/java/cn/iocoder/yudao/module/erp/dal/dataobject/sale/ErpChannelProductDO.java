package cn.iocoder.yudao.module.erp.dal.dataobject.sale;

import lombok.*;

import java.math.BigDecimal;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.*;
import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;

/**
 * ERP 渠道平台产品 DO
 *
 * @author 王奇辉
 */
@TableName("erp_channel_product")
@KeySequence("erp_channel_product_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErpChannelProductDO extends BaseDO {

    /**
     * 渠道产品编号
     */
    @TableId
    private Long id;
    /**
     * 渠道产品编码
     */
    private String code;
    /**
     * 渠道产品名称
     */
    private String name;
    /**
     * 渠道产品状态（1启用，0禁用）
     */
    private Boolean status;
    /**
     * 渠道编号
     */
    private Integer channelId;
    /**
     * 产品编号
     */
    private Integer productId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 链接地址
     */
    private String url;
    /**
     * 底价
     */
    private BigDecimal bottomPrice;
    /**
     * 负责人id
     */
    private String ownerId;

}