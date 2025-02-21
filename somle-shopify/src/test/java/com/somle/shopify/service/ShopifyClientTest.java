package com.somle.shopify.service;


import cn.iocoder.yudao.framework.test.core.ut.BaseSpringTest;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@Import({
    ShopifyClient.class,
})
class ShopifyClientTest extends BaseSpringTest {

    @Resource
    private ShopifyClient client;

    @BeforeEach
    void setUp() {
    }


    @Test
    void testGetShops() {
        var response = client.getShops();
        log.info(response.toString());
    }

    @Test
    void testGetProductCount() {
        var response = client.getProductCount();
        log.info(response.toString());
    }

    @Test
    void testGetProducts() {
        Map<String,String> params = new HashMap<>();
        params.put("limit","5");
        var response = client.getProducts(params);
        log.info(response.toString());
    }


}