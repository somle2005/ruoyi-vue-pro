package com.somle.overstock.service;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

@Slf4j
@Import({OverstockService.class})
class OverstockServiceTest extends BaseDbUnitTest {
    @Resource
    OverstockService service;

    @Test
    void test(){
        log.info(service.client.getOrders().toString());
    }
}