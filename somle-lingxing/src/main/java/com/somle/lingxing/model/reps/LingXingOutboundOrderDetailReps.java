package com.somle.lingxing.model.reps;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class LingXingOutboundOrderDetailReps {
    private int code;
    private String msg;
    private List<OutboundOrder> data;


    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class OutboundOrder {
        private String whCode;
        private String outboundOrderNo;
        private String thirdOrderNo;
        private int status;
        private String statusName;
        private String orderTypeName;
        private String subOrderTypeName;
        private String logisticsChannel;
        private String logisticsTrackNo;
        private List<String> logisticsTrackNos;
        private String logisticsCarrier;
        private String referOrderNo;
        private String platformOrderNo;
        private String salesPlatform;
        private int needRelabel;
        private String receiver;
        private String telephone;
        private String email;
        private String taxNum;
        private String companyName;
        private String countryRegionCode;
        private String countryRegionName;
        private String provinceCode;
        private String provinceName;
        private String cityCode;
        private String cityName;
        private String postCode;
        private String houseNum;
        private String addressOne;
        private String addressTwo;
        private String exceptionDesc;
        private Date orderCreateTime;
        private String outboundTime;
        private String canceledTime;
        private String exceptionTime;
        private String interceptTime;
        private String remark;
        private double costTotal;
        private String costCurrencyCode;
        private List<?> costItems;
        private List<Product> productList;
        private List<Appendix> appendixList;
        private List<Express> expressList;
        private String orderList;
    }

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Product {
        private String createBy;
        private Date createTime;
        private String updateBy;
        private Date updateTime;
        private int deleted;
        private String sku;
        private String skuId;
        private String productName;
        private String productAliasName;
        private String fnsku;
        private int quantity;
        private int realQuantity;
        private double availableAmount;
        private String remark;
    }

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Appendix {
        // 根据实际情况添加字段
    }

    @Data
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    public static class Express {
        private String trackNo;
        private double length;
        private double width;
        private double height;
        private double weight;
        private String pkgSkuNumInfo;
        private String fileUrl;
    }
}
