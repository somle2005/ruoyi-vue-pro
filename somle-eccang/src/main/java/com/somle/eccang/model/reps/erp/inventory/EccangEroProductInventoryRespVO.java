package com.somle.eccang.model.reps.erp.inventory;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangEroProductInventoryRespVO {
    // 产品SKU代码
    private String productSku;
    
    // 产品中文名称
    private String productTitle;
    
    // 产品英文名称
    private String productTitleEn;
    
    // 产品重量(千克)
    private Float productWeight;
    
    // 仓库ID
    private Integer warehouseId;
    
    // 仓库代码
    private String warehouseCode;
    
    // 仓库名称
    private String warehouseName;
    
    // 产品销售状态ID
    private Integer saleStatus;
    
    // ===== 库存相关字段 =====
    private Integer piPurchaseOnwayQty;  // 采购在途数量
    private Integer piReturnOnwayQty;    // 退件在途数量
    private Integer piPendingQty;       // 待上架数量
    private Integer piInUsedQty;        // 可用数量
    private Integer piWarningQty;       // 预警数量
    private Integer piSellableQty;      // 可销数量
    private Integer piSharedQty;        // 分销数量
    private Float piCanSaleDays;        // 可售天数
    private Integer piReservedQty;      // 待出数量
    private Integer piNoStockQty;       // 缺货数量
    private Integer piNoStockDays;      // 缺货天数
    private Integer piUnsellableQty;    // 不良品数量
    private Integer piOutboundQty;      // 待出不良品数量
    
    // ===== 成本相关字段 =====
    private Float inventoryCost;       // 库存成本
    private String currencyCode;        // 币种
    
    // ===== 其他字段 =====
    private LocalDateTime piUpdateTime;  // 最后更新时间
    private String actualUseableInventory; // 实际可用库存
    private Integer piPlannedQty;        // 计划库存数量
    private Integer purchaseQuantity;    // 采购库存数量
}