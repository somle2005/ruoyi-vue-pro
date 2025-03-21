package com.somle.walmart.service;


import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.somle.walmart.dal.WalmartShopAndTokenInfoMapper;
import com.somle.walmart.dal.WalmartTokenMapper;
import com.somle.walmart.model.WalmartAccessTokenRespVO;
import com.somle.walmart.model.WalmartShopAndTokenInfo;
import com.somle.walmart.model.WalmartToken;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;


@Slf4j
@Service
@ConditionalOnProperty(name = "threePartyPlatform.walmart.refreshToken.enable", havingValue = "true")
public class WalmartService {

    @Resource
    private WalmartTokenMapper walmartTokenMapper;

    @Resource
    private WalmartShopAndTokenInfoMapper walmartShopAndTokenInfoMapper;

    @Resource
    private WalmartClient walmartClient;

    @PostConstruct
    public void init() {
        refreshToken();
        CompletableFuture.runAsync(() -> {

        });
    }
    @Scheduled(cron = "${threePartyPlatform.walmart.refreshToken.cron}")
    public void refreshToken() {
        log.info("Walmart refreshToken start");
        //查询所有能认证的店铺
        List<WalmartShopAndTokenInfo> walmartShopAndTokenInfos = walmartShopAndTokenInfoMapper.getShopAndTokenInfo();
        List<WalmartToken> updateWalmartTokens = new ArrayList<>();
        if (!CollectionUtils.isEmpty(walmartShopAndTokenInfos)) {
            //循环调用 平台获取token接口
            for (WalmartShopAndTokenInfo walmartShopAndTokenInfo : walmartShopAndTokenInfos) {
                applyPlatObtainToken(walmartShopAndTokenInfo);
                walmartClient.tokenMap.put(walmartShopAndTokenInfo.getShopName(), walmartShopAndTokenInfo);
                if (StringUtils.hasText(walmartShopAndTokenInfo.getAccessToken())){
                    WalmartToken walmartToken = new WalmartToken();
                    walmartToken.setId(walmartShopAndTokenInfo.getTokenId());
                    walmartToken.setAccessToken(walmartShopAndTokenInfo.getAccessToken());
                    updateWalmartTokens.add(walmartToken);
                }
            }
        }
        //把token更新入库
        if (!CollectionUtils.isEmpty(updateWalmartTokens)){
            walmartTokenMapper.updateById(updateWalmartTokens);
        }
    }

    private WalmartShopAndTokenInfo applyPlatObtainToken(WalmartShopAndTokenInfo walmartShopAndTokenInfo) {
        // 拿shopName 调用平台接口 目前 shopify token为固定
        String accessToken = getAccessToken(walmartShopAndTokenInfo);
        walmartShopAndTokenInfo.setAccessToken(accessToken);
        return walmartShopAndTokenInfo;
    }

    private String getAccessToken(WalmartShopAndTokenInfo walmartShopAndTokenInfo) {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials");
        String endpoint = "/v3/token";

        String str = walmartShopAndTokenInfo.getClientId() + ":" + walmartShopAndTokenInfo.getClientSecret();
        String authorization = "Basic " + Base64.encodeBase64String(str.getBytes());

        Headers headers = new Headers.Builder()
            .add("WM_QOS.CORRELATION_ID", walmartShopAndTokenInfo.getCorrelationId())
            .add("WM_SVC.NAME", walmartShopAndTokenInfo.getSvcName())
            .add("Accept", "application/json")
            .add("Authorization", authorization)
            .build();

        Request request = new Request.Builder()
            .url(walmartShopAndTokenInfo.getDomain() + endpoint)
            .method("POST", body)
            .headers(headers)
            .build();
        Response response = null;
        String accessToken = null;
        try {
            response = client.newCall(request).execute();
            String bodyString = response.body().string();
            WalmartAccessTokenRespVO walmartAccessTokenRespVO = JSON.parseObject(bodyString, WalmartAccessTokenRespVO.class);
            accessToken = walmartAccessTokenRespVO.getAccessToken();
            if (!StringUtils.hasText(accessToken)) {
                throw new RuntimeException(bodyString);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return accessToken;
    }

}