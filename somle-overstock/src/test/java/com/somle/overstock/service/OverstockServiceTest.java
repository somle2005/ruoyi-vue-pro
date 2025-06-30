package com.somle.overstock.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.time.LocalDate;

@Disabled
@Slf4j
@Import({OverstockService.class})
class OverstockServiceTest extends SomleBaseDbUnitTest {
    @Resource
    OverstockService service;

    @Test
    void test() {
        LocalDate baseDate = LocalDate.parse("2025-06-21");
        // 2. 计算前两天的日期
        LocalDate targetDate = baseDate.minusDays(2);
        // 3. 生成起始时间（00:00:00）
        String startTime = targetDate.atStartOfDay().toString();
        // 4. 生成结束时间（23:59:59）
        String endTime = targetDate.plusDays(1L).toString();
        log.info(service.clients.get(0).getOrders("2025-06-20", "2025-06-21").toString());
    }
}