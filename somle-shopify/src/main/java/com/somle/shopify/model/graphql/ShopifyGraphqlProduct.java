package com.somle.shopify.model.graphql;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ShopifyGraphqlProduct {

    private String id;
    private String title;
    private String vendor;
    private String productType;
    private String createdAt;
    private String handle;
    private String updatedAt;
    private String publishedAt;
    private String templateSuffix;
    private List<String> tags;
    private String status;
    private Variants variants;
    private List<ProductOption> options;


    @NoArgsConstructor
    @Data
    public static class VariantEdge {
        private Variant node;
    }

    @NoArgsConstructor
    @Data
    public static class Variants {
        private List<VariantEdge> edges;
    }

    @NoArgsConstructor
    @Data
    public static class Variant {
        private String id;
        private String title;
        private String price;
        private Integer position;
        private String inventoryPolicy;
        private String compareAtPrice;
        private String createdAt;
        private String updatedAt;
        private Boolean taxable;
        private String barcode;
        private String sku;
        private Integer inventoryQuantity;
    }


    @NoArgsConstructor
    @Data
    public static class ProductOption {
        private String id;
        private String name;
        private Integer position;
        private List<String> values;
    }

}
