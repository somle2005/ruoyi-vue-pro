package com.somle.eccang.model.req.wms.order;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import lombok.Builder;

import java.util.List;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EccangWMSCreateOrderReqVO {

    private String platform;
    private String allocatedAuto;
    private String warehouseCode;
    private String shippingMethod;
    private String referenceNo;
    private String aliexpressOrderNo;
    private String orderDesc;
    private String remark;
    private String orderBusinessType;
    private String lpOrderNumber;
    private String countryCode;
    private String province;
    private String city;
    private String district;
    private String address1;
    private String address2;
    private String address3;
    private String zipcode;
    private String license;
    private String doorplate;
    private String company;
    private String name;
    private String phone;
    private String cellPhone;
    private String phoneExtension;
    private String email;
    private String platformShop;
    private Integer isOrderCod;
    private Double orderCodPrice;
    private String orderCodCurrency;
    private Integer orderAgeLimit;
    private Integer isSignature;
    private Integer isInsurance;
    private Double insuranceValue;
    private String channelCode;
    private String packageCenterCode;
    private String packageCenterName;
    private String qrCode;
    private String shortAddress;
    private String sellerId;
    private String buyerId;
    private Integer onlyLogistics;
    private String assignDate;
    private String assignTime;

    private List<Item> items;
    private List<Report> report;
    private String trackingNo;
    private Label label;
    private List<Attach> attach;
    private List<OtherDocument> otherDocuments;

    private Integer isPackBox;
    private Integer isReleaseCargo;
    private Integer isVip;
    private String orderKind;
    private String orderPayerName;
    private String orderIdNumber;
    private String orderPayerPhone;
    private String orderCountryCodeOrigin;
    private String orderSaleAmount;
    private String orderSaleCurrency;
    private String isPlatformEbay;
    private String ebayItemId;
    private String ebayTransactionId;
    private String taxPaymentMethod;
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
    private String consigneeTaxNumber;
    private String consigneeEori;
    private String orderBatteryType;
    private String vatTaxCode;
    private String distributionInformation;
    private Integer consigneeTaxType;
    private String apiSource;
    private Integer verify;
    private Integer forceVerify;
    private String lpCode;
    private Integer isMerge;
    private Integer mergeOrderCount;
    private Integer insuranceType;
    private Integer insuranceTypeGoodsValue;
    private Integer isJuOrder;
    private Integer isAllowOpen;
    private Integer isPrime;
    private String transactionNo;
    private Integer async;
    private String premiumService;

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Item {
        private String productSku;
        private String referenceNo;
        private String productNameEn;
        private String productName;
        private Double productDeclaredValue;
        private Integer quantity;
        private String refTnx;
        private String refItemId;
        private String refBuyerId;
        private String alreadyTaxed;
        private String childOrderId;
        private List<BatchInfo> batchInfo;
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class BatchInfo {
        private String inventoryCode;
        private String skuQuantity;
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Report {
        private String productSku;
        private String productTitle;
        private String productTitleEn;
        private Integer productQuantity;
        private Double productDeclaredValue;
        private Integer productWeight;
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Label {
        private String fileType;
        private String fileData;
        private String fileSize;
        private String fileName;
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class Attach {
        private String fileType;
        private String attachId;
    }

    @Data
    @Builder
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public static class OtherDocument {
        private String attachId;
    }
}