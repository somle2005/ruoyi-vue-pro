package com.somle.eccang.model.req.erp.product;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpProductListReqVO {

    // 产品标识相关参数
    private List<String> productSku;          // 精确SKU查询（多值）[2,5](@ref)
    private String productSkuLike;            // SKU模糊查询
    private String productSpu;                // 款式代码
    private String productTitle;              // 产品名称
    private String productTitleLike;         // 名称模糊查询
    private String warehouseBarcode;          // 仓库条码
    private String warehouseBarcodeLike;     // 条码模糊查询

    // 状态标识参数
    private Integer productStatus;            // 产品状态(0/1/2)[3](@ref)
    private Integer saleStatus;               // 销售状态ID
    private String defaultSupplierCode;      // 默认供应商代码
    private Integer isQc;                     // 是否质检(0/1)
    private Integer categoryId;                // 品类ID
    private Integer isExpDate;                // 有效期标识(0/1)
    private Integer isGift;                   // 赠品标识(0/1)
    private Integer personOpraterId;          // 采购负责人ID
    private Integer prlId;                    // 产品等级ID
    private Integer isCombination;            // 组合产品标识(0/1)
    private LocalDateTime productAddTimeFrom;      // 创建时间-开始
    private LocalDateTime productAddTimeTo;         // 创建时间-截止
    private LocalDateTime productUpdateTimeFrom;    // 更新时间-开始
    private LocalDateTime productUpdateTimeTo;      // 更新时间-截止
    private LocalDateTime productReleaseTimeFrom;   // 审核时间-开始
    private LocalDateTime productReleaseTimeTo;     // 审核时间-截止
    private LocalDateTime defaultCostUpdateFrom;    // 成本更新开始时间
    private LocalDateTime defaultCostUpdateTo;      // 成本更新截止时间

    // 数据扩展参数
    private Integer getProductCombination;     // 获取组合明细(0/1)
    private Integer getProductBox;             // 获取箱规信息(0/1)
    private Integer getProperty;               // 获取自定义属性(0/1)
    private Integer getProductCustomCategory;  // 获取自定义分类(0/1)
    private Integer defaultBuyWarehouseId;     // 默认采购仓库ID
    private String logisticAttribute;          // 物流属性
    private Integer page;                  // 当前页（默认1）[5,7](@ref)
    private Integer pageSize = 50;              // 每页条数（默认50）
}