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

    public Map<String, WalmartShopAndTokenInfo> tokenMap = new HashMap();

    private WalmartTokenHead getTokenHeadInfo(String storeName) {
        WalmartTokenHead walmartTokenHead = new WalmartTokenHead();
        WalmartShopAndTokenInfo walmartShopAndTokenInfo = tokenMap.get(storeName);
        if (walmartShopAndTokenInfo == null || !StringUtils.hasText(walmartShopAndTokenInfo.getAccessToken())
            || !StringUtils.hasText(walmartShopAndTokenInfo.getDomain())) {
            throw new RuntimeException("accessToken is null");
        }
        walmartTokenHead.setWalmartShopAndTokenInfo(walmartShopAndTokenInfo);
        Map<String, String> tokenValues = new HashMap<>();
        tokenValues.put("WM_SVC.NAME", walmartShopAndTokenInfo.getSvcName());
        tokenValues.put("WM_QOS.CORRELATION_ID", walmartShopAndTokenInfo.getCorrelationId());
        tokenValues.put("WM_SEC.ACCESS_TOKEN", walmartShopAndTokenInfo.getAccessToken());
        walmartTokenHead.setTokenValues(tokenValues);
        return walmartTokenHead;
    }


    public WalmartAllItemsResVO getAllItems(WalmartGetAllItemsDTO dto) {
        Integer successCode = dto.getSuccessCode();
        WalmartTokenHead walmartTokenHeadInfo = getTokenHeadInfo(dto.getShopName());
        WalmartShopAndTokenInfo walmartShopAndTokenInfo = walmartTokenHeadInfo.getWalmartShopAndTokenInfo();
        Map<String, String> tokenValues = walmartTokenHeadInfo.getTokenValues();
        String endpoint = "/v3/items";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(walmartShopAndTokenInfo.getDomain() + endpoint)
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
        WalmartTokenHead walmartTokenHeadInfo = getTokenHeadInfo(vo.getShopName());
        WalmartShopAndTokenInfo walmartShopAndTokenInfo = walmartTokenHeadInfo.getWalmartShopAndTokenInfo();
        Map<String, String> tokenValues = walmartTokenHeadInfo.getTokenValues();
        String endpoint = "/v3/orders";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(walmartShopAndTokenInfo.getDomain() + endpoint)
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
        WalmartTokenHead walmartTokenHeadInfo = getTokenHeadInfo(shopName);
        WalmartShopAndTokenInfo walmartShopAndTokenInfo = walmartTokenHeadInfo.getWalmartShopAndTokenInfo();
        Map<String, String> tokenValues = walmartTokenHeadInfo.getTokenValues();
        String endpoint = "/v3/report/reconreport/availableReconFiles";
        WalmartGetReconFileReq walmartGetReconFileReq = new WalmartGetReconFileReq();
        walmartGetReconFileReq.setReportVersion("v1");
        walmartGetReconFileReq.setReportDate(dateStr);
        tokenValues.put("Accept", "application/octet-stream");
        RequestX request = RequestX.builder()
            .url(walmartShopAndTokenInfo.getDomain() + endpoint)
            .requestMethod(RequestX.Method.GET)
            .queryParams(walmartGetReconFileReq)
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