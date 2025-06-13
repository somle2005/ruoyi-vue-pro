package com.somle.esb.job.oms.product;

import cn.hutool.core.collection.CollUtil;
import cn.iocoder.yudao.module.oms.api.dto.OmsShopProductSaveReqDTO;
import com.somle.esb.converter.oms.ShopifyToOmsConverter;
import com.somle.shopify.model.graphql.*;
import com.somle.shopify.model.reps.ShopifyShopProductRepsVO;
import com.somle.shopify.service.ShopifyClient;
import com.somle.shopify.service.ShopifyService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Slf4j
@Component
public class ShopifyShopProductsSyncJob extends BaseShopProductsSyncJob {

    @Resource
    ShopifyService shopifyService;

    @Resource
    ShopifyToOmsConverter shopifyToOmsConverter;


    @Override
    public List<OmsShopProductSaveReqDTO> listProducts() {
        return shopifyService.shopifyClients.stream()
                .flatMap(
                        client -> {


                            List<ShopifyGraphqlProduct> products = getAllShopifyGraphqlOrders(client);


                            return shopifyToOmsConverter.toProducts(products, client).stream();
                        }
                )
                .toList();
    }

    private static List<ShopifyGraphqlProduct> getAllShopifyGraphqlOrders(ShopifyClient client) {
        List<ShopifyGraphqlProduct> shopifyGraphqlProducts = new ArrayList<>();
        ShopifyGraphqlProductPageResult graphqlProductPageResult = null;
        do {
            ShopifyGraphqlCommonPageQuery shopifyGraphqlCommonPageQuery = ShopifyGraphqlCommonPageQuery.build(250, null, null, null);
            if (Objects.nonNull(graphqlProductPageResult)) {
                shopifyGraphqlCommonPageQuery.setCursor(graphqlProductPageResult.getProducts().getPageInfo().getEndCursor());
            }
            graphqlProductPageResult = client.productPageQuery(shopifyGraphqlCommonPageQuery);
            fillShopifyGraphqlProduct(graphqlProductPageResult, shopifyGraphqlProducts);
        } while (graphqlProductPageResult.getProducts().getPageInfo().getHasNextPage());
        return shopifyGraphqlProducts;
    }

    private static void fillShopifyGraphqlProduct(ShopifyGraphqlProductPageResult graphqlProductPageResult, List<ShopifyGraphqlProduct> shopifyGraphqlProducts) {
        ShopifyGraphqlProductPageResult.Products products = graphqlProductPageResult.getProducts();
        if (Objects.isNull(products) || CollUtil.isEmpty(products.getEdges())) {
            log.warn("fillShopifyGraphqlProduct failed orders is null or edges isEmpty");
            return;
        }
        products.getEdges().forEach(orderEdge -> {
                    if (Objects.isNull(orderEdge) || Objects.isNull(orderEdge.getNode())) {
                        log.warn("fillShopifyGraphqlProduct failed orderEdge is null or orderEdge.node isNull");
                        return;
                    }
                    shopifyGraphqlProducts.add(orderEdge.getNode());
                }
        );
    }
}
