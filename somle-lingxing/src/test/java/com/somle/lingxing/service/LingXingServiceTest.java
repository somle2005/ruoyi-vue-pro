package com.somle.lingxing.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.lingxing.model.reps.LingXingOutboundOrderListReps;
import com.somle.lingxing.model.req.LingXingOutboundOrderDetailReq;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    @SneakyThrows
    void test1() {
        lingXingService.clients.forEach(client -> {
            List<LingXingOutboundOrderListReps.ResponseData.OutboundRecord> outboundOrder = client.getAllOutboundOrder();
            List<String> outboundOrderNos = outboundOrder.stream().map(LingXingOutboundOrderListReps.ResponseData.OutboundRecord::getOutboundOrderNo).collect(Collectors.toList());
            LingXingOutboundOrderDetailReq req = LingXingOutboundOrderDetailReq.builder()
                .outboundOrderNoList(outboundOrderNos)
                .build();
                client.getOutBoundOrderDetail(req);
        });
    }
}