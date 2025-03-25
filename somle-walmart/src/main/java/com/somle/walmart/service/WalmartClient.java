package com.somle.walmart.service;

import cn.iocoder.yudao.framework.common.util.custom.MyCollectionUtil;
import cn.iocoder.yudao.framework.common.util.io.IoUtils;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtils;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.alibaba.fastjson.JSON;
import com.somle.walmart.model.*;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Slf4j
@Data
public class WalmartClient {

    private OkHttpClient webClient;
    private WalmartTokenDO walmartTokenDO;
    private Map<String, String> tokenValues;

    public WalmartAllItemsResVO getAllItems(WalmartGetAllItemsDTO dto) {
        Integer successCode = dto.getSuccessCode();
        tokenValues.put("Accept", "application/json");
        String endpoint = "/v3/items";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(walmartTokenDO.getDomain() + endpoint)
            .queryParams(dto)
            .headers(tokenValues)
            .build();
        WalmartAllItemsResVO walmartAllItemsResVO = null;
        try {
            Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
            String responseJson = response.body().string();
            if (!successCode.equals(response.code())) {
                String reqBody = JSON.toJSONString(dto);
                throw new RuntimeException("请求参数" + reqBody + "错误响应" + responseJson);
            }
            walmartAllItemsResVO = JSON.parseObject(responseJson, WalmartAllItemsResVO.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Long sleepTime = dto.getSleepTime();
        if (sleepTime != null) {
            //防止限流
            try {
                TimeUnit.MILLISECONDS.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return walmartAllItemsResVO;
    }

    public WalmartSearchResVO searchItem(WalmartSearchDTO dto) {
        WalmartSearchResVO walmartSearchResVO = new WalmartSearchResVO();
        List<WalmartSearchResVO.ItemsDTO> itemsDTOS = new ArrayList<>();
        String gtins = dto.getGtin();
        List<String> gtinList = Arrays.asList(gtins.split(","));
        List<List<String>> gtinPartition = MyCollectionUtil.splitList(gtinList, 50);
        Integer successCode = dto.getSuccessCode();
        tokenValues.put("Accept", "application/json");
        String endpoint = "/v3/items/walmart/search";
        for (List<String> eachGtinPartition : gtinPartition) {
            dto.setGtin(String.join(",", eachGtinPartition));
            RequestX request = RequestX.builder()
                .requestMethod(RequestX.Method.GET)
                .url(walmartTokenDO.getDomain() + endpoint)
                .queryParams(dto)
                .headers(tokenValues)
                .build();
            WalmartSearchResVO walmartAllItemsResVO = null;
            try {
                Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
                String responseJson = response.body().string();
                if (!successCode.equals(response.code())) {
                    String reqBody = JSON.toJSONString(dto);
                    throw new RuntimeException("请求参数" + reqBody + "错误响应" + responseJson);
                }
                walmartAllItemsResVO = JSON.parseObject(responseJson, WalmartSearchResVO.class);
            } catch (Exception e) {
                log.error("请求错误", e);
                throw new RuntimeException(e);
            }
            List<WalmartSearchResVO.ItemsDTO> items = walmartAllItemsResVO.getItems();
            if (!CollectionUtils.isEmpty(items)) {
                itemsDTOS.addAll(items);
            }
        }
        walmartSearchResVO.setItems(itemsDTOS);
        Long sleepTime = dto.getSleepTime();
        if (sleepTime != null) {
            //防止限流
            try {
                TimeUnit.MILLISECONDS.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return walmartSearchResVO;
    }

    @SneakyThrows
    public JSONObject getOrders(WalmartOrderReqVO vo) {
        String endpoint = "/v3/orders";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(walmartTokenDO.getDomain() + endpoint)
            .headers(tokenValues)
            .build();
        Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
        var bodyString = response.body().string();
        var result = JsonUtils.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    public String getReconFile(LocalDate date) {
        String dateStr = date.format(DateTimeFormatter.ofPattern("MMddyyyy"));
        String endpoint = "/v3/report/reconreport/availableReconFiles";
        WalmartGetReconFileReq walmartGetReconFileReq = new WalmartGetReconFileReq();
        walmartGetReconFileReq.setReportVersion("v1");
        walmartGetReconFileReq.setReportDate(dateStr);
        tokenValues.put("Accept", "application/octet-stream");
        RequestX request = RequestX.builder()
            .url(walmartTokenDO.getDomain() + endpoint)
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