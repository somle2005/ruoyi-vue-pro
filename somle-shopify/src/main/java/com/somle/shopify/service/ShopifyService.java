package com.somle.shopify.service;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.shopify.dal.ShopifyTokenMapper;
import com.somle.shopify.model.ShopifyToken;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-20 15:10
 **/
@Slf4j
@ConditionalOnProperty(name = "threePartyPlatform.shopify.refreshToken.enable", havingValue = "true")
@Component
public class ShopifyService {

    @Resource
    private ShopifyTokenMapper shopifyTokenMapper;

    @Resource
    private ShopifyClient shopifyClient;

    @PostConstruct
    public void init() {
        CompletableFuture.runAsync(() -> {
            refreshToken();
        });
    }

    @Scheduled(cron = "${threePartyPlatform.shopify.refreshToken.cron}")
    public void refreshToken() {
        log.info("Shopify refreshToken start");
        //查询所有能认证的店铺
        LambdaQueryWrapper<ShopifyToken> shopifyTokenLambdaQueryWrapper = new LambdaQueryWrapper<>();
        List<ShopifyToken> shopifyTokens = shopifyTokenMapper.selectList(shopifyTokenLambdaQueryWrapper);

        if (!CollectionUtils.isEmpty(shopifyTokens)) {
            //循环调用 平台获取token接口
            for (ShopifyToken shopifyToken : shopifyTokens) {
                applyPlatObtainToken(shopifyToken);
                shopifyClient.tokenMap.put(shopifyToken.getShopName(), shopifyToken);
            }
        }
        //把token更新入库,由于Shopify token 固定所以不进行
    }

    private ShopifyToken applyPlatObtainToken(ShopifyToken shopifyToken) {
        // 拿shopName 调用平台接口 目前 shopify token为固定
        String accessToken = null;
        if ("Shopify_FIT_USA".equals(shopifyToken.getShopName())) {
            accessToken = shopifyToken.getAccessToken();
        }
        shopifyToken.setAccessToken(accessToken);
        return shopifyToken;
    }

}
