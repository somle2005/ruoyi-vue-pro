package com.somle.jingdong.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;


@Disabled
@Slf4j
@Import({JingDongService.class})
class JingDongServiceTest extends SomleBaseDbUnitTest {
    @Resource
    JingDongService jingDongService;


//    @Test
//    @Rollback(false)
//    void refreshToken() throws Exception {
//        tikTokService.refreshAccessToken();
//    }

    @Test
    void test() {
        jingDongService.jingDongClients.forEach(jingDongClient -> {
            jingDongClient.getShopInfo();
        });
    }

    @Test
    void getProductInfo() {
        jingDongService.jingDongClients.forEach(jingDongClient -> {
            jingDongClient.getAllProduct();
        });
    }

    @Test
    void getOrder() {
        jingDongService.jingDongClients.forEach(jingDongClient -> {
            jingDongClient.getOrder();
        });
    }

}