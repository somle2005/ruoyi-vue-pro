package com.somle.wangdian.model.resp;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.somle.wangdian.model.WangdianRespVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class WangdianTradeRespVO extends WangdianRespVO {
    /**
     * 订单列表 (一级数据节点)
     */
    private List<TradeVO> trades;

    /**
     * Trade Data VO
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TradeVO {

        private Integer tradeId;
        private String tradeNo;
        private Integer platformId;
        private Integer warehouseType;
        private String srcTids;
        private String payAccount;
        private Integer tradeStatus;
        private Integer consignStatus;
        private Integer tradeType;
        private Integer deliveryTerm;
        private Integer freezeReason;
        private Integer refundStatus;
        private Integer fenxiaoType;
        private String fenxiaoNick;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime tradeTime;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime payTime;

        private String buyerNick;
        private String receiverName;
        private String receiverProvince;
        private String receiverCity;
        private String receiverDistrict;
        private String receiverAddress;
        private String receiverMobile;
        private String receiverTelno;
        private String receiverZip;
        private String receiverArea;
        private BigDecimal goodsAmount;
        private BigDecimal discount;
        private BigDecimal receivable;
        private BigDecimal weight;
        private BigDecimal profit;
        private BigDecimal tax;
        private String logisticsNo;
        private String logisticsName;
        private String logisticsCode;
        private String shopNo;
        private String shopName;
        private String warehouseNo;
        private String customerName;
        private String customerNo;
        private Integer logisticsId;
        private Integer logisticsType;
        private String checkerName;
        private Integer shopId;
        private Integer warehouseId;
        private Integer customerType;
        private String customerId;
        private String receiverCountry;
        private Integer checkStep;
        private Integer splitFromTradeId;
        private Integer tradeMask;
        private Integer largeType;
        private Integer shopPlatformId;
        private Integer shopSubPlatformId;
        private String fcheckerName;
        private String freezeReasonInfo;
        private String fenxiaoTid;
        private String tags;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime modified;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime created;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime promiseLastDeliveryTime;

        private List<GoodsVO> goodsList;
    }

    /**
     * Goods Data VO
     */
    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GoodsVO {

        private Integer recId;
        private Integer tradeId;
        private Integer specId;
        private Integer platformId;
        private String srcOid;
        private String suiteId;
        private String srcTid;
        private String giftType;
        private Integer refundStatus;
        private String guaranteeMode;
        private String deliveryTerm;
        private String bindOid;
        private BigDecimal num;
        private BigDecimal price;
        private BigDecimal actualNum;
        private BigDecimal refundNum;
        private BigDecimal orderPrice;
        private String goodsName;
        private String specName;
        private String platformGoodsId;
        private String platformSpecId;
        private String tcOrderId;
        private String prop2;
        private String className;
        private String barcode;
        private BigDecimal shareAmount2;
        private String isPrintSuite;
        private String isZeroCost;
        private String stockReserved;
        private String isConsigned;
        private String isReceived;
        private String isMaster;
        private BigDecimal taxRate;
        private String baseUnitId;
        private String unitName;
        private String payId;
        private String goodsId;
        private String goodsNo;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private LocalDateTime payTime;

        private String payStatus;
        private String virtualDaifaLogisticsNo;
        private String virtualDaifaLogisticsType;
        private String corpEntityId;
        private String corpEntityName;
        private String fromMaskExt;
    }
}
