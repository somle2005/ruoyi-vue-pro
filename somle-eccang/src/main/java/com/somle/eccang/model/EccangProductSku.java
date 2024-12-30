package com.somle.eccang.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class EccangProductSku {

    @Id
    private String id;//productSKU + "-" + warehouseCode;联合ID，（一个产品id+一个仓库id）绝对唯一

    @PrePersist  // 在JPA持久化之前执行
    public void generateId() {
        if (id == null || id.isEmpty()) {
            id = productSku + "-" + warehouseCode;
        }
    }

    @JsonProperty("product_sku")  // JSON字段名映射到Java字段
    private String productSku;  // 商品SKU，唯一标识符

    @JsonProperty("product_title")
    private String productTitle;  // 商品标题（中文）

    @JsonProperty("product_title_en")
    private String productTitleEn;  // 商品标题（英文）

    @JsonProperty("product_weight")
    private BigDecimal productWeight;  // 商品重量（单位：kg）

    @JsonProperty("warehouse_code")
    private String warehouseCode;  // 仓库编码

    @JsonProperty("warehouse_name")
    private String warehouseName;  // 仓库名称（中文）

    @JsonProperty("warehouse_id")
    private String warehouseId;  // 仓库ID

    @JsonProperty("pi_warning_qty")
    private BigDecimal piWarningQty;  // 库存预警数量

    @JsonProperty("pi_can_sale_days")
    private BigDecimal piCanSaleDays;  // 可售天数

    @JsonProperty("purchase_quantity")
    private BigDecimal purchaseQuantity;  // 采购数量

    @JsonProperty("pi_purchase_onway_qty")
    private BigDecimal piPurchaseOnwayQty;  // 采购在途数量

    @JsonProperty("currency_code")
    private String currencyCode;  // 货币代码，如RMB

    @JsonProperty("pi_planned_qty")
    private BigDecimal piPlannedQty;  // 计划数量

    @JsonProperty("pi_unsellable_qty")
    private BigDecimal piUnsellableQty;  // 不可售库存数量

    @JsonProperty("pi_in_used_qty")
    private BigDecimal piInUsedQty;  // 在用库存数量

    @JsonProperty("pi_shared_qty")
    private BigDecimal piSharedQty;  // 共享库存数量

    @JsonProperty("pi_pending_qty")
    private BigDecimal piPendingQty;  // 待处理库存数量

    @JsonProperty("pi_sellable_qty")
    private BigDecimal piSellableQty;  // 可售库存数量

    @JsonProperty("pi_return_onway_qty")
    private BigDecimal piReturnOnwayQty;  // 退货在途数量

    @JsonProperty("pi_no_stock_days")
    private BigDecimal piNoStockDays;  // 无库存天数

    @JsonProperty("pi_reserved_qty")
    private BigDecimal piReservedQty;  // 保留库存数量

    @JsonProperty("pi_outbound_qty")
    private BigDecimal piOutboundQty;  // 已发货数量

    @JsonProperty("actual_usable_inventory_qty")
    private BigDecimal actualUsableInventoryQty;  // 实际可用库存数量

    @JsonProperty("pi_no_stock_qty")
    private BigDecimal piNoStockQty;  // 无库存数量

    @JsonProperty("sale_status")
    private String saleStatus;  // 销售状态（1：可售，2：不可售）

    @JsonProperty("pi_update_time")
    private String piUpdateTime;  // 库存信息更新时间（格式：yyyy-MM-dd HH:mm:ss）东八区

    @JsonIgnoreProperties
    private String syncFrom;// 从哪里同步的？eccang
}
