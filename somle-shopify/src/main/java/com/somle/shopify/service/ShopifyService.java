package com.somle.shopify.service;

import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.shopify.dal.InfraConfigMapper;
import com.somle.shopify.dal.ShopifyTokenMapper;
import com.somle.shopify.model.InfraConfig;
import com.somle.shopify.model.ShopifyToken;
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
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

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

    @Resource
    InfraConfigMapper infraConfigMapper;

    @PostConstruct
    public void init() {
        CompletableFuture.runAsync(() -> {
            initClient();
            refreshToken();
        });
    }

    private void initClient() {
        LambdaQueryWrapper<InfraConfig> queryWrapper = new LambdaQueryWrapper<InfraConfig>().eq(InfraConfig::getCategory, "proxy");
        List<InfraConfig> infraConfigs = infraConfigMapper.selectList(queryWrapper);
        Map<String, String> keyMap = infraConfigs.stream().collect(Collectors.toMap(InfraConfig::getConfigKey, InfraConfig::getValue));
        String proxyHost = keyMap.get("proxy.host");
        Integer proxyPort = Integer.parseInt(keyMap.get("proxy.port"));
        String proxyUsername = keyMap.get("proxy.username");
        String proxyPassword = keyMap.get("proxy.password");
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
