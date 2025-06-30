package com.somle.eccang.model.req.erp.inventory;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpProductInventoryReqVO {
    // 产品SKU数组
    private List<String> productSku;
    
    // 产品SKU模糊查询(多个)
    private List<String> productSkuLike;
    
    // 产品名称
    private String productTitle;
    
    // 产品名称模糊查询
    private String productTitleLike;
    
    // 产品英文名称模糊查询
    private String productTitleEnLike;
    
    // 产品销售状态Id
    private Integer saleStatus;
    
    // 仓库Id
    private Integer warehouseId;
    
    // 仓库代码
    private String warehouseCode;
    
    // 默认供应商代码
    private String defaultSupplierCode;
    
    // 产品创建时间-开始时间(格式:YYYY-MM-DD)
    private LocalDate productAddTimeFrom;
    
    // 产品创建时间-截止时间(格式:YYYY-MM-DD)
    private LocalDate productAddTimeTo;

    private Integer page;

    private Integer pageSize;
    
    // 起始更新时间(格式:YYYY-MM-DD)
    private LocalDate updateTimeFrom;
    
    // 结束更新时间(格式:YYYY-MM-DD)
    private LocalDate updateTimeTo;
    
    // 是否缺货: 0: 全部 1: 是 2: 否
    private Integer isOutStock;
}