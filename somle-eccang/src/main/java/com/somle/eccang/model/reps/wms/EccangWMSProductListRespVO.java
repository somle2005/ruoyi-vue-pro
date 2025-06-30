package com.somle.eccang.model.reps.wms;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSProductListRespVO {
    private String productId;                  // 产品ID
    private String productSku;                // SKU
    private String goodsBarcode;              // 库内编码
    private String referenceNo;               // 自定义编码
    private String productStatus;             // 产品状态: X-废弃 D-草稿 S-可用 P-审核中 R-审核不通过
    private String productTitle;              // 产品标题
    private String productTitleEn;            // 产品英文标题
    private String productWeight;             // 重量
    private String productLength;             // 长
    private String productWidth;              // 宽
    private String productHeight;             // 高
    private Integer containBattery;          // 是否含电池: 0-不含 1-含电池
    private String productDesc;              // 产品描述
    private String productDeclaredValue;     // 申报价值(USD)
    private String productDeclaredName;      // 申报名称(英文)
    private String productDeclaredNameZh;     // 申报名称(中文)
    private String catLang;                   // 品类语言: zh-中文 en-英文
    private String productBrand;              // 产品品牌
    private String productModel;              // 产品型号
    private String productOrigin;             // 产品原产地
    private String productMaterial;           // 产品材质
    private String productDescUrl;            // 产品信息链接
    private String catIdLevel0;               // 一级品类
    private String catIdLevel1;               // 二级品类
    private String catIdLevel2;               // 三级品类
    private Date productAddTime;              // 添加时间
    private Date productModifyTime;           // 修改时间
    private Float productCost;                // 产品价格
    private String hsCode;                    // 海关编码
    private String currency;                  // 客户币种
    private String companyCode;               // 客户代码
    private List<WarehouseAttribute> warehouseAttribute; // 产品仓库属性
    private String note;                      // 审核不通过备注
    private String productColor;              // 产品颜色
    private Integer fragileProperty;         // 易碎属性: 0-无易碎 1-易碎品
    private String productImg;                // 产品图片
    private String productSizeType;           // 产品尺码类型
    private String ean;                       // 产品EAN码

    // 仓库属性内部类
    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class WarehouseAttribute {
        private String productLength;             // 长
        private String productWidth;              // 宽度
        private String productHeight;             // 高
        private String productWeight;             // 重量
    }
}