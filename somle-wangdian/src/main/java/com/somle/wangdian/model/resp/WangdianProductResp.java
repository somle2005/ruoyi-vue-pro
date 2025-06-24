package com.somle.wangdian.model.resp;

import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@NoArgsConstructor
public class WangdianProductResp {
    private Integer code;
    private List<Goods> goodsList;
    private Integer totalCount;
    private String message;


    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    @NoArgsConstructor
    public static class Goods {
        private String recId;                // 子订单主键
        private String shopNo;               // 店铺编号
        private String shopName;             // 店铺名称
        private String platformId;           // 平台ID
        private String matchTargetId;        // 匹配目标ID
        private String matchTargetType;      // 匹配目标类型
        private String apiGoodsId;           // API商品ID
        private String apiSpecId;            // API规格ID
        private String apiGoodsName;         // API商品名称
        private String apiSpecName;          // API规格名称
        private String modified;             // 修改时间
        private String apiSpecNo;            // API规格编号
        private String outerId;              // 外部ID
        private String specOuterId;          // 规格外部ID
        private BigDecimal stockNum;         // 库存数量
        private BigDecimal price;            // 价格
        private String cid;                  // 类别ID
        private String picUrl;               // 图片URL
        private String isDeleted;            // 是否删除
        private BigDecimal holdStock;        // 持有库存
        private String holdStockType;        // 持有库存类型
        private String isAutoListing;        // 是否自动上架
        private String isAutoDelisting;      // 是否自动下架
        private String status;               // 状态
        private String merchantNo;           // 商户编号
        private String merchantName;         // 商户名称
        private String merchantCode;         // 商户代码
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    @NoArgsConstructor
    public static class Spec {
        private String specId;
        private String goodsId;
        private String specNo;
        private String specCode;
        private String barcode;
        private String specName;
        private String lowestPrice;
        private String retailPrice;
        private String wholesalePrice;
        private String memberPrice;
        private String marketPrice;
        private String customPrice1;
        private String customPrice2;
        private String prop1;
        private String prop2;
        private String prop3;
        private String prop4;
        private String prop5;
        private String prop6;
        private String remark;
        private String saleScore;
        private String packScore;
        private String pickScore;
        private String validityDays;
        private String salesDays;
        private String receiveDays;
        private String weight;
        private String length;
        private String width;
        private String height;
        private String isSnEnable;
        private String isAllowNegStock;
        private String isNotNeedExamine;
        private String isZeroCost;
        private String isLowerCost;
        private String isNotUseAir;
        private String taxRate;
        private String largeType;
        private String specCreated;
        private String specModified;
        private String imgUrl;
        private String specAuxUnitName;
        private String specUnitName;
        private String deleted;
        private String taxCodeId;
        private String isSingleBatch;
        private String washingLabel;
        private String unit;
        private String auxUnit;
        private String flagId;
        private String imgKey;
        private String barcodeCount;
        private String platSpecCount;
        private String postfixVal;
        private String lastDate;
        private String replenishType;
        private String isPopular;
        private String replaceNo;
        private String specMask;
        private String replaceProportion;
        private String extra3;
        private String modified;
        private String created;
        private String taxCode;
        private List<Barcode> barcodeList;
    }

    @Data
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    @NoArgsConstructor
   public static class Barcode {
        private String specId;
        private String goodsId;
        private String barcode;
        private String type;
        private String isMaster;
        private String outTargetNum;
        private String targetNum;
        private String modified;
    }
}
