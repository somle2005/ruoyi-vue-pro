package com.somle.gigacloud.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
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
        String url = "https://oms.xincang-tech.com/oms/api.login?appKey="+appKey+"&secret="+secret;



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
                client.getAllProducts();
            }
        );
    }


}