package com.somle.shopify.service;


import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.test.core.ut.BaseDbUnitTest;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@Import({ShopifyClient.class})
class ShopifyClientTest1 extends BaseDbUnitTest {

    @Resource
    ShopifyClient client;

    @Test
    void testGetProducts() {
        List<JSONObject> products= client.getProducts(null);
        assertNotNull(products);
        log.info(products.toString());
        assertFalse(products.isEmpty());
    }

    @Test
    void testGetShop() {
        List<JSONObject> shops= client.getShops();
        assertNotNull(shops);
        assertFalse(shops.isEmpty());
        JSONObject shop=shops.get(0);
        assertNotNull(shop);
        log.info(shop.toString());
        assertNotNull(shop);
        assertFalse(shop.isEmpty());
    }

    @Test
    void testGetOrders() {
        JSONArray orders= client.getOrders(null);
        assertNotNull(orders);
        log.info(orders.toString());
        assertFalse(orders.isEmpty());
    }

    @Test
    void testGetPayouts() {
        JSONArray payouts= client.getPayouts(null);
        assertNotNull(payouts);
        log.info(payouts.toString());
        assertFalse(payouts.isEmpty());
    }

}