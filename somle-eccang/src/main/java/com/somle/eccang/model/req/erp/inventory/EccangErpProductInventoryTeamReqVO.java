package com.somle.eccang.model.req.erp.inventory;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpProductInventoryTeamReqVO {

    // 产品SKU列表（多个）
    private List<String> productSku;

    // 产品SKU模糊查询（多个）
    private List<String> productSkuLike;

    // 产品名称
    private String productTitle;

    // 产品名称模糊查询
    private String productTitleLike;

    // 产品英文名称模糊查询
    private String productTitleEnLike;

    // 产品销售状态ID
    private Integer saleStatus;

    // 仓库ID
    private Integer warehouseId;

    // 仓库代码
    private String warehouseCode;

    // 默认供应商代码
    private String defaultSupplierCode;
    private LocalDateTime productAddTimeFrom;
    private LocalDateTime productAddTimeTo;
    private Integer page;
    private Integer pageSize;
    private LocalDateTime updateTimeFrom;
    private LocalDateTime updateTimeTo;
    private Integer orgId;
    private String orgName;
}