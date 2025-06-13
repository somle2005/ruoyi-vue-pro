package com.somle.shopify.exception;

/**
 * @author 高巍
 * @since 2025-06-12 20:03:26
 */
public class ShopifyApiException extends RuntimeException {
    public ShopifyApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShopifyApiException(String message) {
        super(message);
    }
}
