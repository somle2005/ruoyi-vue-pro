package com.somle.gigacloud.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

@Disabled
@Slf4j
@Import({GigaCloudService.class})
class GigaCloudServiceTest extends SomleBaseDbUnitTest {

    @Resource
    private GigaCloudService gigaCloudService;

    @Test
    @SneakyThrows
    void test() {
        log.info("开始测试");
        gigaCloudService.clients.forEach(client -> {
            log.info("开始处理：{}", client.getAccount().getUserName());
            client.getToken();
        });

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