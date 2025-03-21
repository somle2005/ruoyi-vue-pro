package com.somle.shopify.service;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import com.somle.shopify.model.ShopifyShopAndTokenInfo;
import com.somle.shopify.dal.ShopifyTokenMapper;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.net.Proxy;
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
            initClient();
            refreshToken();
        });
    }

    private void initClient() {
        String proxyHost = "intra.somle.com";
        Integer proxyPort = 55014;
        String proxyUsername = "admin";
        String proxyPassword = "sM234s,a.sm";
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
        OkHttpClient client = new OkHttpClient.Builder()
            .proxy(proxy)
            .proxyAuthenticator((route, response) -> {
                String credential = okhttp3.Credentials.basic(proxyUsername, proxyPassword);
                return response.request().newBuilder()
                    .header("Proxy-Authorization", credential)
                    .build();
            })
            .build();

        shopifyClient.webClient = client;
    }

    @Scheduled(cron = "${threePartyPlatform.shopify.refreshToken.cron}")
    public void refreshToken() {
        log.info("Shopify refreshToken start");
        //查询所有能认证的店铺
        List<ShopifyShopAndTokenInfo> shopifyShopAndTokenInfos = shopifyTokenMapper.getShopAndTokenInfo();
        if (!CollectionUtils.isEmpty(shopifyShopAndTokenInfos)) {
            //循环调用 平台获取token接口
            for (ShopifyShopAndTokenInfo shopifyShopAndTokenInfo : shopifyShopAndTokenInfos) {
                applyPlatObtainToken(shopifyShopAndTokenInfo);
                shopifyClient.tokenMap.put(shopifyShopAndTokenInfo.getShopName(), shopifyShopAndTokenInfo);
            }
        }
        //把token更新入库,由于Shopify token 固定所以不进行
    }

    private ShopifyShopAndTokenInfo applyPlatObtainToken(ShopifyShopAndTokenInfo shopifyShopAndTokenInfo) {
        // 拿shopName 调用平台接口 目前 shopify token为固定
        String accessToken = null;
        if ("Shopify_FIT_USA".equals(shopifyShopAndTokenInfo.getShopName())) {
            accessToken = "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";
        }
        shopifyShopAndTokenInfo.setAccessToken(accessToken);
        return shopifyShopAndTokenInfo;
    }

}
