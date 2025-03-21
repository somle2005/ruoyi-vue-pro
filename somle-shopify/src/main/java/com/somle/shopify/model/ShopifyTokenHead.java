package com.somle.shopify.model;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-20 15:00
 **/
@Data
public class ShopifyTokenHead {
    private ShopifyShopAndTokenInfo shopifyShopAndTokenInfo;
    private Map<String, String> tokenValues = new HashMap<>();
}
