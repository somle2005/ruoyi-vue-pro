package com.somle.walmart.service;


import cn.hutool.core.collection.CollectionUtil;
import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.somle.walmart.repository.WalmartTokenRepository;
import com.somle.walmart.controller.vo.WalmartAccessTokenRespVO;
import com.somle.walmart.model.WalmartTokenDO;
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
    private WalmartTokenRepository walmartTokenRepository;

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
        LambdaQueryWrapper<WalmartTokenDO> walmartTokenLambdaQueryWrapper = new LambdaQueryWrapper<>();
        walmartTokenLambdaQueryWrapper.eq(WalmartTokenDO::getType, "ORDINARY");
        List<WalmartTokenDO> walmartTokenDOS = walmartTokenRepository.selectList(walmartTokenLambdaQueryWrapper);
        List<WalmartTokenDO> updateWalmartTokenDOS = new ArrayList<>();
        if (!CollectionUtils.isEmpty(walmartTokenDOS)) {
            //循环调用 平台获取token接口
            for (WalmartTokenDO walmartTokenDO : walmartTokenDOS) {
                //调用平台接口获取token
                applyPlatObtainToken(walmartTokenDO);
                //把token信息封装在每个client里
                WalmartClient walmartClient = new WalmartClient();
                assembleClientInformation(walmartTokenDO, walmartClient);
                clientMap.put(walmartTokenDO.getId(), walmartClient);
                //加入更新数组
                if (StringUtils.hasText(walmartTokenDO.getAccessToken())) {
                    WalmartTokenDO walmartTokenDOUpdate = new WalmartTokenDO();
                    walmartTokenDOUpdate.setId(walmartTokenDO.getId());
                    walmartTokenDOUpdate.setAccessToken(walmartTokenDO.getAccessToken());
                    updateWalmartTokenDOS.add(walmartTokenDO);
                }
            }
        }
        //把token更新入库
        if (!CollectionUtils.isEmpty(updateWalmartTokenDOS)) {
            walmartTokenRepository.updateById(updateWalmartTokenDOS);
        }
    }

    public WalmartClient getClient(Long authId) {
        WalmartClient walmartClient = clientMap.get(authId);
        if (walmartClient == null || CollectionUtil.isEmpty(walmartClient.getTokenValues())) {
            throw new RuntimeException("token is null");
        }
        return walmartClient;
    }

    private WalmartTokenDO applyPlatObtainToken(WalmartTokenDO walmartTokenDO) {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials");
        String endpoint = "/v3/token";

        String str = walmartTokenDO.getClientId() + ":" + walmartTokenDO.getClientSecret();
        String authorization = "Basic " + Base64.encodeBase64String(str.getBytes());

        Headers headers = new Headers.Builder()
            .add("WM_QOS.CORRELATION_ID", walmartTokenDO.getCorrelationId())
            .add("WM_SVC.NAME", walmartTokenDO.getSvcName())
            .add("Accept", "application/json")
            .add("Authorization", authorization)
            .build();

        Request request = new Request.Builder()
            .url(walmartTokenDO.getDomain() + endpoint)
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

        walmartTokenDO.setAccessToken(accessToken);
        return walmartTokenDO;
    }

    private void assembleClientInformation(WalmartTokenDO walmartTokenDO, WalmartClient walmartClient) {
        Map<String, String> tokenValues = new HashMap<>();
        tokenValues.put("WM_SVC.NAME", walmartTokenDO.getSvcName());
        tokenValues.put("WM_QOS.CORRELATION_ID", walmartTokenDO.getCorrelationId());
        tokenValues.put("WM_SEC.ACCESS_TOKEN", walmartTokenDO.getAccessToken());
        walmartClient.setTokenValues(tokenValues);
        walmartClient.setWalmartTokenDO(walmartTokenDO);
        walmartClient.setWebClient(defaultClient);
    }

}