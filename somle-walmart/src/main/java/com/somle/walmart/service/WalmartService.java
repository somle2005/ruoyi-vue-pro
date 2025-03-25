package com.somle.walmart.service;


import cn.hutool.core.collection.CollectionUtil;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.walmart.dal.WalmartTokenMapper;
import com.somle.walmart.model.WalmartAccessTokenRespVO;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;


@Slf4j
@Service
@ConditionalOnProperty(name = "threePartyPlatform.walmart.refreshToken.enable", havingValue = "true")
public class WalmartService {

    @Resource
    private WalmartTokenMapper walmartTokenMapper;

    public Map<Long, WalmartClient> clientMap = new HashMap();

    //设置默认的client 指定Walmart超时时间
    public OkHttpClient defaultClient = new OkHttpClient.Builder()
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .build();

    @PostConstruct
    public void init() {
        //启动异步刷新token
        CompletableFuture.runAsync(() -> {
            refreshToken();
        });
    }

    /**
     * 定时刷新token
     */
    @Scheduled(cron = "${threePartyPlatform.walmart.refreshToken.cron}")
    public void refreshToken() {
        log.info("Walmart refreshToken start");
        //查询全部的token账户
        LambdaQueryWrapper<WalmartToken> walmartTokenLambdaQueryWrapper = new LambdaQueryWrapper<>();
        walmartTokenLambdaQueryWrapper.eq(WalmartToken::getType, "ORDINARY");
        List<WalmartToken> walmartTokens = walmartTokenMapper.selectList(walmartTokenLambdaQueryWrapper);
        List<WalmartToken> updateWalmartTokens = new ArrayList<>();
        if (!CollectionUtils.isEmpty(walmartTokens)) {
            //循环调用 平台获取token接口
            for (WalmartToken walmartToken : walmartTokens) {
                //调用平台接口获取token
                applyPlatObtainToken(walmartToken);
                //把token信息封装在每个client里
                WalmartClient walmartClient = new WalmartClient();
                assembleClientInformation(walmartToken, walmartClient);
                clientMap.put(walmartToken.getId(), walmartClient);
                //加入更新数组
                if (StringUtils.hasText(walmartToken.getAccessToken())) {
                    WalmartToken walmartTokenUpdate = new WalmartToken();
                    walmartTokenUpdate.setId(walmartToken.getId());
                    walmartTokenUpdate.setAccessToken(walmartToken.getAccessToken());
                    updateWalmartTokens.add(walmartToken);
                }
            }
        }
        //把token更新入库
        if (!CollectionUtils.isEmpty(updateWalmartTokens)) {
            walmartTokenMapper.updateById(updateWalmartTokens);
        }
    }

    public WalmartClient getClient(Long authId) {
        WalmartClient walmartClient = clientMap.get(authId);
        if (walmartClient == null || CollectionUtil.isEmpty(walmartClient.getTokenValues())) {
            throw new RuntimeException("token is null");
        }
        return walmartClient;
    }

    private WalmartToken applyPlatObtainToken(WalmartToken walmartToken) {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials");
        String endpoint = "/v3/token";

        String str = walmartToken.getClientId() + ":" + walmartToken.getClientSecret();
        String authorization = "Basic " + Base64.encodeBase64String(str.getBytes());

        Headers headers = new Headers.Builder()
            .add("WM_QOS.CORRELATION_ID", walmartToken.getCorrelationId())
            .add("WM_SVC.NAME", walmartToken.getSvcName())
            .add("Accept", "application/json")
            .add("Authorization", authorization)
            .build();

        Request request = new Request.Builder()
            .url(walmartToken.getDomain() + endpoint)
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

        walmartToken.setAccessToken(accessToken);
        return walmartToken;
    }

    private void assembleClientInformation(WalmartToken walmartToken, WalmartClient walmartClient) {
        Map<String, String> tokenValues = new HashMap<>();
        tokenValues.put("WM_SVC.NAME", walmartToken.getSvcName());
        tokenValues.put("WM_QOS.CORRELATION_ID", walmartToken.getCorrelationId());
        tokenValues.put("WM_SEC.ACCESS_TOKEN", walmartToken.getAccessToken());
        walmartClient.setTokenValues(tokenValues);
        walmartClient.setWalmartToken(walmartToken);
        walmartClient.setWebClient(defaultClient);
    }

}