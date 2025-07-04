package com.somle.lingxing.service;

import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.lingxing.model.reps.LingXingOutboundOrderListReps;
import com.somle.lingxing.model.req.LingXingBatchCreateProductReq;
import com.somle.lingxing.model.req.LingXingCreateOutboundOrderReq;
import com.somle.lingxing.model.req.LingXingOutboundOrderDetailReq;
import jakarta.annotation.Resource;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;

import java.math.BigDecimal;
import java.util.ArrayList;
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

    @Test
    @SneakyThrows
    void test2() {
        LingXingClient client = lingXingService.clients.get(0);
        List<LingXingBatchCreateProductReq.ProductData> productDataList = new ArrayList<>();

        LingXingBatchCreateProductReq.ProductData productData = LingXingBatchCreateProductReq.ProductData.builder()
            .sku("TestSku-07-04")
            .productCode("productCode")
            .productAliasName("productAliasName")
            .productName("productName")
            .productDescription("productDescription")
            .length(BigDecimal.valueOf(1))
            .width(BigDecimal.valueOf(1))
            .height(BigDecimal.valueOf(1))
            .weight(BigDecimal.valueOf(1))
            .sizeUnit("cm")
            .declareNameCn("桌子")
            .declareNameEn("declareNameEn")
            .customhouseCode("chc")
            .declarePrice(BigDecimal.valueOf(8))
            .countryOfOriginName("CN")
            .dangerousCargo(1)
            .build();
        productDataList.add(productData);
        client.batchCreateProduct(productDataList);
    }


    @Test
    @SneakyThrows
    void test3() {
        LingXingClient client = lingXingService.clients.get(0);
        LingXingBatchCreateProductReq.ProductData productData = LingXingBatchCreateProductReq.ProductData.builder()
            .sku("TestSku-07-04")
            .productCode("productCode")
            .productAliasName("productAliasName1111111111")
            .productName("productName111111111111")
            .productDescription("productDescription")
            .length(BigDecimal.valueOf(1))
            .width(BigDecimal.valueOf(1))
            .height(BigDecimal.valueOf(1))
            .weight(BigDecimal.valueOf(1))
            .sizeUnit("cm")
            .declareNameCn("桌子")
            .declareNameEn("declareNameEn")
            .customhouseCode("chc")
            .declarePrice(BigDecimal.valueOf(8))
            .countryOfOriginName("CN")
            .dangerousCargo(1)
            .build();
        client.updateProduct(productData);
    }

    @Test
    @SneakyThrows
    public void test4() {
        LingXingClient client = lingXingService.clients.get(0);
        List<LingXingCreateOutboundOrderReq.OrderData> orderDataList = new ArrayList<>();

        List<LingXingCreateOutboundOrderReq.Product> products = new ArrayList<>();
        LingXingCreateOutboundOrderReq.Product product = LingXingCreateOutboundOrderReq.Product.builder()
            .quantity(1)
            .sku("W11F409AC-USA")
            .build();
        products.add(product);


        LingXingCreateOutboundOrderReq.OrderData orderData = LingXingCreateOutboundOrderReq.OrderData.builder()
            .subOrderType(1)
            .receiver("张三")
            .logisticsChannel("LA-FedEx-OS-2592053")
            .provinceCode("110000")
            .contactName("张三")
            .companyName("张三")
            .telephone("123456789")
            .countryRegionCode("CN")
            .referOrderNo("")
            .thirdOrderNo("")
            .cityName("北京")
            .countryRegionName("中国")
            .whCode("LAX02")
            .addressTwo("111")
            .postCode("111")
            .addressName("111")
            .addressOne("111")
            .provinceName("北京")
            .thirdOrderNo("ccc")
            .productList(products)
            .build();
        orderDataList.add(orderData);

        LingXingCreateOutboundOrderReq req = LingXingCreateOutboundOrderReq.builder()
            .data(orderDataList)
            .build();
        client.createWmsOutbound(req);
    }

    @Test
    @SneakyThrows
    void test5() {
        log.info("开始测试");
        lingXingService.clients.forEach(client -> {
            client.getChannelList();
        });
    }
}