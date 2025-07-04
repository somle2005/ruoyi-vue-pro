package com.somle.gigacloud.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.xincang.model.req.*;
import com.somle.xincang.service.XinCangClient;
import com.somle.xincang.service.XinCangService;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;

@Disabled
@Slf4j
@Import({XinCangService.class})
class XinCangServiceTest extends SomleBaseDbUnitTest {

    @Resource
    private XinCangService xinCangService;

    @Test
    @SneakyThrows
    @Rollback(false)
    void test() {
        xinCangService.refreshAuths();
    }

    @Test
    @SneakyThrows
    void test1() {
        String appKey = "X168_339";
        String secret = "52B14718-E681-11EE-A0A7-00163E0184A2";
        String url = "https://oms.xincang-tech.com/oms/api.login?appKey=" + appKey + "&secret=" + secret;


        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
            .url("https://oms.xincang-tech.com/oms/api.login?appkey=" + appKey + "&secret=" + secret)
            .get()
            .build();
        Response response = client.newCall(request).execute();
        String result = response.body().string();
        log.info("result: {}", result);
    }

    @Test
    @SneakyThrows
    void test2() {

        xinCangService.clients.forEach(
            client -> {
                client.getOrderList();
            }
        );
    }

    @Test
    @SneakyThrows
    void test3() {
        XinCangClient client = xinCangService.clients.get(0);
        XinCangAddProductReq req = XinCangAddProductReq.builder()
            .productNo("TestSku")
            .chnName("zhijin")
            .amount("1")
            .barCode("123456789")
            .weightLbs("1")
            .packingRate("1")
            .sizeLLn("1")
            .sizeWLn("1")
            .sizeHLn("1")
            .build();
        client.addProduct(req);
    }

    @Test
    @SneakyThrows
    void test4() {
        XinCangClient client = xinCangService.clients.get(0);
        XinCangUpdateProductReq req = XinCangUpdateProductReq.builder()
            .productNo("TestSku")
            .chnName("zhijin11111111111111111111111111111111111111")
            .amount("1")
            .barCode("123456789")
            .weightLbs("1")
            .packingRate("1")
            .sizeLLn("1")
            .sizeWLn("1")
            .sizeHLn("1")
            .build();
        client.updateProduct(req);
    }

    @Test
    @SneakyThrows
    void test5() {
        XinCangClient client = xinCangService.clients.get(0);
        client.deleteProduct("TestSku");
    }

    @Test
    @SneakyThrows
    void test6() {
        XinCangClient client = xinCangService.clients.get(0);
        XinCangAddOrderMultipleReq req = XinCangAddOrderMultipleReq.builder()
            .orderType("common")
            .warehouseCode("NJ-2605")
            .products("[{\"product_sku\":\"SD309103WW-USA\",\"sku_count\":\"1\"}]")
            .ckh("Testckh")
            .country("US")
            .province("OH")
            .city("LEBANON")
            .address("84 ROUGH WAY UNIT 9")
            .logisticsType("FEDEX-G")
            .postcode("45036-8168")
            .receiveUser("CASSIDY BOWEN")
            .phone("+1 480-618-5344")
            .isSign("否").build();
        client.addOrderMultiple(req);
    }

    @Test
    @SneakyThrows
    void test7() {
        XinCangClient client = xinCangService.clients.get(0);
        XinCangUpdateOrderReq req = XinCangUpdateOrderReq.builder()
            .orderNo("X168-250704-464475753677985125")
            .orderType("common")
            .warehouseCode("NJ-2605")
            .productSku("SD309103WW-USA")
            .skuCount("2")
            .ckh("Testckh")
            .country("US")
            .province("OH")
            .city("LEBANON")
            .address("84 ROUGH WAY UNIT 9")
            .logisticsType("FEDEX-G")
            .postcode("45036-8168")
            .receiveUser("CASSIDY BOWEN")
            .phone("+1 480-618-5344")
            .isSign("否").build();
        client.updateOrder(req);
    }

    @Test
    @SneakyThrows
    void test8() {
        XinCangClient client = xinCangService.clients.get(0);
        client.approveOrders("X168-250704-464475753677985125");
    }

    @Test
    @SneakyThrows
    void test9() {
        XinCangClient client = xinCangService.clients.get(0);
        XinCangDoInterceptReq req = XinCangDoInterceptReq.builder()
            .ordernos("X168-250704-464475753677985125")
            .build();
        client.interceptOrder( req);
    }

    @Test
    @SneakyThrows
    void test10() {
        XinCangClient client = xinCangService.clients.get(0);
        XinCangDeleteOrderReq req = XinCangDeleteOrderReq.builder()
            .orderNo("X168-250704-464475753677985125")
            .build();
        client.deleteOrder(req);
    }

}