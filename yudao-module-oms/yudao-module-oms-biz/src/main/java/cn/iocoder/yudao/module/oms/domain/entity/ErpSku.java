package cn.iocoder.yudao.module.oms.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * ERP平台sku表
 */
@Data
@TableName(value = "erp_sku")
public class ErpSku {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 平台sku
     */
    @TableField(value = "sku")
    private String sku;

    /**
     * 平台skuId
     */
    @TableField(value = "sku_id")
    private Long skuId;

    /**
     * 店铺id
     */
    @TableField(value = "store_id")
    private Long storeId;

    /**
     * 店铺名称
     */
    @TableField(value = "store_name")
    private String storeName;

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
     * 原始店铺编码
     */
    @TableField(value = "plat_shop_code")
    private String platShopCode;

    /**
     * 平台sku的唯一号,如asin
     */
    @TableField(value = "plat_sku_code")
    private String platSkuCode;

    /**
     * 产品类型
     */
    @TableField(value = "product_type")
    private String productType;

    /**
     * 状态类型,新旧情况
     */
    @TableField(value = "condition_type")
    private String conditionType;

    /**
     * 是否可购买0否1是
     */
    @TableField(value = "buyable_status")
    private Integer buyableStatus;

    /**
     * 是否预售0否1是
     */
    @TableField(value = "preorder_status")
    private Integer preorderStatus;

    /**
     * 是否已上架0否1是
     */
    @TableField(value = "discoverable_status")
    private Integer discoverableStatus;

    /**
     * 产品标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 产品重量
     */
    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 产品重量单位
     */
    @TableField(value = "weight_unit")
    private String weightUnit;

    /**
     * upc
     */
    @TableField(value = "upc")
    private String upc;

    /**
     * gtin
     */
    @TableField(value = "gtin")
    private String gtin;

    /**
     * 条形码
     */
    @TableField(value = "barcode")
    private String barcode;

    /**
     * 标签
     */
    @TableField(value = "`label`")
    private String label;

    /**
     * 描述
     */
    @TableField(value = "`describe`")
    private String describe;

    /**
     * 主图url
     */
    @TableField(value = "main_image_url")
    private String mainImageUrl;

    /**
     * 创建时间
     */
    @TableField(value = "created_at")
    private String createdAt;

    /**
     * 修改时间
     */
    @TableField(value = "updated_at")
    private String updatedAt;

    /**
     * 上架时间
     */
    @TableField(value = "listing_time")
    private String listingTime;

    /**
     * 上架更新时间
     */
    @TableField(value = "listing_update_time")
    private String listingUpdateTime;

    /**
     * 征税状态0征税1不征税
     */
    @TableField(value = "taxable")
    private Integer taxable;

    /**
     * 供应商名称
     */
    @TableField(value = "vendor")
    private String vendor;

    /**
     * 变体的顺序号
     */
    @TableField(value = "variant_position")
    private Integer variantPosition;

    /**
     * spuId
     */
    @TableField(value = "spu_id")
    private Long spuId;

    /**
     * spu标题
     */
    @TableField(value = "spu_title")
    private String spuTitle;

    /**
     * spu创建时间
     */
    @TableField(value = "spu_created_at")
    private String spuCreatedAt;

    /**
     * spu更新时间
     */
    @TableField(value = "spu_updated_at")
    private String spuUpdatedAt;

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