package com.somle.lingxing.model.req;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class LingXingCreateOutboundOrderReq {
    private List<OrderData> data;
    // 每个订单数据
    @Data
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
    @Builder
    public static class OrderExtensionInfoBO {
        private String platformOrderId;
        private String platformPackageId;
    }
}

