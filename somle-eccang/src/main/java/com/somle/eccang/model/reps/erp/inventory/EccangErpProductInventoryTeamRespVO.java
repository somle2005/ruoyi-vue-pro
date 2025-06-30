package com.somle.eccang.model.reps.erp.inventory;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpProductInventoryTeamRespVO {
    
    // 产品基础信息
    private String productSku;        // 产品SKU代码
    private String productTitle;      // 名称CN
    private String productTitleEn;    // 名称EN
    private Float productWeight;      // 重量, 单位Kg
    
    // 仓库信息
    private Integer warehouseId;      // 仓库Id
    private String warehouseCode;     // 仓库代码
    private String warehouseName;     // 仓库名称
    
    // 销售与团队信息
    private Integer saleStatus;        // 产品销售状态Id
    private Integer orgId;            // 团队ID
    private String orgName;           // 团队名称
    private String orgNameComplete;   // 团队全称
    
    // 库存数量信息
    private Integer piPurchaseOnwayQty;   // 采购在途数量
    private Integer piReturnOnwayQty;     // 退件在途数量
    private Integer piPendingQty;         // 待上架数量
    private Integer piInUsedQty;          // 可用数量
    private Integer piSellableQty;        // 可销数量
    private Float piCanSaleDays;         // 可售天数
    private Integer piReservedQty;       // 待出数量
    private Integer piNoStockQty;        // 缺货数量
    private Integer piNoStockDays;       // 缺货天数
    private Integer piUnsellableQty;     // 不良品数量
    private Integer piOutboundQty;       // 待出不良品数量
    
    // 成本与货币信息
    private Float inventoryCost;      // 库存成本
    private String currencyCode;      // 币种
    
    // 时间信息
    private LocalDateTime piUpdateTime;  // 最后更新时间
    
    // 其他库存指标
    private Integer actualUsableInventoryQty;  // 实际可用库存
    private Integer purchaseQuantity;        // 采购库存
}