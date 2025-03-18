package com.somle.shopify.service;


import cn.iocoder.yudao.framework.common.util.web.*;
import com.alibaba.fastjson.JSON;
import com.somle.shopify.domain.*;
import com.somle.shopify.mapper.ShopifyTokenMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.stereotype.Service;

import java.util.*;

// https://shopify.dev/docs/api/admin-rest/
@Slf4j
@Service
public class ShopifyClient {

    @Resource
    private ShopifyTokenMapper shopifyTokenMapper;

    OkHttpClient webClient = new OkHttpClient();

    public HeaderDto getHeaders(String storeName) {
        HeaderDto headers = shopifyTokenMapper.getHeaders(storeName);
        if (headers == null) {
            throw new RuntimeException("accessToken is null");
        }
        return headers;
    }

    public RetrieveAListOfProductsVo retrieveAListOfProducts(RetrieveAListOfProductsDto dto) {
        RetrieveAListOfProductsVo retrieveAListOfProductsVo = null;
        String shopName = dto.getShopName();
        HeaderDto headers = getHeaders(shopName);
        String endpoint = "/admin/api/2024-10/products.json";
        Map<String, String> headerValues = new HashMap<>();
        headerValues.put("X-Shopify-Access-Token", headers.getAccessToken());
        RequestX request = RequestX.builder()
                .requestMethod(RequestX.Method.GET)
                .url(headers.getDomain() + endpoint)
                .headers(headerValues)
                .build();
        Integer successCode = dto.getSuccessCode();
        try {
            Response response = webClient.newCall(WebUtils.toOkHttp(request)).execute();
            String responseJson = response.body().toString();
            if (!successCode.equals(response.code())) {
                throw new RuntimeException(responseJson);
            }
            retrieveAListOfProductsVo = JSON.parseObject(responseJson, RetrieveAListOfProductsVo.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return retrieveAListOfProductsVo;
    }

}
