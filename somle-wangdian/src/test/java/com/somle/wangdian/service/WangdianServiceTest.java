package com.somle.wangdian.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.wangdian.model.WangdianTradeReqVO;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.time.LocalDateTime;

@Disabled
@Slf4j
@Import(WangdianService.class)
class WangdianServiceTest extends SomleBaseDbUnitTest {

    @Resource
    WangdianService service;

    @Test
    @SneakyThrows
    public void test() {
        var startTime = LocalDateTime.of(2024,11,7,8,0);
        var endTime = LocalDateTime.of(2024,11,7,9,0);


        var reqVO = WangdianTradeReqVO.builder()
            .startTime(startTime)
            .endTime(endTime)
            .pageSize(100)
            .pageNo(0)
            .build();

        String result = String.valueOf(service.clients.get(0).execute("trade_query.php", reqVO));

        log.info(result.toString());
    }

    @Test
    @SneakyThrows
    public void test2() {
       service.clients.get(0).getShopInfo();
    }
    @Test
    @SneakyThrows
    public void test3() {
        service.clients.get(0).getAllProduct();
    }

    @Test
    @SneakyThrows
    public void test4() {
//        LocalDateTime startTime = LocalDateTime.of(2024,11,7,8,0,0);
//
//        LocalDateTime endTime = LocalDateTime.of(2024,11,7,9,0,0);
        LocalDateTime startTime = LocalDateTime.of(2024,11,7,5,0,0);

        LocalDateTime endTime = LocalDateTime.of(2024,11,8,5,0,0);
        service.clients.get(0).getAllOrder(startTime, endTime);
    }



}