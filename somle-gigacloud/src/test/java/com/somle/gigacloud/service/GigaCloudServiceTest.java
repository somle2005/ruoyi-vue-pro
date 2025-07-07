package com.somle.gigacloud.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.gigacloud.model.req.GigaCloudBatchInventoryQueryReq;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;

@Disabled
@Slf4j
@Import({GigaCloudService.class})
class GigaCloudServiceTest extends SomleBaseDbUnitTest {

    @Resource
    private GigaCloudService gigaCloudService;

    @Test
    @SneakyThrows
    @Rollback(value = false)
    void test() {
        log.info("开始测试");
        gigaCloudService.refreshAuths();

    }

    @Test
    @SneakyThrows
    void test2() {
        gigaCloudService.clients.forEach(
            client -> {
                GigaCloudBatchInventoryQueryReq req = GigaCloudBatchInventoryQueryReq.builder()
                    .country("2")
                    .customerCode("D303")
                    .pageNum(1)
                    .pageSize(100)
                    .showZeroData(false)
                    .build();

                client.getAllBatchInventoryQuery();
            }
        );
    }


}