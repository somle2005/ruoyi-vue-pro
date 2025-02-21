package com.somle.shopify.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.somle.framework.common.util.collection.CollectionUtils;
import com.somle.framework.common.util.json.JSONArray;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.shopify.enums.ShopifyAPI;
import com.somle.shopify.model.ShopifyToken;
import com.somle.shopify.repository.ShopifyTokenRepository;
import lombok.Setter;
import lombok.SneakyThrows;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.assertj.core.util.Maps;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *  Shopify 接口文档 <br>
 *  https://shopify.dev/docs/api/admin-rest/
 **/


/**
 * @author: LeeFJ
 * @date: 2025/2/14 10:22
 * @description: Shopify 客户端，负责与 Shopify 服务进行交互
 */
@Slf4j
@Component
public class ShopifyClient {


    // Header
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String SHOPIFY_ACCESS_TOKEN = "X-Shopify-Access-Token";
    // API
    public static final String BASE_URL = "https://%s.myshopify.com";

    private ShopifyToken token;

    private String url;

    @Setter
    private OkHttpClient webClient;

    @Autowired
    ShopifyTokenRepository tokenRepository;

    /**
     * 获得店铺信息
     **/
    public List<JSONObject> getShops() {
        JSONObject shop=getResult(ShopifyAPI.GET_SHOP, new HashMap<>());
        List<JSONObject> shops = new ArrayList<>();
        shops.add(shop);
        return shops;
    }

    public Integer getProductCount() {
        JSONObject result=getRawResult(ShopifyAPI.GET_PRODUCT_COUNT, new HashMap<>());
        return result.getInteger(ShopifyAPI.GET_PRODUCT_COUNT.jsonField());
    }

    /**
     * 获得订单信息
     **/
    public JSONArray getOrders(Map<String,?> params) {
        return getResult(ShopifyAPI.GET_ORDERS,params);
    }

    /**
     * 获得原始订单信息
     **/
    public JSONObject getRawOrders(Map<String,?> params) {
        return getRawResult(ShopifyAPI.GET_ORDERS,params);
    }

    /**
     * 获得商品信息
     **/
    public List<JSONObject> getProducts(Map<String,?> params) {
        JSONArray productArr = getResult(ShopifyAPI.GET_PRODUCTS,params);
        List<JSONObject> products = new ArrayList<>();
        for (JsonNode productNode : productArr) {
            JSONObject productJson = new JSONObject(productNode);
            products.add(productJson);
        }
        return products;
    }

    /**
     * 获得原始商品信息
     **/
    public JSONObject getRawProducts(Map<String,?> params) {
        return getRawResult(ShopifyAPI.GET_PRODUCTS,params);
    }


    /**
     * 获得结算信息
     **/
    public JSONArray getPayouts(Map<String,?> params) {
        return getResult(ShopifyAPI.GET_PAYOUTS,params);
    }

    /**
     * 获得原始结算信息
     **/
    public JSONObject getRawPayouts(Map<String,?> params) {
        return getRawResult(ShopifyAPI.GET_PAYOUTS,params);
    }



    /**
     * @Author LeeFJ
     * @Description
     * @Date 8:19 2025/2/8
     * @Param
     * @return  返回原始报文
     **/
    private JSONObject getRawResult(ShopifyAPI api,Map<String,?> params) {
        try {
            initialize();
            var request = RequestX.builder()
                .requestMethod(api.method())
                .url(url+api.url())
                .headers(getHeaders())
                .queryParams(params)
                .build();
            var response = sendRequest(request);
            var bodyString = response.body().string();
            return JsonUtils.parseObject(bodyString, JSONObject.class);
        } catch (Throwable t) {
            log.error("{}异常", api.action(), t);
            return null;
        }
    }

    /**
     * @Author LeeFJ
     * @Description
     * @Date 8:19 2025/2/8
     * @Param
     * @return  返回有效的业务报文
     **/
    private <T> T getResult(ShopifyAPI api, Map<String,?> params) {
        var result = getRawResult(api,params);
        if(result==null) {
            return null;
        }
        return (T) api.getData(result, api.returnType());
    }

    private Map<String, String> getHeaders() {
        return Map.of(
            CONTENT_TYPE, APPLICATION_JSON,
            SHOPIFY_ACCESS_TOKEN, token.getAccessToken()
        );
    }

    @SneakyThrows
    private Response sendRequest(RequestX request) {
        // Define the proxy details
        return webClient.newCall(WebUtils.toOkHttp(request)).execute();
    }

    private void initialize() {


        if(this.webClient!=null && this.token!=null) {
            return;
        }

        this.webClient = new OkHttpClient();
        List<ShopifyToken> tokenList = tokenRepository.findAll();
        if(CollectionUtils.isEmpty(tokenList)) {
            throw new RuntimeException("缺少 Shopify Token 配置");
        }

        this.token = tokenList.get(0);
        this.url = String.format(BASE_URL, token.getSubdomain());

    }

}
