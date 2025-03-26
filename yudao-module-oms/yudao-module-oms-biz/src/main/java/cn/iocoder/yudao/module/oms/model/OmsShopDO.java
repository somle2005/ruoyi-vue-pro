package cn.iocoder.yudao.module.oms.model;

import cn.iocoder.yudao.framework.mybatis.core.dataobject.BaseDO;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;

/**
 * ERP 店铺表
 */
@Data
@TableName(value = "oms_shop")
public class OmsShopDO extends BaseDO {

    @Serial
    private static final long serialVersionUID = -4115052302108641698L;

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

}