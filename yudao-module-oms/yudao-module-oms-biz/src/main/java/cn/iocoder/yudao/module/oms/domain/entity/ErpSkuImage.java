package cn.iocoder.yudao.module.oms.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * ERP平台sku图片联表
 */
@Data
@TableName(value = "erp_sku_image")
public class ErpSkuImage {
    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    @TableField(value = "sku_id")
    private Long skuId;

    /**
     * sku
     */
    @TableField(value = "sku")
    private String sku;

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
     * 模式类型,standard,parent,child
     */
    @TableField(value = "pattern_type")
    private String patternType;

    /**
     * 平台图片id
     */
    @TableField(value = "plat_src_id")
    private String platSrcId;

    /**
     * 平台顺序号
     */
    @TableField(value = "`position`")
    private Integer position;

    /**
     * 图片地址
     */
    @TableField(value = "url")
    private String url;

    /**
     * 是否主图0否1是
     */
    @TableField(value = "main_flag")
    private Integer mainFlag;

    /**
     * 平台的图片创建时间
     */
    @TableField(value = "created_at")
    private String createdAt;

    /**
     * 平台的图片更新时间
     */
    @TableField(value = "updated_at")
    private String updatedAt;

    /**
     * 图片宽度
     */
    @TableField(value = "width")
    private Integer width;

    /**
     * 图片高度
     */
    @TableField(value = "height")
    private Integer height;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ErpSkuImage that = (ErpSkuImage) o;

        if (!Objects.equals(skuId, that.skuId)) return false;
        return Objects.equals(platSrcId, that.platSrcId);
    }

    @Override
    public int hashCode() {
        int result = skuId != null ? skuId.hashCode() : 0;
        result = 31 * result + (platSrcId != null ? platSrcId.hashCode() : 0);
        return result;
    }
}