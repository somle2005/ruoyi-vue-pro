package com.somle.shopify.model.graphql;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 高巍
 * @since 2024/6/5 20:35
 */
@Data
public class ShopifyGraphqlRequest<T> implements Serializable {
    private String query;
    private T variables;
}
