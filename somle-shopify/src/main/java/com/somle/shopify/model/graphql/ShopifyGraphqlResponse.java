package com.somle.shopify.model.graphql;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author 高巍
 * @since 2025-06-12 19:58:06
 */
@Data
public class ShopifyGraphqlResponse<T> {
    private T data;
    private List<ShopifyApiError> errors;
    private Map<String, Object> extensions;

    @Data
    public static class ShopifyApiError {
        private String message;
        private List<ErrorLocation> locations;
        private List<String> path;
        private ErrorExtensions extensions;

        // Getters and Setters
        @Data
        public static class ErrorLocation {
            private int line;
            private int column;
        }

        @Data
        public static class ErrorExtensions {
            private String code;
            // 可以根据需要添加更多扩展字段
        }
    }
}
