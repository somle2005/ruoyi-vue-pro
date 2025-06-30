package com.somle.eccang.model.reps.erp.product;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangErpProductListRespVO {

    // 产品基础信息
    private String productSku;                     // SKU代码
    private String productTitle;                   // 中文名称
    private String productTitleEn;                 // 英文名称
    private String productSpu;                     // 款式代码
    private Float productDeclaredValue;            // 申报价值
    private String pdDeclareCurrencyCode;          // 申报币种（如USD）
    private Float productWeight;                   // 重量（kg）
    private Float productNetWeight;                // 净重（kg）

    // 供应商信息
    private String defaultSupplierCode;            // 默认供应商代码
    private String supplierSku;                   // 供应商品号

    // 状态标识
    private String productStatus;                  // 产品状态（0/1/2）
    private Integer saleStatus;                    // 销售状态ID
    private Integer isQc;                          // 是否质检（0/1）
    private Integer isExpDate;                     // 是否存在有效期（0/1）
    private Integer isGift;                        // 是否赠品（0/1）

    // 物理属性
    private String warehouseBarcode;               // 仓库条码
    private Float productLength;                   // 长度（cm）
    private Float productWidth;                    // 宽度（cm）
    private Float productHeight;                   // 高度（cm）

    // 负责人信息
    private Integer designerId;                    // 设计师ID
    private Integer personOpraterId;               // 采购负责人ID
    private Integer personSellerId;                // 销售负责人ID
    private Integer personDevelopId;               // 开发负责人ID
    private String sellerId;                       // 附属销售员（逗号分隔）

    // 时间信息

    private LocalDateTime productAddTime;          // 创建时间


    private LocalDateTime productUpdateTime;       // 更新时间


    private LocalDateTime ppnReleaseDate;          // 审核时间

    // 产品类型
    private Integer isCombination;                 // 是否组合产品（0/1）

    // 扩展信息（根据标识返回）
    private ProductCombination productCombination; // get_product_combination=1时返回
    private ProductBox productBox;                 // get_product_box=1时返回
    private Property property;                     // get_property=1时返回

    // 规格信息
    private Integer productColorId;                // 颜色ID
    private String productColorName;               // 颜色名称
    private String productColorNameEn;             // 颜色英文名称
    private Integer productSizeId;                 // 尺寸ID
    private String productSizeName;                // 尺寸名称
    private String productSizeNameEn;              // 尺寸英文名称

    // 分类信息
    private String puName;                         // 单位名称
    private Integer userOrganizationId;            // 组织机构ID（默认0）
    private Integer defaultWarehouseId;            // 默认发货仓库ID（默认0）
    private String eanCode;                        // EAN码
    private String productCategoryCode1;           // 一级品类代码
    private String productCategoryName1;           // 一级品类名称
    // 二、三级品类字段省略（按相同模式添加）

    // 运营信息
    private Integer oprationType;                  // 运营方式（1代运营/2自运营）
    private String brandCode;                       // 品牌代码
    private String brandName;                      // 品牌名称
    private String prlCode;                        // 产品级别代码
    private String prlName;                        // 产品级别名称

    // 价格信息
    private String currencyCode;                   // 供应商币种
    private String spUnitPrice;                    // 供应商单价
    private ProductCustomCategory productCustomCategory; // get_product_custom_category=1时返回
    private List<String> productImages;            // 图片链接（逗号分隔）
    private Integer defaultBuyWarehouseId;         // 默认采购仓库
    private String logisticAttribute;              // 物流属性（默认0）

    // 跨境信息
    private String pdOiverseaTypeCn;               // 申报品名CN
    private String pdOiverseaTypeEn;               // 申报品名EN
    private Float suggestPrice;                   // 建议售价（默认0）
    private String suggestPriceCurrencyCode;       // 建议售价币种（默认0）
    private ProductCost productCost;               // 产品成本
    private String pdDesc;                         // 详细描述
    private String hsCode;                         // 海关编码
    private String productSpecs;                   // 规格
    private String refUrl;                         // 参考采购链接
    private ProductPackage productPackage;         // 产品包材

    // ================= 嵌套对象定义 =================
    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ProductCost {
        private String psSku;                      // SKU
        private String psCountry;                  // 国家
        private Double psDefaultPurchaseCost;      // 默认采购成本
        private Double psDefaultPurchaseFreight;   // 默认采购运费
        private Double psDefaultFirstJourneyCost;  // 默认头程成本
        private Double psDefaultTariffCost;        // 默认关税成本


        private LocalDateTime updateTime;           // 更新时间
        private String refUrl;                     // 参考采购链接
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ProductCombination {
        private String pcrFnsku;                   // FNSKU
        private String pcrFbaAsin;                 // FBA-ASIN
        private String warehouseId;                // 仓库ID（0为全部）

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime pcrAddTime;           // 创建时间

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime pcrUpdateTime;        // 更新时间
        private List<SubProduct> subProducts;       // 组合子产品
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class SubProduct {
        private String pcrProductSku;              // 子产品SKU
        private Integer pcrQty;                     // 子产品数量
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ProductBox {
        private String boxName;                     // 名称
        private String boxNameEn;                   // 英文名称
        private Float boxLength;                   // 长
        private Float boxWidth;                    // 宽
        private Float boxHeight;                   // 高
        private Float boxWeight;                   // 重量
        private Integer quantity;                  // 数量
        private Integer boxStatus;                 // 箱规状态（0不可用/1可用）
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Property {
        private String attrName;                   // 属性名称
        private String attrNameEn;                 // 属性英文名称
        private Float attrValue;                  // 属性值
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ProductCustomCategory {
        private String pucName;                    // 自定义分类名称
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ProductPackage {
        private String packageCode;                // 包材代码
        private String packageName;                // 包材名称
        private Number packageQty;                 // 数量
        private String packageWarehouse;           // 仓库
    }
}