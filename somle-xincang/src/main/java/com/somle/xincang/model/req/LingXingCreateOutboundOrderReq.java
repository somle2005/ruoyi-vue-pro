package com.somle.xincang.model.req;

import lombok.Data;
import lombok.Builder;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;

// 主请求类
@Data
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
@Builder
public class LingXingCreateOutboundOrderReq {
    private String appKey;
    private List<OrderData> data;
    private String reqTime;

    // 每个订单数据
    @Data
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    @Builder
    public static class OrderData {
        private Integer subOrderType;
        private String receiver;
        private String logisticsChannel;
        private String provinceCode;
        private String contactName;
        private String companyName;
        private String telephone;
        private String countryRegionCode;
        private String referOrderNo;
        private String thirdOrderNo;
        private String cityName;
        private String countryRegionName;
        private String whCode;
        private String addressTwo;
        private String postCode;
        private String addressName;
        private String provinceName;
        private String addressOne;
        private String email;
        private String houseNum;
        private List<Product> productList;
        private OrderExtensionInfoBO orderExtensionInfoBO;
    }

    // 产品信息
    @Data
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    @Builder
    public static class Product {
        private Integer quantity;
        private String fnsku;
        private Integer availableAmount;
        private String productAliasName;
        private String sku;
        private String skuId;
        private String productName;
    }

    // 扩展信息
    @Data
    @JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
    @Builder
    public static class OrderExtensionInfoBO {
        private String platformOrderId;
        private String platformPackageId;
    }
}

