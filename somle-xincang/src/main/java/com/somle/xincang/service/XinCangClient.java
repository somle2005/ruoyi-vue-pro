package com.somle.xincang.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import com.somle.xincang.api.XinCangProductApi;
import com.somle.xincang.model.XinCangAccount;
import com.somle.xincang.model.reps.XinCangProductListResp;
import com.somle.xincang.model.reps.XinCangTokenResp;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.List;

@Data
@Slf4j
public class XinCangClient {

    private OkHttpClient client;
    private XinCangAccount account;
    private XinCangProductApi xinCangProductApi;
    private final String URL = "https://oms.xincang-tech.com/oms";
    public XinCangClient(XinCangAccount account) {
        this.account = account;
        this.xinCangProductApi = new XinCangProductApi();
        this.client = new OkHttpClient();
    }


    @SneakyThrows
    public String getToken() {
        String endPoint = "/api.login";
        Request request = new Request.Builder()
            .url("https://oms.xincang-tech.com/oms/api.login?appkey=" + account.getAppKey() + "&secret=" + account.getSecret())
            .get()
            .build();
        Response response = client.newCall(request).execute();
        String result = response.body().string();
        XinCangTokenResp tokenResp = JSONUtil.toBean(result, XinCangTokenResp.class);
        return tokenResp.getRst().getToken();
    }

    // 获取所有产品
    public List<XinCangProductListResp.Product> getAllProducts() {
        Integer page = 1;
        List<XinCangProductListResp.Product> products = new ArrayList<>();
        while (true) {
            XinCangProductListResp productListResp = xinCangProductApi.getProductList(account.getToken(), page++);
            if (CollUtil.isEmpty(productListResp.getRst().getData())) {
                break;
            }
            products.addAll(productListResp.getRst().getData());
        }
        return products;
    }





}
