package com.somle.shopify.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.doudian.service.DouDianService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;


@Disabled
@Slf4j
@Import({
    DouDianService.class
})
class DouDianServiceTest extends SomleBaseDbUnitTest {
    @Resource
    private DouDianService douDianService;

    @Test
    @Rollback(false)
    public void test1() {
        douDianService.refreshAuths();
    }
    @Test
    public void test2() {
        douDianService.clients.forEach(client -> {
            client.getAllProducts();
        });
    }

    @Test
    public void test3() {
        douDianService.clients.forEach(client -> {
            client.getAllOrders(System.currentTimeMillis() / 1000 - 3600 * 24 * 7,System.currentTimeMillis() / 1000);
        });
    }
    @Test
    public void test4() {
        douDianService.clients.forEach(client -> {
            client.batchDecrypt();
        });
    }

}