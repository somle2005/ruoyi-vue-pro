package com.somle.shopify.service;

import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.alibaba.fastjson.JSON;
import com.somle.shopify.domain.RetrieveAListOfProductsDto;
import com.somle.shopify.domain.RetrieveAListOfProductsVo;
import com.somle.shopify.domain.ShopAndTokenInfo;
import com.somle.shopify.domain.TokenHead;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

import static cn.iocoder.yudao.framework.common.util.web.WebUtils.sendRequest;

// https://shopify.dev/docs/api/admin-rest/
@Slf4j
@Component
public class ShopifyClient {

    OkHttpClient webClient;

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
        tokenValues.put("X-Shopify-Access-Token", shopAndTokenInfo.getAccessToken());
        tokenHead.setTokenValues(tokenValues);
        return tokenHead;
    }

    public RetrieveAListOfProductsVo retrieveAListOfProducts(RetrieveAListOfProductsDto dto) {
        RetrieveAListOfProductsVo retrieveAListOfProductsVo = null;
        String shopName = dto.getShopName();
        TokenHead tokenHeadInfo = getTokenHeadInfo(shopName);
        String endpoint = "/admin/api/2024-10/products.json";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(tokenHeadInfo.getShopAndTokenInfo().getDomain() + endpoint)
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
            retrieveAListOfProductsVo = JSON.parseObject(responseJson, RetrieveAListOfProductsVo.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return retrieveAListOfProductsVo;
    }


    @SneakyThrows
    public JSONObject getOrders(String shopName) {
        String endpoint = "/admin/api/2024-10/orders.json?status=any";
        TokenHead tokenHeadInfo = getTokenHeadInfo(shopName);
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(tokenHeadInfo.getShopAndTokenInfo().getDomain() + endpoint)
            .headers(tokenHeadInfo.getTokenValues())
            .build();
        String bodyString = sendRequest(request).body().string();
        JSONObject result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    public JSONObject getPayouts(String shopName) {
        var endpoint = "/admin/api/2024-10/shopify_payments/payouts.json";
        TokenHead tokenHeadInfo = getTokenHeadInfo(shopName);
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(tokenHeadInfo.getShopAndTokenInfo().getDomain() + endpoint)
            .headers(tokenHeadInfo.getTokenValues())
            .build();
        var bodyString = sendRequest(request).body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

}
