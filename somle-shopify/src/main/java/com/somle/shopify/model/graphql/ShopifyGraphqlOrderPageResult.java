package com.somle.shopify.model.graphql;

import lombok.Data;

import java.util.List;

@Data
public class ShopifyGraphqlOrderPageResult {

    private Orders orders;

    @Data
    public static class OrderEdge {
        private ShopifyGraphqlOrder node;
    }

    @Data
    public static class Orders {
        private List<OrderEdge> edges;
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
