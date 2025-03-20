package com.somle.shopify.service;


import cn.iocoder.yudao.framework.common.util.collection.CollectionUtils;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.alibaba.fastjson.JSON;
import com.somle.shopify.domain.*;
import com.somle.shopify.mapper.ErpShopMapper;
import com.somle.shopify.mapper.ShopifyTokenMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://shopify.dev/docs/api/admin-rest/
@Slf4j
@Component
public class ShopifyClient {

    @Resource
    private ErpShopMapper erpShopMapper;

    @Resource
    private ShopifyTokenMapper shopifyTokenMapper;

    OkHttpClient webClient = new OkHttpClient();

    Map<String, TokenInfo> tokenMap = new HashMap();

    public void refreshToken() {
        //查询所有能认证的店铺
        List<String> shopNames = erpShopMapper.getShopAndTokenInfo();
        if (!CollectionUtils.isEmpty(shopNames)) {
            //循环调用平台获取token接口
            for (String shopName : shopNames) {
                TokenInfo token = getToken(shopName);

                tokenMap.put(shopName, token);
            }
        }
        List<ShopifyToken> shopifyTokens = shopifyTokenMapper.selectList(null);
       // tokenMap.put()

    }

    private TokenInfo getToken(String shopName) {
        // 拿shopName 调用平台接口 目前 shopify token为固定
        if ("Shopify_FIT_USA".equals(shopName)){

        }
        TokenInfo tokenInfo = new TokenInfo();
        tokenInfo.setAccessToken("");

        return null;

    }


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
            .queryParams(dto)
            .headers(headerValues)
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

}
