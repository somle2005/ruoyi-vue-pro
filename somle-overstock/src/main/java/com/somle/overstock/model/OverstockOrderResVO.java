package com.somle.overstock.model;

import cn.hutool.core.annotation.Alias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

@NoArgsConstructor
@Data
public class OverstockOrderResVO {

    @Alias("totalCount")
    private String totalCount;
    @Alias("list")
    private List<OrderInfoDTO> list;

    @NoArgsConstructor
    @Data
    public static class OrderInfoDTO {

        @Alias("ns2:warehouseName")
        List<Code> warehouseName;

        @Alias("ns2:retailOrderNumber")
        private String retailOrderNumber;
        @Alias("ns2:retailChannelCode")
        private String retailChannelCode;
        @Alias("ns2:sofsCreatedDate")
        private LocalDateTime sofsCreatedDate;
        @Alias("ns2:orderDate")
        private LocalDateTime orderDate;
        @Alias("ns2:orderId")
        private String orderId;

        @Alias("ns2:salesChannelName")
        private String salesChannelName;

        @Alias("ns2:processedSalesOrderLine")
        private List<ProcessedSalesOrderLinetInfo> processedSalesOrderLine;

        @Alias("ns2:branding")
        private String branding;

        @Alias("ns2:shippingSpecifications")
        private List<ShippingSpecificationsInfo> shippingSpecifications;

        @Alias("ns2:retailerOrderCode")
        private String retailerOrderCode;

        @Alias("ns2:actionRequired")
        private boolean actionRequired;
        @Alias("ns2:salesChannelOrderNumber")
        private String salesChannelOrderNumber;

        @Alias("ns2:orderFulfillment")
        private String orderFulfillment;


        @Alias("ns2:status")
        private String status;

        @Alias("ns2:shipToAddress")
        List<Address> shipToAddress;

        @Alias("ns2:returnAddress")
        List<ReturnAddressInfo> returnAddress;


        @NoArgsConstructor
        @Data
        public static class Address {
            @Alias("ns2:contactName")
            private String contactName;
            @Alias("ns2:countryCode")
            private String countryCode;
            @Alias("ns2:city")
            private String city;
            @Alias("ns2:phone")
            private String phone;
            @Alias("ns2:address1")
            private String address1;
            @Alias("ns2:address2")
            private String address2;
            @Alias("ns2:stateOrProvince")
            private String stateOrProvince;
            @Alias("ns2:postalCode")
            private String postalCode;
        }


        @NoArgsConstructor
        @Data
        public static class Code {
            @Alias("ns2:code")
            private String code;
        }

        @NoArgsConstructor
        @Data
        public static class ProcessedSalesOrderLinetInfo {

            @Alias("ns2:additionalShippingCost")
            private String additionalShippingCost;

            @Alias("ns2:salesChannelLineNumber")
            private String salesChannelLineNumber;

            @Alias("ns2:salesChannelUneld")
            private String salesChannelUneld;

            @Alias("ns2:firstCostCurrencyCode")
            private String firstCostCurrencyCode;

            @Alias("ns2:lineId")
            private String lineId;

            @Alias("ns2:quantity")
            private String quantity;

            @Alias("ns2:partnerSKU")
            private String partnerSKU;

            @Alias("ns2:lineStatus")
            private String lineStatus;

            @Alias("ns2:barcode")
            private String barcode;

            @Alias("ns2:itemId")
            private String itemId;

            @Alias("ns2:itemName")
            private String itemName;

            @Alias("ns2:unitCostCurrencyCode")
            private String unitCostCurrencyCode;

            @Alias("ns2:unitCost")
            private String unitCost;

            @Alias("ns2:additionalShippingCostCurrencyCode")
            private String additionalShippingCostCurrencyCode;

            @Alias("ns2:firstCost")
            private String firstCost;

            @Alias("ns2:upc")
            private String upc;

            @Alias("ns2:itemPrice")
            private String itemPrice;

            @Alias("ns2:salesChannelSKU")
            private String salesChannelSKU;
        }

        @NoArgsConstructor
        @Data
        public static class ShippingSpecificationsInfo {
            @Alias("ns2:isThirdPartyBilling")
            private boolean isThirdPartyBilling;

            @Alias("ns2:smallParcelShipment")
            private HashMap<String, Object> smallParcelShipment;

            @Alias("ns2:isDeclaredValueRequired")
            private boolean isDeclaredValueRequired;

            @Alias("ns2:isExport")
            private boolean isExport;

            @Alias("ns2:isSignatureRequired")
            private boolean isSignatureRequired;
        }

        @NoArgsConstructor
        @Data
        public static class ReturnAddressInfo {
            @Alias("ns2:contactName")
            private String contactName;

            @Alias("ns2:countryCode")
            private String countryCode;

            @Alias("ns2:city")
            private String city;

            @Alias("ns2:phone")
            private String phone;

            @Alias("ns2:address1")
            private String address1;

            @Alias("ns2:stateOnProvince")
            private String stateOrProvince;

            @Alias("ns2:postalCode")
            private String postalCode;
        }

    }
}
