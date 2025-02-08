package com.somle.shopify.service;


import com.somle.framework.common.util.collection.CollectionUtils;
import com.somle.framework.common.util.json.JSONArray;
import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.common.util.json.JsonUtils;
import com.somle.framework.common.util.web.RequestX;
import com.somle.framework.common.util.web.WebUtils;
import com.somle.framework.domain.sales.SalesPlatform;
import com.somle.framework.domain.shop.ShopProfileClient;
import com.somle.shopify.model.ShopifyToken;
import com.somle.shopify.repository.ShopifyTokenRepository;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
  *  Shopify 接口文档 <br>
  *  https://shopify.dev/docs/api/admin-rest/
  **/

@Slf4j
@Component
public class ShopifyShopProfileClient extends ShopProfileClient {

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

    public ShopifyShopProfileClient() {
        super(SalesPlatform.SHOPIFY);
    }


    /**
     * 获得店铺信息
     **/
    public JSONObject getShop() {
        return getResult(ShopifyAPI.GET_SHOP);
    }

    /**
     * 获得订单信息
     **/
    public JSONArray getOrders() {
        return getResult(ShopifyAPI.GET_ORDERS);
    }

    /**
     * 获得原始订单信息
     **/
    public JSONObject getRawOrders() {
        return getRawResult(ShopifyAPI.GET_ORDERS);
    }
    /**
     * 获得商品信息
     **/
    public JSONArray getProducts() {
        return getResult(ShopifyAPI.GET_PRODUCTS);
    }




    /**
     * 获得结算信息
     **/
    public JSONArray getPayouts() {
        return getResult(ShopifyAPI.GET_PAYOUTS);
    }

    /**
     * 获得原始结算信息
     **/
    public JSONObject getRawPayouts() {
        return getRawResult(ShopifyAPI.GET_PAYOUTS);
    }



    /**
    * @Author LeeFJ
    * @Description
    * @Date 8:19 2025/2/8
    * @Param
    * @return  返回原始报文
    **/
    private JSONObject getRawResult(ShopifyAPI api) {
        try {
            initialize();
            var request = RequestX.builder()
                .requestMethod(api.method())
                .url(url+api.url())
                .headers(getHeaders())
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
    private <T> T getResult(ShopifyAPI api) {
        var result = getRawResult(api);
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


/**
* @Description Shopify 接口定义
**/

enum ShopifyAPI {

    GET_SHOP("获取 Shopify 店铺信息","/admin/api/2021-07/shop.json",RequestX.Method.GET,"shop",JSONObject.class),
    GET_ORDERS("获取 Shopify 订单信息","/admin/api/2024-10/orders.json?status=any",RequestX.Method.GET,"orders",JSONArray.class),
    GET_PRODUCTS("获取 Shopify 商品信息","/admin/api/2024-10/products.json",RequestX.Method.GET,"products",JSONArray.class),
    GET_PAYOUTS("获取 Shopify 结算信息","/admin/api/2024-10/shopify_payments/payouts.json",RequestX.Method.GET,"payouts",JSONArray.class)
    ;

    private String action;
    private String url;
    private RequestX.Method method;
    private String jsonField;
    private Class returnType;

    ShopifyAPI(String action, String url, RequestX.Method method, String jsonField, Class returnType) {
        this.action = action;
        this.url = url;
        this.method = method;
        this.jsonField = jsonField;
        this.returnType = returnType;
    }

    public String action() {
        return action;
    }

    public String url() {
        return url;
    }

    public String jsonField() {
        return jsonField;
    }

    public RequestX.Method method() {
        return method;
    }

    public Class returnType() {
        return returnType;
    }

    /**
    * @Description 获取从报文获得有效数据
    **/
    public <T> T getData(JSONObject result,Class<T> type) {
        if (result == null) {
            return null;
        }
        if(JSONObject.class.isAssignableFrom(type)) {
            return (T)result.getJSONObject(this.jsonField());
        } else if (JSONArray.class.isAssignableFrom(type)) {
            return (T)result.getJSONArray(this.jsonField());
        } else {
            return null;
        }

    }

}
