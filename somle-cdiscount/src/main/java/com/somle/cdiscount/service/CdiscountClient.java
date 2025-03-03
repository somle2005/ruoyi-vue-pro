package com.somle.cdiscount.service;



import cn.iocoder.yudao.framework.common.util.http.HttpUtils;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import java.io.IOException;
import java.util.Map;

@Slf4j
public class CdiscountClient {

    //Cdiscount平台API请求路径
    private final String URL = "https://api.octopia-io.net/seller/v2";

    private final String TOKEN_URL = "https://auth.octopia-io.net/auth/realms/maas/protocol/openid-connect/token";

   //    此参数拼接方式必须配合header中"Content-Type", "application/x-www-form-urlencoded"方式使用
    private final String TOKEN_REQUEST_BODY = "client_id=gumaomao&client_secret=D6zTxDeCXErst2Kvr7D4AYrJI0ZMiIdP&grant_type=client_credentials";

    @Setter
    private OkHttpClient webClient;

   //卖家ID
    public static final String SELLER_ID = "79730";

    public CdiscountClient() {
        this.webClient = new OkHttpClient();
    }

    public Map<String, String> getHeaders() throws IOException {
        return Map.of(
            "Content-Type", "application/json",
            "sellerId", SELLER_ID,
            "Authorization", "Bearer " + getAccessToken()
        );
    }

    @SneakyThrows
    public JSONObject getOrders() {
        //Cdiscount平台订单查询接口路径
        var endpoint = "/orders";
        var request = RequestX.builder()
                .requestMethod(RequestX.Method.GET)
                .url(URL+endpoint)
                .queryParams(
                        Map.of(
                                "salesChannelId", "CDISFR",
                                "shippingCountry", "Fr"
                        )
                )
                .headers(getHeaders())
                .build();
        var bodyString = sendRequest(request).body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    private Response sendRequest(RequestX request) {
        // Define the proxy details
        return webClient.newCall(WebUtils.toOkHttp(request)).execute();
    }

    public String getAccessToken(){

        String body = HttpUtils.post(TOKEN_URL, Map.of(
                        "Content-Type", "application/x-www-form-urlencoded"
                ), TOKEN_REQUEST_BODY
        );
        JSONObject jsonObject = JsonUtilsX.parseObject(body, JSONObject.class);
        return jsonObject.getString("access_token");
    }

}
