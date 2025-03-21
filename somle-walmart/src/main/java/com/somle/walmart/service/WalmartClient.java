package com.somle.walmart.service;

import cn.iocoder.yudao.framework.common.util.io.IoUtils;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtils;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.alibaba.fastjson.JSON;
import com.somle.walmart.domain.*;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Slf4j
@Component
public class WalmartClient {

    OkHttpClient webClient = new OkHttpClient();

    public Map<String, ShopAndTokenInfo> tokenMap = new HashMap();

    private TokenHead getTokenHeadInfo(String storeName) {
        TokenHead tokenHead = new TokenHead();
        ShopAndTokenInfo shopAndTokenInfo = tokenMap.get(storeName);
        if (shopAndTokenInfo == null || !StringUtils.hasText(shopAndTokenInfo.getAccessToken())
            || !StringUtils.hasText(shopAndTokenInfo.getDomain())) {
            throw new RuntimeException("accessToken is null");
        }
        tokenHead.setShopAndTokenInfo(shopAndTokenInfo);
        Map<String, String> tokenValues = new HashMap<>();
        tokenValues.put("WM_SVC.NAME", shopAndTokenInfo.getSvcName());
        tokenValues.put("WM_QOS.CORRELATION_ID", shopAndTokenInfo.getCorrelationId());
        tokenValues.put("WM_SEC.ACCESS_TOKEN", shopAndTokenInfo.getAccessToken());
        tokenHead.setTokenValues(tokenValues);
        return tokenHead;
    }


    public WalmartAllItemsResVO getAllItems(GetAllItemsDto dto) {
        Integer successCode = dto.getSuccessCode();
        TokenHead tokenHeadInfo = getTokenHeadInfo(dto.getShopName());
        ShopAndTokenInfo shopAndTokenInfo = tokenHeadInfo.getShopAndTokenInfo();
        Map<String, String> tokenValues = tokenHeadInfo.getTokenValues();
        String endpoint = "/v3/items";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(shopAndTokenInfo.getDomain() + endpoint)
            .queryParams(dto)
            .headers(tokenValues)
            .build();
        WalmartAllItemsResVO walmartAllItemsResVO = null;
        try {
            Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
            String responseJson = response.body().string();
            if (!successCode.equals(response.code())) {
                throw new RuntimeException(responseJson);
            }
            walmartAllItemsResVO = JSON.parseObject(responseJson, WalmartAllItemsResVO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return walmartAllItemsResVO;
    }

    @SneakyThrows
    public JSONObject getOrders(WalmartOrderReqVO vo) {
        TokenHead tokenHeadInfo = getTokenHeadInfo(vo.getShopName());
        ShopAndTokenInfo shopAndTokenInfo = tokenHeadInfo.getShopAndTokenInfo();
        Map<String, String> tokenValues = tokenHeadInfo.getTokenValues();
        String endpoint = "/v3/orders";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(shopAndTokenInfo.getDomain() + endpoint)
            .headers(tokenValues)
            .build();
        Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
        var bodyString = response.body().string();
        var result = JsonUtils.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    public String getReconFile(LocalDate date, String shopName) {
        String dateStr = date.format(DateTimeFormatter.ofPattern("MMddyyyy"));
        TokenHead tokenHeadInfo = getTokenHeadInfo(shopName);
        ShopAndTokenInfo shopAndTokenInfo = tokenHeadInfo.getShopAndTokenInfo();
        Map<String, String> tokenValues = tokenHeadInfo.getTokenValues();
        String endpoint = "/v3/report/reconreport/availableReconFiles";
        GetReconFileReq getReconFileReq = new GetReconFileReq();
        getReconFileReq.setReportVersion("v1");
        getReconFileReq.setReportDate(dateStr);
        tokenValues.put("Accept", "application/octet-stream");
        RequestX request = RequestX.builder()
            .url(shopAndTokenInfo.getDomain() + endpoint)
            .requestMethod(RequestX.Method.GET)
            .queryParams(getReconFileReq)
            .headers(tokenValues)
            .build();
        Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }
        InputStream inputStream = response.body().byteStream();
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry entry;
        String result = null;
        while ((entry = zipInputStream.getNextEntry()) != null) {
            if (!entry.isDirectory() && entry.getName().endsWith(".csv")) {
                result = IoUtils.readUtf8(zipInputStream, false);
            }
            zipInputStream.closeEntry();
        }
        return result;
    }

}