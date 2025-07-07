package com.somle.eccang.model.req.wms.order;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 主订单实体类
 */
@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSModifyOrderReqVO {
    // 订单基本信息
    private String orderCode;
    private String swOrderNumber;
    private String platform;
    private String warehouseCode;
    private String shippingMethod;
    
    private String referenceNo;
    private String aliexpressOrderNo;
    private String orderDesc;
    
    // 收货人信息
    private String countryCode;
    
    private String province;
    private String city;
    private String address1;
    private String address2;
    private String address3;
    private String zipcode;
    private String doorplate;
    private String name;
    
    private String phone;
    private String cellPhone;
    private String phoneExtension;
    private String email;
    
    // 订单配置
    private String platformShop;
    private Integer forceVerify;
    private Integer verify;
    
    private String assignDate;
    private String assignTime;
    private List<OrderItem> items;
    
    // 清关信息
    private String customsCompanyName;
    private String customsAddress;
    private String customsContactName;
    private String customsEmail;
    private String customsTaxCode;
    private String customsPhone;
    private String customsCity;
    private String customsState;
    private String customsCountryCode;
    private String customsPostcode;
    private String customsDoorplate;
    
    // 税务信息
    private String consigneeTaxNumber;
    private String orderBatteryType;
    private String vatTaxCode;
    
    // 业务信息
    private String distributionInformation;
    private Integer consigneeTaxType;
    private String apiSource;
    
    private Integer isMerge;
    private Integer mergeOrderCount;
    private Integer insuranceType;
    private Integer insuranceTypeGoodsValue;
    private Integer isJuOrder;
    private Integer isAllowOpen;
    private String transactionNo;
    private Integer allocatedAuto;
    private String remark;
    private String orderBusinessType;
    private String lpOrderNumber;
    private String district;
    private String license;
    
    // 支付信息
    private Integer isOrderCod;
    private Double orderCodPrice;
    private String orderCodCurrency;
    private String company;
    private Integer orderAgeLimit;
    private Integer isSignature;
    private Integer isInsurance;
    private Double insuranceValue;
    
    // 渠道信息
    private String channelCode;
    private String sellerId;
    private String buyerId;
    private Integer onlyLogistics;
    private List<String> report;
    private String trackingNo;
    private Integer isReleaseCargo;
    private Integer isVip;
    private Integer isPrime;
    private String orderKind;
    
    // 付款人信息
    private String orderPayerName;
    private String orderIdNumber;
    private String orderPayerPhone;
    private String orderCountryCodeOrigin;
    private Double orderSaleAmount;
    private String orderSaleCurrency;
    
    // eBay特殊字段
    private String isPlatformEbay;
    private String ebayItemId;
    private String ebayTransactionId;
    private String taxPaymentMethod;
    private String consigneeEori;
    private String lpCode;
    private String paymentTime;
    private String premiumService;
    private Integer async;

    /**
     * 订单项实体
     */
    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OrderItem {
        private String productSku;
        private String productNameEn;
        private Double productDeclaredValue;
        private Integer quantity;
        private List<BatchInfo> batchInfo;
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class BatchInfo {
        private String inventoryCode;
        private Integer skuQuantity;
    }
}