package com.somle.shopify.service;

import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.alibaba.fastjson.JSON;
import com.somle.shopify.model.ShopifyRetrieveAListOfProductsDTO;
import com.somle.shopify.model.ShopifyRetrieveAListOfProductsVO;
import com.somle.shopify.model.ShopifyShopAndTokenInfo;
import com.somle.shopify.model.ShopifyTokenHead;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static cn.iocoder.yudao.framework.common.util.web.WebUtils.sendRequest;

// https://shopify.dev/docs/api/admin-rest/
@Slf4j
@Component
public class ShopifyClient {

    OkHttpClient webClient;

    public Map<String, ShopifyShopAndTokenInfo> tokenMap = new HashMap();

    private ShopifyTokenHead getTokenHeadInfo(String storeName) {
        ShopifyTokenHead tokenHead = new ShopifyTokenHead();
        ShopifyShopAndTokenInfo shopifyShopAndTokenInfo = tokenMap.get(storeName);
        if (shopifyShopAndTokenInfo == null || !StringUtils.hasText(shopifyShopAndTokenInfo.getAccessToken())
            || !StringUtils.hasText(shopifyShopAndTokenInfo.getDomain())) {
            throw new RuntimeException("accessToken is null");
        }
        tokenHead.setShopifyShopAndTokenInfo(shopifyShopAndTokenInfo);
        Map<String, String> tokenValues = new HashMap<>();
        tokenValues.put("X-Shopify-Access-Token", shopifyShopAndTokenInfo.getAccessToken());
        tokenHead.setTokenValues(tokenValues);
        return tokenHead;
    }

    public ShopifyRetrieveAListOfProductsVO retrieveAListOfProducts(ShopifyRetrieveAListOfProductsDTO dto) {
        ShopifyRetrieveAListOfProductsVO shopifyRetrieveAListOfProductsVo = null;
        String shopName = dto.getShopName();
        ShopifyTokenHead tokenHeadInfo = getTokenHeadInfo(shopName);
        String endpoint = "/admin/api/2024-10/products.json";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(tokenHeadInfo.getShopifyShopAndTokenInfo().getDomain() + endpoint)
            .queryParams(dto)
            .headers(tokenHeadInfo.getTokenValues())
            .build();
        Integer successCode = dto.getSuccessCode();
        try {
            Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
            String responseJson = response.body().string();
            if (!successCode.equals(response.code())) {
                throw new RuntimeException(responseJson);
            }
            shopifyRetrieveAListOfProductsVo = JSON.parseObject(responseJson, ShopifyRetrieveAListOfProductsVO.class);
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
        return shopifyRetrieveAListOfProductsVo;
    }


    @SneakyThrows
    public JSONObject getOrders(String shopName) {
        String endpoint = "/admin/api/2024-10/orders.json?status=any";
        ShopifyTokenHead tokenHeadInfo = getTokenHeadInfo(shopName);
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(tokenHeadInfo.getShopifyShopAndTokenInfo().getDomain() + endpoint)
            .headers(tokenHeadInfo.getTokenValues())
            .build();
        String bodyString = sendRequest(request).body().string();
        JSONObject result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    public JSONObject getPayouts(String shopName) {
        var endpoint = "/admin/api/2024-10/shopify_payments/payouts.json";
        ShopifyTokenHead tokenHeadInfo = getTokenHeadInfo(shopName);
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(tokenHeadInfo.getShopifyShopAndTokenInfo().getDomain() + endpoint)
            .headers(tokenHeadInfo.getTokenValues())
            .build();
        var bodyString = sendRequest(request).body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

}
