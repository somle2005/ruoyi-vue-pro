package cn.iocoder.yudao.module.oms.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * ERP 店铺表
 */
@Data
@TableName(value = "erp_shop")
public class ErpShop {
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
    private Integer authId;

    /**
     * 原始json
     */
    @TableField(value = "original_json")
    private String originalJson;

    /**
     * 创建者
     */
    @TableField(value = "creator")
    private String creator;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @TableField(value = "updater")
    private String updater;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;

    /**
     * 是否删除
     */
    @TableField(value = "deleted")
    private Integer deleted;
}