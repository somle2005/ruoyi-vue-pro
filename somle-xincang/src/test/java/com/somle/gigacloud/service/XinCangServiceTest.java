package com.somle.gigacloud.service;

import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.xincang.service.GigaCloudService;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

@Disabled
@Slf4j
@Import({GigaCloudService.class})
class XinCangServiceTest extends SomleBaseDbUnitTest {

    @Resource
    private GigaCloudService gigaCloudService;

    @Test
    @SneakyThrows
    void test() {
        String token = "52B14718-E681-11EE-A0A7-00163E0184A2";
        String url = "https://oms.xincang-tech.com/oms/api.productlist?token=" + token + "&state=1";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(url)
            .build();
            String bodyString = WebUtils.sendRequest(request).body().string();
            log.info("bodyString: {}", bodyString);

    }
    @Test
    @SneakyThrows
    void test1() {
        String appKey = "X168_339";
        String secret = "52B14718-E681-11EE-A0A7-00163E0184A2";
        String url = "https://oms.xincang-tech.com/oms/api.login?appKey="+appKey+"&secret="+secret;
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(url)
            .build();
            String bodyString = WebUtils.sendRequest(request).body().string();
            log.info("bodyString: {}", bodyString);
    }

    @Test
    @SneakyThrows
    void test2() {
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJsb2dpbl91c2VyX2tleSI6ImU3ODFkZmNiLTI3MmUtNDM3NC04MTJjLTg4NzdhYWE5NTI4ZiJ9.MQPTfYW8Q1gl-KlwuesuQvFcE0nj1VJyc1ZJ64-qV7tImAq-QI7pws23s8vvsPoJchB7LQR9GLWBajtRJqJZng";
        String sk = "MIICdgIBADANBgkqhkiG9w";
        String time = "2024-01-20 13:59:59";
        String aa = token + time + sk;
    }


}