package com.somle.shopify.model.graphql;

import lombok.Data;

import java.util.List;

@Data
public class ShopifyGraphqlProductPageResult {

    private Products products;

    @Data
    public static class ProductEdge {
        private ShopifyGraphqlProduct node;
    }

    @Data
    public static class Products {
        private List<ProductEdge> edges;
        private PageInfo pageInfo;
    }

    @Data
    public static class PageInfo {
        private String startCursor;
        private String endCursor;
        private Boolean hasNextPage;
        private Boolean hasPreviousPage;
    }
}
