package com.somle.shopify.service;

import cn.hutool.core.collection.CollectionUtil;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.shopify.repository.ShopifyTokenRepository;
import com.somle.shopify.model.ShopifyTokenDO;
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
    private ShopifyTokenRepository shopifyTokenRepository;

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
        LambdaQueryWrapper<ShopifyTokenDO> shopifyTokenLambdaQueryWrapper = new LambdaQueryWrapper<>();
        List<ShopifyTokenDO> shopifyTokenDOS = shopifyTokenRepository.selectList(shopifyTokenLambdaQueryWrapper);
        if (!CollectionUtils.isEmpty(shopifyTokenDOS)) {
            //循环调用 平台获取token接口
            for (ShopifyTokenDO shopifyTokenDO : shopifyTokenDOS) {
                applyPlatObtainToken(shopifyTokenDO);
                ShopifyClient shopifyClient = new ShopifyClient();
                assembleClientInformation(shopifyTokenDO, shopifyClient);
                clientMap.put(shopifyTokenDO.getId(), shopifyClient);
            }
        }
        //把token更新入库,由于Shopify token 固定所以不进行
    }

    private void assembleClientInformation(ShopifyTokenDO shopifyTokenDO, ShopifyClient shopifyClient) {
        Map<String, String> tokenValues = new HashMap<>();
        tokenValues.put("X-Shopify-Access-Token", shopifyTokenDO.getAccessToken());
        shopifyClient.setShopifyTokenDO(shopifyTokenDO);
        shopifyClient.setTokenValues(tokenValues);
        shopifyClient.setWebClient(defaultClient);
    }

    private ShopifyTokenDO applyPlatObtainToken(ShopifyTokenDO shopifyTokenDO) {
        // 调用平台接口 目前 shopify token为固定
        String accessToken = shopifyTokenDO.getAccessToken();
        shopifyTokenDO.setAccessToken(accessToken);
        return shopifyTokenDO;
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
