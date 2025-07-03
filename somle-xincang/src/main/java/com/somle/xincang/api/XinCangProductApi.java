package com.somle.xincang.api;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.xincang.model.resp.XinCangProductListResp;
import com.somle.xincang.model.req.XinCangAddProductReq;
import com.somle.xincang.model.req.XinCangUpdateProductReq;
import lombok.SneakyThrows;
import okhttp3.*;

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

    //新增产品
    @SneakyThrows
    public void addProduct(String token, XinCangAddProductReq  req) {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
            .url("https://oms.xincang-tech.com/oms/api.add_product?token={028A94E6-D486-1D4C-A51A-211A83F0B08E}&product_no=Test230207&chn_name=纸巾&amount=8&bar_code=Test230207&weight_lbs=5&packing_rate=10&size_l_ln=11&size_w_ln=12&size_h_ln=13")
            .method("POST", body)
            .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }

    //更新产品
    @SneakyThrows
    public void updateProduct(String token, XinCangUpdateProductReq req) {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
            .url("https://oms.xincang-tech.com/oms/api.update_product?token={028A94E6-D486-1D4C-A51A-211A83F0B08E}&product_no=574BJ005&chn_name=纸巾&amount=8.8&bar_code=574BJ005&weight_lbs=5.5&packing_rate=10&size_l_ln=11&size_w_ln=12&size_h_ln=13")
            .method("POST", body)
            .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }

    //删除产品
    @SneakyThrows
    public void deleteProduct(String token, String productNo) {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
            .url("https://oms.xincang-tech.com/oms/api.delete_product?token={F86D9356-D303-D5C8-7FAD-4E4B7DA88050}&product_no=TEST230207")
            .method("POST", body)
            .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }
}
