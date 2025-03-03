package com.somle.overstock.service;

import cn.hutool.core.util.XmlUtil;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.overstock.model.DataBean;
import lombok.Setter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.w3c.dom.Element;
import java.io.IOException;
import java.util.Map;

@Slf4j
public class OverstockClient {


    //Overstock平台API请求路径
    private final String URL = "https://api.test.supplieroasis.com";

    private final String username = "fitu";

    private final String password = "Overstock2024!";

    @Setter
    private OkHttpClient webClient;

    public OverstockClient() {
        this.webClient = new OkHttpClient();
    }

    public Map<String, String> getHeaders() throws IOException {
        return Map.of(
            "Content-Type", "application/xml",
                "Accept", "application/xml",
            "Authorization", Credentials.basic(username, password)
        );
    }

    @SneakyThrows
    public JSONObject getOrders() {
        var endpoint = "/salesorders" + "?startTime=2017-06-01" + "&endTime=2017-07-13";
        var request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(URL+endpoint)
            .headers(getHeaders())
            .build();
        var bodyString = sendRequest(request).body().string();
        // 将xml转换为java对象
        Element rootElement = XmlUtil.getRootElement(XmlUtil.parseXml(bodyString));
        // 使用根节点下的直接 转成对象
        DataBean dataBean = XmlUtil.xmlToBean(rootElement, DataBean.class);
        // 输出对象数据
        System.out.println(dataBean.getTotalCount());

        return null;
    }

    @SneakyThrows
    private Response sendRequest(RequestX request) {
        // Define the proxy details
        return webClient.newCall(WebUtils.toOkHttp(request)).execute();
    }

}
