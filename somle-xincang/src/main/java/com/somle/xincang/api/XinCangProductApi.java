package com.somle.xincang.api;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.xincang.model.reps.XinCangProductListResp;
import lombok.SneakyThrows;
import okhttp3.OkHttpClient;
import okhttp3.Response;

public class XinCangProductApi {

    private String URL = "https://oms.xincang-tech.com/oms";
    private OkHttpClient client = new OkHttpClient();

    //获取产品列表
    @SneakyThrows
    public XinCangProductListResp getProductList(String token,Integer page) {
        String endpoint = "/api.productlist";
        String url = URL + endpoint + "?token=" + token + "&page=" + page + "&limit=100&state=1";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(url)
            .build();
        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        XinCangProductListResp productListResp = JSONUtil.toBean(json, XinCangProductListResp.class);
        return productListResp;
    }
}
