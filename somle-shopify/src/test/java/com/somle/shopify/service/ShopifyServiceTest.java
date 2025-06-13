package com.somle.shopify.service;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.framework.common.util.json.JsonUtils;
import cn.iocoder.yudao.framework.test.core.ut.SomleBaseDbUnitTest;
import com.somle.shopify.model.ShopifyToken;
import com.somle.shopify.model.graphql.*;
import com.somle.shopify.repository.ShopifyTokenRepository;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;


@Disabled
@Slf4j
class ShopifyServiceTest extends SomleBaseDbUnitTest {
//    @Resource
//    ShopifyClient client;

    @Resource
    ShopifyTokenRepository shopifyTokenRepository;

//    @Test
//    void test() {
//        log.info(client.getProducts(new HashMap<>()).toString());
//    }

    @Test
    void test() {
        ShopifyClient client = new ShopifyClient(shopifyTokenRepository.findAll().get(0));
        log.info(client.getProducts(new HashMap<>()).toString());
    }

    @Test
    void test2() {
        ShopifyClient client = new ShopifyClient(shopifyTokenRepository.findAll().get(0));
        log.info(client.getPayouts().toString());
    }

    @Test
    void test3() {
        ShopifyClient client = new ShopifyClient(shopifyTokenRepository.findAll().get(0));
        String param = "2025-05-14";
        LocalDate baseDate = LocalDate.parse(param);
        // 2. 计算前两天的日期
        LocalDate targetDate = baseDate.minusDays(2);
        // 3. 生成起始时间（00:00:00）
        LocalDateTime startTime = targetDate.atStartOfDay();
        // 4. 生成结束时间（23:59:59）
        LocalDateTime endTime = targetDate.atTime(23, 59, 59);
        log.info(client.getAllOrders(startTime, endTime).toString());
    }

    @Test
    void test4() {
        ShopifyClient client = new ShopifyClient(shopifyTokenRepository.findAll().get(0));
        log.info(client.getShop().toString());
    }


    @Test
    void graphqlRequestOrdersTest() {
        List<ShopifyGraphqlOrder> shopifyGraphqlOrders = new ArrayList<>();
        List<ShopifyToken> all = shopifyTokenRepository.findAll();
        all.forEach(shopifyToken -> {
            ShopifyClient client = new ShopifyClient(shopifyToken);
            String param = "2025-05-14";
            LocalDate baseDate = LocalDate.parse(param);
            LocalDateTime endTime = baseDate.atTime(23, 59, 59);
            LocalDate startDate = baseDate.minusDays(20);
            LocalDateTime startTime = startDate.atStartOfDay();
            ShopifyGraphqlOrderPageResult shopifyGraphqlOrderPageResult = null;
            do {
                ShopifyGraphqlCommonPageQuery shopifyGraphqlCommonPageQuery = ShopifyGraphqlCommonPageQuery.build(1, null, startTime, endTime);
                if (Objects.nonNull(shopifyGraphqlOrderPageResult)) {
                    shopifyGraphqlCommonPageQuery.setCursor(shopifyGraphqlOrderPageResult.getOrders().getPageInfo().getEndCursor());
                }
                shopifyGraphqlOrderPageResult = client.orderPageQuery(shopifyGraphqlCommonPageQuery);
                ShopifyGraphqlOrderPageResult.Orders orders = shopifyGraphqlOrderPageResult.getOrders();
                if (Objects.isNull(orders) || CollUtil.isEmpty(orders.getEdges())) {
                    log.warn("fillShopifyGraphqlOrders failed orders is null or edges isEmpty");
                    return;
                }
                orders.getEdges().forEach(orderEdge -> {
                            if (Objects.isNull(orderEdge) || Objects.isNull(orderEdge.getNode())) {
                                log.warn("fillShopifyGraphqlOrders failed orderEdge is null or orderEdge.node isNull");
                                return;
                            }
                            shopifyGraphqlOrders.add(orderEdge.getNode());
                        }
                );
            } while (shopifyGraphqlOrderPageResult.getOrders().getPageInfo().getHasNextPage());


        });
        shopifyGraphqlOrders.forEach(shopifyGraphqlOrder -> log.info(shopifyGraphqlOrder.getName() + "----" + shopifyGraphqlOrder.getCreatedAt()));
    }

    @Test
    void graphqlRequestProductsTest() {
        List<ShopifyGraphqlProduct> shopifyGraphqlProducts = new ArrayList<>();
        List<ShopifyToken> all = shopifyTokenRepository.findAll();
        all.forEach(shopifyToken -> {
            ShopifyClient client = new ShopifyClient(shopifyToken);
            ShopifyGraphqlProductPageResult graphqlProductPageResult = null;
            do {
                ShopifyGraphqlCommonPageQuery shopifyGraphqlCommonPageQuery = ShopifyGraphqlCommonPageQuery.build(1, null, null, null);
                if (Objects.nonNull(graphqlProductPageResult)) {
                    shopifyGraphqlCommonPageQuery.setCursor(graphqlProductPageResult.getProducts().getPageInfo().getEndCursor());
                }
                graphqlProductPageResult = client.productPageQuery(shopifyGraphqlCommonPageQuery);
                ShopifyGraphqlProductPageResult.Products products = graphqlProductPageResult.getProducts();
                if (Objects.isNull(products) || CollUtil.isEmpty(products.getEdges())) {
                    log.warn("fillShopifyGraphqlOrders failed orders is null or edges isEmpty");
                    return;
                }
                products.getEdges().forEach(orderEdge -> {
                            if (Objects.isNull(orderEdge) || Objects.isNull(orderEdge.getNode())) {
                                log.warn("fillShopifyGraphqlOrders failed orderEdge is null or orderEdge.node isNull");
                                return;
                            }
                            shopifyGraphqlProducts.add(orderEdge.getNode());
                        }
                );
            } while (graphqlProductPageResult.getProducts().getPageInfo().getHasNextPage());
        });
        shopifyGraphqlProducts.forEach(shopifyGraphqlProduct -> log.info(shopifyGraphqlProduct.getTitle() + "----" + shopifyGraphqlProduct.getCreatedAt()));
    }

    @Test
    void testRequestShopInfo() {
        List<ShopifyToken> all = shopifyTokenRepository.findAll();
        all.forEach(shopifyToken -> {
            ShopifyClient client = new ShopifyClient(shopifyToken);
            ShopifyGraphqlShopInfo shopInfo = client.getShopInfo();
            log.info("子域名：{}，查询到的店铺信息：{}", shopifyToken.getSubdomain(), shopInfo);
        });

    }

}