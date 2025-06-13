package com.somle.shopify.service;

import cn.hutool.core.util.StrUtil;
import cn.iocoder.yudao.framework.common.util.json.JSONArray;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtils;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.somle.shopify.enums.ShopifyAPI;
import com.somle.shopify.exception.ShopifyApiException;
import com.somle.shopify.model.ShopifyToken;
import com.somle.shopify.model.graphql.*;
import com.somle.shopify.enums.ShopifyGraphqlConst;
import com.somle.shopify.model.reps.ShopifyOrderRepsVO;
import com.somle.shopify.model.reps.ShopifyPayoutRepsVO;
import com.somle.shopify.model.reps.ShopifyShopProductRepsVO;
import com.somle.shopify.model.reps.ShopifyShopRepsVO;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Response;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: LeeFJ
 * @date: 2025/2/14 10:22
 * @description: Shopify 客户端，负责与 Shopify 服务进行交互
 * Shopify 接口文档 <br>
 * https://shopify.dev/docs/api/admin-rest/
 */
@Slf4j
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

    public ShopifyClient(ShopifyToken token) {
        this.token = token;
        this.url = String.format(BASE_URL, token.getSubdomain());
        this.webClient = new OkHttpClient();
    }

    /**
     * 提取 Link Header 中 rel="next" 对应的 page_info 值
     *
     * @param linkHeader Link 头字符串
     * @return page_info 字符串 或 null（如果没有找到）
     */
    public static String extractNextPageInfo(String linkHeader) {
        if (linkHeader == null || linkHeader.isEmpty()) return null;

        // 按逗号分割多个链接，遍历查找 rel="next" 的条目
        return Arrays.stream(linkHeader.split("\\s*,\\s*"))
                .filter(link -> hasRelNext(link))
                .findFirst()
                .map(link -> extractPageInfoFromUrl(link))
                .orElse(null);
    }

    // 检查 Link 条目是否包含 rel="next"（大小写不敏感）
    private static boolean hasRelNext(String linkEntry) {
        return linkEntry.matches("(?i).*rel\\s*=\\s*\"next\".*");
    }

    // 从单个 Link 条目中提取 URL 并解析 page_info
    private static String extractPageInfoFromUrl(String linkEntry) {
        try {
            // 提取 URL（去除尖括号）
            String url = linkEntry.replaceAll("[<>]", "").split(";\\s*rel=", 2)[0];
            URI uri = new URI(url);

            // 解析查询参数为 Map
            Map<String, String> queryParams = Arrays.stream(uri.getQuery().split("&"))
                    .map(param -> param.split("=", 2))
                    .collect(Collectors.toMap(
                            arr -> arr[0],
                            arr -> arr.length > 1 ? arr[1] : "",
                            (existing, replacement) -> existing));

            return queryParams.get("page_info");
        } catch (URISyntaxException | NullPointerException e) {
            return null;
        }
    }

    /**
     * 获得店铺信息
     **/
    public ShopifyShopRepsVO getShop() {
        JSONObject shop = getResult(ShopifyAPI.GET_SHOP, new HashMap<>());
        return JsonUtilsX.parseObject(shop, ShopifyShopRepsVO.class);
    }




    /**
     * 获得订单信息
     **/
    @SneakyThrows
    public List<ShopifyOrderRepsVO> getOrders(String pageInfo, LocalDateTime createdAtMin, LocalDateTime createdAtMax) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("limit", "5");
        if (StrUtil.isNotEmpty(pageInfo)) {
            params.put("page_info", pageInfo);
        } else {
            params.put("status", "any");
            params.put("created_at_min", createdAtMin);
            params.put("created_at_max", createdAtMax);
        }

        var request = RequestX.builder()
                .requestMethod(ShopifyAPI.GET_ORDERS.method())
                .url(url + ShopifyAPI.GET_ORDERS.url())
                .headers(getHeaders())
                .queryParams(params)
                .build();
        Response response = sendRequest(request);
        Headers headers = response.headers();
        String bodyString = response.body().string();
        JSONObject aa = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        JSONArray orderArr = aa.getJSONArray("orders");
        List<ShopifyOrderRepsVO> orders = orderArr.stream().map(o -> {
            ShopifyOrderRepsVO order = JsonUtilsX.parseObject(o, ShopifyOrderRepsVO.class);
            if (headers.get("link") != null) {
                order.setPageInfo(extractNextPageInfo(headers.get("link")));
            }
            return order;
        }).toList();
        return orders;
    }

    /**
     * 获得店铺信息
     **/
    public ShopifyGraphqlShopInfo getShopInfo() {
        try {
            ShopifyGraphqlRequest<ShopifyGraphqlCommonPageQuery> graphqlRequest = new ShopifyGraphqlRequest<>();
            graphqlRequest.setQuery(ShopifyGraphqlConst.SHOP_INFO_QUERY);
            var request = RequestX.builder()
                    .requestMethod(ShopifyAPI.GRAPHQL.method())
                    .url(url + ShopifyAPI.GRAPHQL.url())
                    .headers(getHeaders())
                    .payload(graphqlRequest)
                    .build();
            Response response = sendRequest(request);
            String bodyString = response.body().string();
            TypeReference<ShopifyGraphqlResponse<ShopifyGraphqlShopInfoResult>> typeRef = new TypeReference<>() {
            };
            ShopifyGraphqlResponse<ShopifyGraphqlShopInfoResult> shopifyGraphqlResponse = JsonUtils.parseObject(bodyString, typeRef);
            if (shopifyGraphqlResponse.getErrors() != null) {
                log.error("Shopify shopInfo API error: {}", shopifyGraphqlResponse.getErrors());
                throw new ShopifyApiException("shopInfo Request Failed");
            }
            return shopifyGraphqlResponse.getData().getShop();
        } catch (Exception e) {
            log.error("Shopify shopInfo API error:", e);
            throw new ShopifyApiException("Failed to parse Shopify response", e);
        }
    }


    @SneakyThrows
    public ShopifyGraphqlOrderPageResult orderPageQuery(ShopifyGraphqlCommonPageQuery shopifyGraphqlCommonPageQuery) {
        try {
            log.info("Shopify GraphqlOrder PageQuery: {}", shopifyGraphqlCommonPageQuery);
            ShopifyGraphqlRequest<ShopifyGraphqlCommonPageQuery> graphqlRequest = new ShopifyGraphqlRequest<>();
            graphqlRequest.setQuery(ShopifyGraphqlConst.ORDER_PAGE_QUERY);
            graphqlRequest.setVariables(shopifyGraphqlCommonPageQuery);
            var request = RequestX.builder()
                    .requestMethod(ShopifyAPI.GRAPHQL.method())
                    .url(url + ShopifyAPI.GRAPHQL.url())
                    .headers(getHeaders())
                    .payload(graphqlRequest)
                    .build();
            Response response = sendRequest(request);
            String bodyString = response.body().string();
            TypeReference<ShopifyGraphqlResponse<ShopifyGraphqlOrderPageResult>> typeRef = new TypeReference<>() {
            };
            ShopifyGraphqlResponse<ShopifyGraphqlOrderPageResult> shopifyGraphqlResponse = JsonUtils.parseObject(bodyString, typeRef);
            if (shopifyGraphqlResponse.getErrors() != null) {
                log.error("Shopify orderPageQuery API error: {}", shopifyGraphqlResponse.getErrors());
                throw new ShopifyApiException("OrderPageQuery Request Failed");
            }
            return shopifyGraphqlResponse.getData();
        } catch (Exception e) {
            log.error("Shopify orderPageQuery API error:", e);
            throw new ShopifyApiException("Failed to parse Shopify response", e);
        }
    }

    public ShopifyGraphqlProductPageResult productPageQuery(ShopifyGraphqlCommonPageQuery shopifyGraphqlCommonPageQuery) {
        try {
            log.info("Shopify GraphqlProduct PageQuery: {}", shopifyGraphqlCommonPageQuery);
            ShopifyGraphqlRequest<ShopifyGraphqlCommonPageQuery> graphqlRequest = new ShopifyGraphqlRequest<>();
            graphqlRequest.setQuery(ShopifyGraphqlConst.PRODUCT_PAGE_QUERY);
            graphqlRequest.setVariables(shopifyGraphqlCommonPageQuery);
            var request = RequestX.builder()
                    .requestMethod(ShopifyAPI.GRAPHQL.method())
                    .url(url + ShopifyAPI.GRAPHQL.url())
                    .headers(getHeaders())
                    .payload(graphqlRequest)
                    .build();
            Response response = sendRequest(request);
            String bodyString = response.body().string();
            TypeReference<ShopifyGraphqlResponse<ShopifyGraphqlProductPageResult>> typeRef = new TypeReference<>() {
            };
            ShopifyGraphqlResponse<ShopifyGraphqlProductPageResult> shopifyGraphqlResponse = JsonUtils.parseObject(bodyString, typeRef);
            if (shopifyGraphqlResponse.getErrors() != null) {
                log.error("Shopify productPageQuery API error: {}", shopifyGraphqlResponse.getErrors());
                throw new ShopifyApiException("ProductPageQuery Request Failed");
            }
            return shopifyGraphqlResponse.getData();
        } catch (Exception e) {
            log.error("Shopify productPageQuery API error:", e);
            throw new ShopifyApiException("Failed to parse Shopify response", e);
        }
    }


    @SneakyThrows
    public List<ShopifyOrderRepsVO> getAllOrders(LocalDateTime createdAtMin, LocalDateTime createdAtMax) {
        List<ShopifyOrderRepsVO> orders = new ArrayList<>();
        List<ShopifyOrderRepsVO> pageOrders = getOrders("", createdAtMin, createdAtMax);
        orders.addAll(pageOrders);
        String pageInfo = pageOrders.get(0).getPageInfo();
        while (StrUtil.isNotEmpty(pageInfo)) {
            pageOrders = getOrders(pageInfo, createdAtMin, createdAtMax);
            orders.addAll(pageOrders);
            pageInfo = pageOrders.get(0).getPageInfo();
        }
        return orders;
    }

    /**
     * 获得商品信息
     **/
    @SneakyThrows
    public List<ShopifyShopProductRepsVO> getProducts(Map<String, ?> params) {
        JSONArray productArr = getResult(ShopifyAPI.GET_PRODUCTS, params);
        List<ShopifyShopProductRepsVO> products = new ArrayList<>();
        for (JsonNode productNode : productArr) {
            ShopifyShopProductRepsVO shopifyShopProductRepsVO = JsonUtilsX.parseObject(productNode, ShopifyShopProductRepsVO.class);
            products.add(shopifyShopProductRepsVO);
        }
        return products;
    }

    /**
     * 获得结算信息
     **/
    @SneakyThrows
    public List<ShopifyPayoutRepsVO> getPayouts() {
        JSONArray payoutArr = getResult(ShopifyAPI.GET_PAYOUTS, new HashMap<>());
        List<ShopifyPayoutRepsVO> payouts = payoutArr.stream().map(o -> JsonUtilsX.parseObject(o, ShopifyPayoutRepsVO.class)).toList();
        return payouts;
    }

    /**
     * @return 返回原始报文
     * @Author LeeFJ
     * @Description
     * @Date 8:19 2025/2/8
     * @Param
     **/
    private JSONObject getRawResult(ShopifyAPI api, Map<String, ?> params) {
        Response response = null;
        try {
            var request = RequestX.builder()
                    .requestMethod(api.method())
                    .url(url + api.url())
                    .headers(getHeaders())
                    .queryParams(params)
                    .build();
            response = sendRequest(request);
            var bodyString = response.body().string();
            JSONObject result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
            return result;
        } catch (Throwable t) {
            log.error("{}异常", api.action(), t);
            return null;
        } finally {
            if (response != null) {
                response.code();
            }
        }
    }

    /**
     * @return 返回有效的业务报文
     * @Author LeeFJ
     * @Description
     * @Date 8:19 2025/2/8
     * @Param
     **/
    private <T> T getResult(ShopifyAPI api, Map<String, ?> params) {
        var result = getRawResult(api, params);
        if (result == null) {
            return null;
        }
        return (T) api.getData(result, api.returnType());
    }

    private Map<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put(CONTENT_TYPE, APPLICATION_JSON);
        headers.put(SHOPIFY_ACCESS_TOKEN, token.getAccessToken());
        return headers;
    }

    @SneakyThrows
    private Response sendRequest(RequestX request) {
        // 设置一个链接超时时间，防止报请求超时错误
//        webClient = new OkHttpClient().newBuilder().connectTimeout(30000, TimeUnit.MILLISECONDS).readTimeout(30000, TimeUnit.MILLISECONDS).build();
        return webClient.newCall(WebUtils.toOkHttp(request)).execute();
    }

}
