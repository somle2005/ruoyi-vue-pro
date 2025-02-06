package com.somle.shopify.service;


import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.test.core.ut.BaseDbUnitTest;
import com.somle.framework.test.core.ut.BaseSpringTest;
import com.somle.shopify.model.ShopifyToken;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@Import({ShopifyService.class})
class ShopifyServiceTest extends BaseDbUnitTest {

    @Resource
    ShopifyService service;

    @Test
    void testGetProducts() {
        JSONArray products= service.client().getProducts();
        assertNotNull(products);
        log.info(products.toString());
        assertFalse(products.isEmpty());
    }

    @Test
    void testGetShop() {
        JSONObject shop= service.client().getShop();
        assertNotNull(shop);
        log.info(shop.toString());
        assertNotNull(shop);
        assertFalse(shop.isEmpty());
    }

    @Test
    void testGetOrders() {
        JSONArray orders= service.client().getOrders();
        assertNotNull(orders);
        log.info(orders.toString());
        assertFalse(orders.isEmpty());
    }

    @Test
    void testGetPayouts() {
        JSONArray payouts= service.client().getPayouts();
        assertNotNull(payouts);
        log.info(payouts.toString());
        assertFalse(payouts.isEmpty());
    }

}