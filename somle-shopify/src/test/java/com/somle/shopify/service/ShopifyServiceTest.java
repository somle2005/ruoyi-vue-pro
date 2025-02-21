package com.somle.shopify.service;



import cn.iocoder.yudao.framework.test.core.ut.BaseDbUnitTest;
import com.somle.shopify.model.ShopifyToken;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.util.HashMap;

@Slf4j
@Import({ShopifyClient.class})
class ShopifyServiceTest extends BaseDbUnitTest {
    @Resource
    ShopifyClient client;

    @Test
    void test() {
        log.info(client.getProducts(new HashMap<>()).toString());
    }
}