package com.somle.shopify.service;


import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.common.util.json.JsonUtils;
import com.somle.framework.common.util.web.RequestX;
import com.somle.framework.common.util.web.WebUtils;
import com.somle.shopify.model.ShopifyToken;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;

import java.util.Map;

/**
  *  Shopify 接口文档 <br>
  *  https://shopify.dev/docs/api/admin-rest/
  **/
@Slf4j
public class ShopifyClient {

    // Header
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
    public static final String SHOPIFY_ACCESS_TOKEN = "X-Shopify-Access-Token";
    // API
    public static final String BASE_URL = "https://%s.myshopify.com";
    public static final String SHOP_API = "/admin/api/2021-07/shop.json";
    public static final String ORDER_API = "/admin/api/2024-10/orders.json?status=any";
    public static final String PRODUCTS_API = "/admin/api/2024-10/products.json";
    public static final String PAYOUTS_API = "/admin/api/2024-10/shopify_payments/payouts.json";
    // KEYS
    public static final String KEY_SHOP = "shop";
    public static final String KEY_PRODUCTS = "products";
    public static final String KEY_ORDERS = "orders";
    public static final String KEY_PAYOUTS = "payouts";

    private final ShopifyToken token;

    private final String url;

    @Setter
    private OkHttpClient webClient;

    public ShopifyClient(ShopifyToken token) {
        this.token = token;
        this.url = String.format(BASE_URL, token.getSubdomain());
        this.webClient = new OkHttpClient();
    }


    /**
     * 获得店铺信息
     **/
    public JSONObject getShop() {
        JSONObject shop=getResult(SHOP_API,RequestX.Method.GET,"获取 Shopify 店铺信息");
        if (shop == null) {
            return null;
        }
        shop = shop.getJSONObject(KEY_SHOP);
        return shop;
    }


    /**
     * 获得订单信息
     **/
    public JSONArray getOrders() {
        JSONObject result=getResult(ORDER_API,RequestX.Method.GET,"获取 Shopify 订单信息");
        if (result == null) {
            return null;
        }
        return result.getJSONArray(KEY_ORDERS);
    }


    /**
     * 获得商品信息
     **/
    public JSONArray getProducts() {
        JSONObject result=getResult(PRODUCTS_API,RequestX.Method.GET,"获取 Shopify 商品信息");
        if (result == null) {
            return null;
        }
        return result.getJSONArray(KEY_PRODUCTS);
    }


    /**
     * 获得结算信息
     **/
    public JSONArray getPayouts() {
        JSONObject result=getResult(PAYOUTS_API,RequestX.Method.GET,"获取 Shopify 结算信息");
        if (result == null) {
            return null;
        }
        return result.getJSONArray(KEY_PAYOUTS);
    }


    private JSONObject getResult(String api, RequestX.Method method, String msg) {
        try {
            var request = RequestX.builder()
                .requestMethod(method)
                .url(url+api)
                .headers(getHeaders())
                .build();
            var response = sendRequest(request);
            var bodyString = response.body().string();
            var result = JsonUtils.parseObject(bodyString, JSONObject.class);
            return result;
        } catch (Throwable t) {
            log.error("{}异常", msg, t);
            return null;
        }
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




}
