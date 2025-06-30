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
public class EccangErpSyncBatchProductReqVO {

    // ================= 基础信息 =================
    private String actionType;                  // 操作类型：ADD/EDIT [必填]
    private String productSku;                  // 产品SKU代码 [必填]
    private String productTitle;                // 中文名称 [必填]
    private String productTitleEn;              // 英文名称 [必填]
    private String pdOiverseaTypeCn;            // 申报品名CN [必填]
    private String pdOiverseaTypeEn;            // 申报品名EN [必填]
    private Float productDeclaredValue;         // 申报价值 [必填]
    private String pdDeclareCurrencyCode;       // 申报币种(如USD) [必填]

    // ================= 价格与成本 =================
    private Float productPurchaseValue;         // 默认采购单价
    private Float productImportDeclareValue;    // 进口申报价值(USD)
    private Float productPurchaseValueNotTax;   // 不含税采购单价
    private String currencyCode;                // 币种
    private Float productPrice;                 // 商品单价
    private Float referenceUnitPrice;           // 采购参考价
    private List<String> refUrl;                // 采购参考链接
    private Float grossProfit;                  // 毛利
    private Float taxRate;                      // 税率
    private Float fboTaxRate;                   // FOB税率

    // ================= 物理属性 =================
    private Float productWeight;                // 重量(kg)
    private Float pdNetWeight;                  // 产品净重(kg)
    private Float productPackageWeight;         // 产品包裹重(kg)
    private Float allowFloatWeight;             // 重量允许浮动值(kg)
    private Float productLength;                // 包装长(cm)
    private Float productWidth;                 // 包装宽(cm)
    private Float productHeight;                // 包装高(cm)
    private Float pdNetLength;                  // 净尺寸长(cm)
    private Float pdNetWidth;                   // 净尺寸宽(cm)
    private Float pdNetHeight;                  // 净尺寸高(cm)

    // ================= 分类与标识 =================
    private String defaultSupplierCode;          // 默认供应商代码
    private String productCategoryName1;        // 一级品类名称
    private String productCategoryName2;        // 二级品类名称
    private String productCategoryName3;        // 三级品类名称
    private String productCategoryNameEn1;      // 一级品类英文名称
    private String productCategoryNameEn2;      // 二级品类英文名称
    private String productCategoryNameEn3;      // 三级品类英文名称
    private Integer productCategoryId1;         // 一级品类ID
    private Integer productCategoryId2;         // 二级品类ID
    private Integer productCategoryId3;         // 三级品类ID
    private String hsCode;                      // 海关编码
    private String productSpecs;                // 规格
    private String upcCode;                     // UPC码
    private String eanCode;                     // EAN码
    private String productMaterial;             // 产品材质
    private String materialEn;                  // 英文材质

    // ================= 状态与类型 =================
    private Integer oprationType;               // 运营方式(1代运营/2自运营) [默认2]
    private Integer productStatus;               // 产品状态(1可用/2开发中) [默认1]
    private Integer saleStatus;                  // 销售状态ID
    private Integer productFbaSizeType;         // FBA仓租尺寸类型(0无/1标准/2超标)
    private Integer isEndProduct;               // 是否成品(1是/0否) [默认1]
    private Integer containBattery;             // 是否含电池(1是/0否) [默认0]
    private Integer isImitation;                // 是否仿制品(1是/0否) [默认0]
    private Integer isQc;                       // 是否质检(1需要/0不需要) [默认0]
    private String qcTemplateName;             // 质检模板名称
    private Integer productIsCombination;        // 是否组合产品(1是/0否) [默认0]
    private String labelingType;                // 贴标容易度(1简单/2普通/3困难)
    private Integer isExpDate;                  // 是否存在有效期(0无/1有) [默认0]
    private Integer expDate;                    // 有效期天数
    private Integer isGift;                     // 是否赠品(1是/0否) [默认0]
    private Integer containSpecialGoods;        // 是否含特货(0否/1是) [默认0]
    private Integer containNonLiquidCosmetics;  // 是否含非液体化妆品(0否/1是) [默认0]
    private Integer periodic;                   // 产品周期性(1无/2季节性/3节假性) [默认1]
    private String labelType;                   // 产品类型(0普通/1同款/2套装)

    // ================= 负责人信息 =================
    private Integer designerId;                 // 设计师ID
    private Integer personOpraterId;            // 采购负责人ID
    private Integer personSellerId;             // 销售负责人ID
    private Integer personDevelopId;            // 开发负责人ID
    private Integer productColorId;             // 产品颜色ID
    private Integer productSizeId;              // 产品尺寸ID
    private String brandCode;                   // 品牌代码
    private String brandName;                   // 品牌名称
    private Integer prlId;                      // 产品等级ID
    private Integer parentProductId;            // 产品款式ID
    private Integer prtId;                      // 侵权等级ID
    private List<String> seller;                // 附属销售员

    // ================= 时间信息 =================
    private LocalDateTime designerStartTime;    // 开始设计时间

    private LocalDateTime designerEndTime;      // 截止设计时间

    // ================= 组织与仓库 =================
    private Integer userOrganizationId;         // 组织机构ID [默认0]
    private Integer defaultWarehouseId;         // 默认发货仓库ID [默认0]
    private Integer defaultBuyWarehouseId;      // 默认采购仓库ID
    private String logisticAttribute;           // 物流属性ID(逗号分隔)
    private String productOrigin;               // 原产地(三字码如CHN) [默认0]

    // ================= 扩展信息 =================
    private String unitCode;                    // 产品单位
    private String use;                         // 中文用途
    private String useEn;                       // 英文用途
    private String pdProductCustomsAttribute;  // 产品海关属性
    private String productPackageUrl;           // 供应商产品资料包URL
    private String goodsId;                     // 商品ID
    private String mainModel;                   // 主型号
    private String desc;                        // 产品描述
    private List<String> productImgUrlList;     // 产品图片URL列表
    private String pucId;                       // 自定义分类ID(逗号分隔)

    // ================= 嵌套对象 =================
    private List<SelfProperty> selfPropertyList;        // 自定义属性
    private List<WarehouseBarcode> warehouseBarcodeList; // 仓库条码
    private List<Fitting> fitting;                      // 配件
    private List<PackageMaterial> packageMaterials;     // 包材
    private List<BoxArr> boxArr;                        // 箱规
    private List<ProductMap> productMap;                // 产品映射(同款/套装)

    // ================= 嵌套类定义 =================
    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class SelfProperty {
        private String name;    // 属性名称
        private String value;   // 属性值
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class WarehouseBarcode {
        private String warehouseCode; // 仓库代码
        private String barcode;      // 产品条码
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Fitting {
        private String productSku;   // 配件SKU
        private String productTitle; // 配件名称
        private String fittingQty;   // 配件数量
        private String fittingDesc;   // 配件描述
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class PackageMaterial {
        private String warehouseCode; // 仓库代码(0公用)
        private String packageQty;    // 包材数量 [必填]
        private String packageCode;   // 包材代码 [必填]
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class BoxArr {
        private Integer boxId;      // 箱子ID [必填]
        private Integer boxQuantity;// 件数 [必填]
        private Integer warehouseId; // 仓库ID(null无/0全部) [必填]
        private String boxPbpPackingMethod; // 包装方式
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class ProductMap {
        private String subProductBarcode; // 产品代码 [必填]
        private Integer quantity;         // 数量（套装产品）[默认0]
        private Integer sort;             // 优先级（同款产品）[默认0]
    }
}