package com.somle.shopify.service;

import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.alibaba.fastjson.JSON;
import com.somle.shopify.controller.vo.ShopifyRetrieveAListOfProductsReqVO;
import com.somle.shopify.controller.vo.ShopifyRetrieveAListOfProductsRespVO;
import com.somle.shopify.model.ShopifyTokenDO;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import static cn.iocoder.yudao.framework.common.util.web.WebUtils.sendRequest;

// https://shopify.dev/docs/api/admin-rest/
@Slf4j
@Data
public class ShopifyClient {

    private OkHttpClient webClient;
    private ShopifyTokenDO shopifyTokenDO;
    private Map<String, String> tokenValues;

    public ShopifyRetrieveAListOfProductsRespVO retrieveAListOfProducts(ShopifyRetrieveAListOfProductsReqVO dto) {
        ShopifyRetrieveAListOfProductsRespVO shopifyRetrieveAListOfProductsRespVo = null;
        String endpoint = "/admin/api/2024-10/products.json";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(shopifyTokenDO.getDomain() + endpoint)
            .queryParams(dto)
            .headers(tokenValues)
            .build();
        Integer successCode = dto.getSuccessCode();
        try {
            Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
            String responseJson = response.body().string();
            if (!successCode.equals(response.code())) {
                throw new RuntimeException(responseJson);
            }
            shopifyRetrieveAListOfProductsRespVo = JSON.parseObject(responseJson, ShopifyRetrieveAListOfProductsRespVO.class);
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
        return shopifyRetrieveAListOfProductsRespVo;
    }


    @SneakyThrows
    public JSONObject getOrders() {
        String endpoint = "/admin/api/2024-10/orders.json?status=any";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(shopifyTokenDO.getDomain() + endpoint)
            .headers(tokenValues)
            .build();
        String bodyString = sendRequest(request).body().string();
        JSONObject result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    public JSONObject getPayouts() {
        var endpoint = "/admin/api/2024-10/shopify_payments/payouts.json";
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(shopifyTokenDO.getDomain() + endpoint)
            .headers(tokenValues)
            .build();
        var bodyString = sendRequest(request).body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

}
