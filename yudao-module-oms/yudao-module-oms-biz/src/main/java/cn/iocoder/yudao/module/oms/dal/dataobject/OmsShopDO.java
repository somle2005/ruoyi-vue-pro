package cn.iocoder.yudao.module.oms.dal.dataobject;

import cn.iocoder.yudao.framework.tenant.core.db.TenantBaseDO;
import com.baomidou.mybatisplus.annotation.*;
import lombok.*;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

/**
 * OMS店铺表
 */
@TableName("oms_shop_maomao")
@KeySequence("oms_shop_maomao_seq") // 用于 Oracle、PostgreSQL、Kingbase、DB2、H2 数据库的主键自增。如果是 MySQL 等数据库，可不写。
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OmsShopDO extends TenantBaseDO {
    /**
     * 店铺id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 店铺名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 原始店铺名称
     */
    @TableField(value = "plat_shop_name")
    private String platShopName;

    /**
     * 店铺编码
     */
    @TableField(value = "code")
    private String code;

    /**
     * 原始店铺编码
     */
    @TableField(value = "plat_shop_code")
    private String platShopCode;

    /**
     * 平台id
     */
    @TableField(value = "plat_id")
    private Long platId;

    /**
     * 平台名称
     */
    @TableField(value = "plat_name")
    private String platName;

    /**
     * 国家代码
     */
    @TableField(value = "country_code")
    private String countryCode;

    /**
     * 大区代码
     */
    @TableField(value = "region_code")
    private String regionCode;

    /**
     * 货币单位代码
     */
    @TableField(value = "currency_code")
    private String currencyCode;

    /**
     * 语言代码
     */
    @TableField(value = "language_code")
    private String languageCode;

    /**
     * 店铺域名
     */
    @TableField(value = "domain_name")
    private String domainName;

    /**
     * 卖家id
     */
    @TableField(value = "seller_id")
    private String sellerId;

    /**
     * token表主键
     */
    @TableField(value = "auth_id")
    private Long authId;

    /**
     * 原始json
     */
    @TableField(value = "original_json")
    private String originalJson;

    /**
     * 店铺在销售平台的唯一ID
     */
    @TableField(value = "platform_shop_uid")
    private String platformShopUid;
}