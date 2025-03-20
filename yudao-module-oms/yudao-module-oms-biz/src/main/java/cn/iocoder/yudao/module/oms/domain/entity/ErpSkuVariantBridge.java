package cn.iocoder.yudao.module.oms.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * ERP平台sku变体关联表
 */
@Data
@TableName(value = "erp_sku_variant_bridge")
public class ErpSkuVariantBridge {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父id
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 父sku
     */
    @TableField(value = "parent_sku")
    private String parentSku;

    /**
     * 子id
     */
    @TableField(value = "child_id")
    private Long childId;

    /**
     * 子sku
     */
    @TableField(value = "child_sku")
    private String childSku;

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