package com.somle.overstock.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.lingxing.service.LingXingService;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

@Disabled
@Slf4j
@Import({LingXingService.class})
class LingXingServiceTest extends SomleBaseDbUnitTest {


    @Resource
    private LingXingService lingXingService;

    @Test
    @SneakyThrows
    void test() {
        log.info("开始测试");
        lingXingService.clients.forEach(client -> {
            client.getInventory();
        });
    }

    @Test
    @SneakyThrows
    void testGetProduct() {
        lingXingService.clients.forEach(client -> {
            client.getAllProducts();
        });
    }
}