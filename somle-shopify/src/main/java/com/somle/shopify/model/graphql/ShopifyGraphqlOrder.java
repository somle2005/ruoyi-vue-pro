package com.somle.shopify.model.graphql;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ShopifyGraphqlOrder {

    private String id;
    private String name;
    private String poNumber;
    private String displayFinancialStatus;
    private String displayFulfillmentStatus;
    private PriceSet currentTotalPriceSet;
    private String createdAt;
    private String updatedAt;
    private String cancelledAt;
    private String cancelReason;
    private Risk risk;
    private ShippingAddress shippingAddress;
    private LineItems lineItems;
    private List<Fulfillment> fulfillments;

    @Data
    public static class Fulfillment {
        private String id;
    }
    @Data
    public static class PriceSet {
        private ShopMoney shopMoney;
    }

    @Data
    public static class ShopMoney {
        private BigDecimal amount;
        private String currencyCode;
    }

    @Data
    public static class ShippingAddress {
        private String firstName;
        private String lastName;
        private String company;
        private String country;
        private String name;
        private String phone;
        private String address1;
        private String address2;
        private String city;
        private String latitude;
        private String longitude;
        private String province;
        private String provinceCode;
        private String zip;
        private String countryCodeV2;
    }

    @Data
    public static class Risk {
        private List<Assessment> assessments;
    }

    @Data
    public static class Assessment {
        // HIGH LOW MEDIUM NONE PENDING
        private String riskLevel;
    }

    @Data
    public static class LineItems {
        private List<LineItemEdge> edges;
    }

    @Data
    public static class LineItemEdge {
        private LineItemNode node;
        // 省略 getter/setter
    }

    @Data
    public static class LineItemNode {
        private String id;
        private String sku;
        private Long quantity;
        private PriceSet originalUnitPriceSet;
        private List<DiscountAllocation> discountAllocations;
        private List<TaxLine> taxLines;
    }

    @Data
    public static class DiscountAllocation {
        private PriceSet allocatedAmountSet;
    }

    @Data
    public static class TaxLine {
        private PriceSet priceSet;
    }
}
