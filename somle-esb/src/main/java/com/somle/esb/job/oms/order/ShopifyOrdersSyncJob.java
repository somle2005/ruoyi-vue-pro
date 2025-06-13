package com.somle.esb.job.oms.order;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.module.oms.api.dto.OmsOrderSaveReqDTO;
import com.somle.esb.converter.oms.ShopifyToOmsConverter;
import com.somle.shopify.model.graphql.ShopifyGraphqlCommonPageQuery;
import com.somle.shopify.model.graphql.ShopifyGraphqlOrder;
import com.somle.shopify.model.graphql.ShopifyGraphqlOrderPageResult;
import com.somle.shopify.service.ShopifyClient;
import com.somle.shopify.service.ShopifyService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Slf4j
@Component
public class ShopifyOrdersSyncJob extends BaseOrdersSyncJob {
    @Resource
    ShopifyService shopifyService;

    @Resource
    ShopifyToOmsConverter shopifyToOmsConverter;

    @Override
    public List<OmsOrderSaveReqDTO> listOrders(String param) {
        LocalDate baseDate = LocalDate.parse(param);
        LocalDateTime endTime = baseDate.atTime(23, 59, 59);
        LocalDate startDate = baseDate.minusDays(2);
        LocalDateTime startTime = startDate.atStartOfDay();
        return shopifyService.shopifyClients.stream()
                .flatMap(client -> {
                    try {
                        List<ShopifyGraphqlOrder> shopifyGraphqlOrders = getAllShopifyGraphqlOrders(client, startTime, endTime);
                        return shopifyToOmsConverter.toOrders(shopifyGraphqlOrders, client).stream();
                    } catch (Exception e) {
                        log.error("Failed to fetch orders for client", e);
                        return Stream.empty(); // 发生异常时返回空流
                    }
                })
                .toList();
    }

    private static List<ShopifyGraphqlOrder> getAllShopifyGraphqlOrders(ShopifyClient client, LocalDateTime startTime, LocalDateTime endTime) {
        List<ShopifyGraphqlOrder> shopifyGraphqlOrders = new ArrayList<>();
        ShopifyGraphqlOrderPageResult shopifyGraphqlOrderPageResult = null;
        do {
            ShopifyGraphqlCommonPageQuery shopifyGraphqlCommonPageQuery = ShopifyGraphqlCommonPageQuery.build(250, null, startTime, endTime);
            if (Objects.nonNull(shopifyGraphqlOrderPageResult)) {
                shopifyGraphqlCommonPageQuery.setCursor(shopifyGraphqlOrderPageResult.getOrders().getPageInfo().getEndCursor());
            }
            shopifyGraphqlOrderPageResult = client.orderPageQuery(shopifyGraphqlCommonPageQuery);
            fillShopifyGraphqlOrders(shopifyGraphqlOrderPageResult, shopifyGraphqlOrders);
        } while (shopifyGraphqlOrderPageResult.getOrders().getPageInfo().getHasNextPage());
        return shopifyGraphqlOrders;
    }

    private static void fillShopifyGraphqlOrders(ShopifyGraphqlOrderPageResult shopifyGraphqlOrderPageResult, List<ShopifyGraphqlOrder> shopifyGraphqlOrders) {
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
    }
}
