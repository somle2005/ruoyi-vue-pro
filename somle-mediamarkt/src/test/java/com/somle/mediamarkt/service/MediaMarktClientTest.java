package com.somle.mediamarkt.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.mediamarkt.model.pojo.MediaMarktAccount;
import com.somle.mediamarkt.model.req.MediaMarktInvoicesReq;
import com.somle.mediamarkt.model.req.MediaMarktOrderReq;
import com.somle.mediamarkt.model.resp.MediaMarktCommonInvoicesResp;
import com.somle.mediamarkt.repository.MediaMarktAccountRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Slf4j
class MediaMarktClientTest extends SomleBaseDbUnitTest {
    @Resource
    MediaMarktAccountRepository MediaMarktAccountRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
//    @Rollback(value = false)
    void getOrder() {
        System.out.println("开始");
        List<MediaMarktAccount> accountList = MediaMarktAccountRepository.findAll();

        MediaMarktAccountRepository.findAll()
            .stream()
            .findFirst()
            .ifPresent(MediaMarktAccount -> {
                MediaMarktClient client = new MediaMarktClient(MediaMarktAccount);


                String param = "2024-12-26";
                LocalDate baseDate = LocalDate.parse(param);
                // 2. 计算前两天的日期
                LocalDate targetDate = baseDate.minusDays(2);
                // 3. 生成起始时间（00:00:00）
                LocalDateTime startTime = targetDate.atStartOfDay().minusDays(100);
                // 4. 生成结束时间（23:59:59）
                LocalDateTime endTime = targetDate.atTime(23, 59, 59);

                MediaMarktOrderReq req = MediaMarktOrderReq.builder()
                    .max(100)
                    .startDate(startTime.toString())
                    .endDate(endTime.toString())
                    .build();

                client.getAllOrders(req);

            });


    }

    @Test
    void getInvoices() {
        MediaMarktAccountRepository.findAll()
            .stream()
            .findFirst()
            .ifPresent(MediaMarktAccount -> {
                MediaMarktClient client = new MediaMarktClient(MediaMarktAccount);

                MediaMarktInvoicesReq req = MediaMarktInvoicesReq.builder()
                    .max(100)
                    .startDate("2024-12-01T14:30:00Z")
                    .endDate("2024-12-24T14:30:00Z")
                    .build();

                MediaMarktCommonInvoicesResp<Object> invoices = client.getInvoices(req);
                log.info("data长度:{},数组长度{},内容{}", invoices.getTotal_count(), invoices.getInvoices()
                    .size(), invoices.getInvoices());
            });
    }


    @Test
    void getShopInformation() {
        MediaMarktAccountRepository.findAll()
            .stream()
            .findFirst()
            .ifPresent(MediaMarktAccount -> {
                MediaMarktClient client = new MediaMarktClient(MediaMarktAccount);
                client.getShopInformation();
            });
    }
}