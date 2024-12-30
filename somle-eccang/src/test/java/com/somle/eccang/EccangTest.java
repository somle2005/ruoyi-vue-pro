package com.somle.eccang;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.somle.eccang.model.*;
import com.somle.eccang.repository.EccangInventorySyncLogRepository;
import com.somle.eccang.repository.EccangProductSkuRepository;
import com.somle.eccang.repository.EccangTokenRepository;
import com.somle.eccang.service.EccangService;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.test.core.ut.BaseSpringTest;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Stream;


@Slf4j
@Import({
    EccangService.class
})
public class EccangTest extends BaseSpringTest {
    @Resource
    EccangService service;

    @Resource
    EccangTokenRepository tokenRepo;
    @Resource
    EccangInventorySyncLogRepository repository;
    @Resource
    EccangProductSkuRepository eccangProductSkuRepository;

    @MockBean(name = "dataChannel")
    MessageChannel dataChannel;

    @MockBean(name = "saleChannel")
    MessageChannel saleChannel;

    @BeforeEach
    void init() {
        log.info("run init");
    }


    @Test
    void list() {
        List<EccangShippingMethod> list = service.getShippingMethod()
            .toList();
        log.info(list.toString());
    }

    @Test
    void post() {
    }

    @Test
    public void testInit() {
    }

    @Test
    void getWarehouseList() {
        var result = service.getWarehouseList();
        log.info(result.toString());
    }

    @Test
    void getInventory() {
        var result = service.getInventory();
        log.info(result.toString());
    }

    @Test
    void getInventoryBatchLog() {
        var date = LocalDate.of(2024, 12, 19);
        var time1 = LocalTime.of(0, 0, 0);
        var time2 = LocalTime.of(23, 59, 59);
        var datetime1 = LocalDateTime.of(date, time1);
        var datetime2 = LocalDateTime.of(date, time2);
        EccangInventoryBatchLogVO vo = new EccangInventoryBatchLogVO();
        vo.setDateFrom(datetime1);
        vo.setDateTo(datetime2);
        var result = service.getInventoryBatchLog(vo);
        System.err.println(result.toList()
            .size());
    }


    @Test
    public void testRepo() {
        Assertions.assertEquals(2, tokenRepo.findAll()
            .size());
    }

    @Test
    public void getOrder() {
        var date = LocalDate.of(2023, 12, 10);
        var time1 = LocalTime.of(0, 0, 0);
        var time2 = LocalTime.of(23, 59, 59);
        var datetime1 = LocalDateTime.of(date, time1);
        var datetime2 = LocalDateTime.of(date, time2);
        var result = service.getOrderArchivePages(
            EccangOrderVO.builder()
                .condition(EccangOrderVO.Condition.builder()
                    .platformPaidDateStart(datetime1)
                    .platformPaidDateEnd(datetime2)
                    .build())

                .build(),
            2023
        );
        log.info(String.valueOf(result.toList()
            .size()));
    }

    @Test
    void test1() {
        var date = LocalDate.of(2023, 12, 10);
        var time1 = LocalTime.of(0, 0, 0);
        var time2 = LocalTime.of(23, 59, 59);
        var datetime1 = LocalDateTime.of(date, time1);
        var datetime2 = LocalDateTime.of(date, time2);
        var result = service.getOrderUnarchivePages(
            EccangOrderVO.builder()
                .condition(EccangOrderVO.Condition.builder()
                    .platformPaidDateStart(datetime1)
                    .platformPaidDateEnd(datetime2)
                    .build())

                .build()
        );
        log.info(String.valueOf(result.toList()
            .size()));
    }

    @Test
    void test2() {
        var date = LocalDate.of(2023, 12, 10);
        var time1 = LocalTime.of(0, 0, 0);
        var time2 = LocalTime.of(23, 59, 59);
        var datetime1 = LocalDateTime.of(date, time1);
        var datetime2 = LocalDateTime.of(date, time2);
        var result = service.getOrderArchivePages(
            EccangOrderVO.builder()
                .condition(EccangOrderVO.Condition.builder()
                    .platformPaidDateStart(datetime1)
                    .platformPaidDateEnd(datetime2)
                    .build())

                .build(),
            2023
        );
        log.info(String.valueOf(result.toList()
            .size()));
    }

    @Test
    void getRmaRefundList() {
        EccangRmaRefundVO vo = new EccangRmaRefundVO();
        vo.setRefundDateForm(LocalDateTime.now()
            .minusDays(5));
        vo.setRefundDateTo(LocalDateTime.now()
            .minusDays(4));
        List<EccangResponse.EccangPage> list = service.getRmaRefundList(vo)
            .toList();
        log.info(list.toString());
    }

    @Test
    void getInventoryTest() {
        Stream.iterate(0, n -> n + 1)
            .limit(100)
            .forEach(System.out::println);
    }

    @Test
    @Transactional
    @Rollback(false)
    void getAllPageWithResumeTest() {
        // 构造 Map 数据，不直接使用Map来创建ObjectNode，因为需要数组
        String productSku = "CO309301MB-UK";

        // 创建 ObjectMapper 实例
        ObjectMapper objectMapper = new ObjectMapper();

        // 创建 ObjectNode
        ObjectNode objectNode = objectMapper.createObjectNode();

        // 创建 ArrayNode 并添加到 ObjectNode
        ArrayNode arrayNode = objectMapper.createArrayNode();
        arrayNode.add(productSku);
        objectNode.set("product_sku", arrayNode);

        // 使用 ObjectNode 创建 JSONObject
        JSONObject json = new JSONObject(objectNode); // 确保JSONObject是正确格式化的

        // 通过 service 进行全量同步
        EccangResponse.EccangPage page = service.getPage(json, "getProductInventory");
        List<EccangProductSku> data = page.getData(EccangProductSku.class);
        System.out.println("data = " + data);
    }


    @Test
    void getAllPage() {
        repository.findAll()
            .forEach(
                eccangInventorySyncLog -> System.out.println("eccangInventorySyncLog = " + eccangInventorySyncLog)
            );
        System.out.println("eccangProductSkuRepository.findAll().size() = " + eccangProductSkuRepository.findAll()
            .size());

    }

    @Test
    void name() {
        service.getAllPageWithResume(new JSONObject(), "getProductInventory").forEach(
            eccangPage -> {
                System.out.println("eccangPage = " + eccangPage);
            }
        );
    }
}