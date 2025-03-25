package com.somle.shopify.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.shopify.dal.ShopifyTokenMapper;
import com.somle.shopify.model.ShopifyToken;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    public Map<Long, ShopifyClient> clientMap = new HashMap();

    public OkHttpClient defaultClient = new OkHttpClient();

    @PostConstruct
    public void init() {
        CompletableFuture.runAsync(() -> {
            refreshToken();
        });
    }

    public ShopifyClient getClient(Long authId) {
        ShopifyClient shopifyClient = clientMap.get(authId);
        if (shopifyClient == null || CollectionUtil.isEmpty(shopifyClient.getTokenValues())) {
            throw new RuntimeException("token is null");
        }
        return shopifyClient;
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
                ShopifyClient shopifyClient = new ShopifyClient();
                assembleClientInformation(shopifyToken, shopifyClient);
                clientMap.put(shopifyToken.getId(), shopifyClient);
            }
        }
        //把token更新入库,由于Shopify token 固定所以不进行
    }

    private void assembleClientInformation(ShopifyToken shopifyToken, ShopifyClient shopifyClient) {
        Map<String, String> tokenValues = new HashMap<>();
        tokenValues.put("X-Shopify-Access-Token", shopifyToken.getAccessToken());
        shopifyClient.setShopifyToken(shopifyToken);
        shopifyClient.setTokenValues(tokenValues);
        shopifyClient.setWebClient(defaultClient);
    }

    private ShopifyToken applyPlatObtainToken(ShopifyToken shopifyToken) {
        // 调用平台接口 目前 shopify token为固定
        String accessToken = shopifyToken.getAccessToken();
        shopifyToken.setAccessToken(accessToken);
        return shopifyToken;
    }

    /**
     * 代理全部的client
     */
    public void proxyForAllClient(OkHttpClient proxyClient) {
        if (proxyClient!=null){
            defaultClient= proxyClient;
        }
    }

}
