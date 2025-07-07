package com.somle.eccang.model.req.wms.product;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSProductReqVo {

    // 基础信息
    private String productSku;              // SKU
    private String referenceNo;             // 自定义编码
    private String productTitle;            // 产品标题
    private String productTitleEn;          // 产品英文标题

    // 尺寸重量信息
    private Double productWeight;           // 重量
    private Double productNetWeight;        // 净重
    private Double productLength;           // 长
    private Double productWidth;            // 宽
    private Double productHeight;           // 高

    // 电池信息
    private Integer containBattery;        // 是否含电池：0-不含，1-含
    private String batteryType;             // 电池类型描述

    // 申报信息
    private Double productDeclaredValue;    // 申报价值
    private String productDeclaredName;     // 申报名称（英文）
    private String productDeclaredNameZh;   // 申报名称（中文）

    // 分类信息
    private String catLang;                 // 品类语言
    private String hsCode;                  // 海关编码
    private Integer catIdLevel0;            // 一级品类ID
    private Integer catIdLevel1;            // 二级品类ID
    private Integer catIdLevel2;            // 三级品类ID

    // 状态与预警
    private Integer verify;                 // 审核状态
    private Integer warningQty;             // 库存预警数量
    private Integer warningDays;            // 库龄预警天数

    // 产品属性
    private String productBrand;            // 产品品牌
    private String productModel;            // 产品型号
    private String productOrigin;           // 产品原产地
    private String productMaterial;         // 产品材质
    private String productUseEn;            // 产品用途（英文）
    private String productMaterialEn;       // 产品材质（英文）
    private String productDescUrl;          // 产品描述链接

    // 图片信息（嵌套对象）
    private CustomerImg customerImg;        // 客户图片信息

    // 其他属性
    private String productColor;            // 产品颜色
    private Integer sharedProduct;          // 是否共享产品
    private String sharedUnitPrice;         // 共享单价
    private String productDescription;      // 产品描述
    private String isBoxMoreSku;            // 是否多SKU装箱
    private Integer fragileProperty;       // 易碎属性：0-非易碎，1-易碎
    private String ean;                     // EAN码

    // 嵌套对象：客户图片信息
    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class CustomerImg {
        private String fileType;           // 文件类型（如img）
        private String base64Img;          // Base64编码的图片数据
    }
}
