package com.somle.shopify.service;


import com.somle.shopify.mapper.ShopifyTokenMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

// https://shopify.dev/docs/api/admin-rest/
@Slf4j
@Service
public class ShopifyClient {

    @Resource
    private ShopifyTokenMapper shopifyTokenMapper;

    public String getHeaders(String storeName) {
        String accessToken = shopifyTokenMapper.getHeaders(storeName);
        return accessToken;
    }


}
