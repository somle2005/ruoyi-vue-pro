package com.somle.amazon.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseSpringTest;
import com.somle.amazon.controller.vo.AmazonSpMarketplaceParticipationVO;
import com.somle.amazon.controller.vo.AmazonSpMarketplaceVO;
import com.somle.amazon.controller.vo.AmazonSpReportReqVO;
import com.somle.amazon.controller.vo.AmazonSpReportRespVO;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Disabled
@Slf4j
@Import({
    AmazonService.class,
    AmazonSpService.class,
})
class AmazonSpServiceTest extends SomleBaseSpringTest {
    @Resource
    AmazonSpService spService;


//    @Test
//    void getSettlementReport() {
//        var shop = amazonService.shopRepository.findByCountryCode("UK");
//        var report = amazonService.spClient.getSettlementReport(shop LocalDate.of(2024,8,10));
//        log.info(report.toString());
//    }

    @Test
    @Rollback(false)
    void refreshToken() {
        spService.refreshAuths();
    }

    @Test
    void getShops() {
        List<AmazonSpMarketplaceParticipationVO> all = new ArrayList<>();
        spService.clients.forEach(client -> {
            all.addAll(client.getMarketplaceParticipations());
        });
        log.info("{}", all);
    }

    @Test
    void getAccount() {
        spService.clients.forEach(client -> {
            log.info("{}", client.getMarketplaceParticipations());
        });
    }

    @Test
    void getListings() {
        spService.clients.forEach(client -> {
            List<String> marketplaceIds = client.getMarketplaceParticipations().stream()
                .map(AmazonSpMarketplaceParticipationVO::getMarketplace)
                .map(AmazonSpMarketplaceVO::getId)
                .toList();
            log.info("{}", client.getProducts(marketplaceIds));
        });
    }
    @Test
    void getOrders() {
        AmazonSpClient amazonSpClient = spService.clients.get(2);
        amazonSpClient.getInvoicesDocument("INV-ES-167778821-2024-663");
    }

    @Test
    void getReports(){
        AmazonSpClient amazonSpClient = spService.clients.get(1);
        var vo = AmazonSpReportReqVO.builder()
            .reportTypes(List.of("GET_DATE_RANGE_FINANCIAL_HOLDS_DATA"))
//            .processingStatuses(List.of(AmazonSpReportReqVO.ProcessingStatuses.DONE))
            .createdSince(LocalDateTime.of(2025, 6, 1, 0, 0))
            .createdUntil(LocalDateTime.of(2025, 6, 15, 23, 59))
            .pageSize(20)
            .build();
        List<AmazonSpReportRespVO> amazonSpReportRespVOS = amazonSpClient.listReports(vo);
        log.info("{}", amazonSpReportRespVOS);
        amazonSpClient.waitAndGetReportDocumentString("1242727020265");
    }

    @Test
    void getReport() {
       spService.clients.forEach(client -> {
           var vo = AmazonSpReportReqVO.builder()
               .reportTypes(List.of("GET_DATE_RANGE_FINANCIAL_HOLDS_DATA"))
//            .processingStatuses(List.of(AmazonSpReportReqVO.ProcessingStatuses.DONE))
               .createdSince(LocalDateTime.of(2025, 5, 1, 0, 0))
               .createdUntil(LocalDateTime.of(2025, 6, 30, 23, 59))
               .pageSize(20)
               .build();
           List<AmazonSpReportRespVO> amazonSpReportRespVOS = client.listReports(vo);
           log.info("{}", amazonSpReportRespVOS);
       });
    }

    @Test
    @SneakyThrows
    void getReport2() {
        spService.clients.forEach(client -> {
            var vo = AmazonSpReportReqVO.builder()
                .reportTypes(List.of("GET_FBA_FULFILLMENT_INBOUND_NONCOMPLIANCE_DATA"))
//            .processingStatuses(List.of(AmazonSpReportReqVO.ProcessingStatuses.DONE))
                .createdSince(LocalDateTime.of(2025, 4, 10, 0, 0))
                .createdUntil(LocalDateTime.of(2025, 7, 7, 23, 59))
                .pageSize(20)
                .build();

            client.listReports(vo);
        });
    }

}