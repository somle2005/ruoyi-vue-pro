package com.somle.manomano.service;

import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.manomano.model.ManomanoShop;
import com.somle.manomano.model.reps.OffersInfoRespVO;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.util.Map;

@Slf4j
public class ManomanoClient {

    private ManomanoShop shop;

    public ManomanoClient(ManomanoShop shop) {
        this.shop = shop;
    }

    private static final String ORDERS_BASE_URL_V1 = "https://partnersapi.manomano.com/orders/v1";

    private static final String BASE_URL_V1 = "https://partnersapi.manomano.com/api/v1";


    public Map<String, String> getHeaders() throws IOException {
        return Map.of(
            "x-api-key", shop.getToken().getAppKey()
        );
    }
    @SneakyThrows
    public JSONObject getOrders() {
        var endpoint = "/orders";
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(ORDERS_BASE_URL_V1 + endpoint)
            .queryParams(
                Map.of(
                    "seller_contract_id", shop.getContractId()
                )
            )
            .headers(getHeaders())
            .build();
        var bodyString = WebUtils.sendRequest(request).body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    public OffersInfoRespVO getOffersInfo() {
        var endpoint = "/offer-information/offers";
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(BASE_URL_V1 + endpoint)
            .queryParams(
                Map.of(
                    "seller_contract_id", shop.getContractId()
                )
            )
            .headers(getHeaders())
            .build();
        var bodyString = WebUtils.sendRequest(request).body().string();
        OffersInfoRespVO offersInfoRespVO = JsonUtilsX.parseObject(bodyString, OffersInfoRespVO.class);
        return offersInfoRespVO;
    }

}