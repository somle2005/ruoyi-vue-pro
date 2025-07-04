package com.somle.xincang.api;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.xincang.model.XinCangCommonResp;
import com.somle.xincang.model.req.XinCangAddProductReq;
import com.somle.xincang.model.req.XinCangUpdateProductReq;
import com.somle.xincang.model.resp.XinCangProductListResp;
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
    public XinCangCommonResp addProduct(String token, XinCangAddProductReq  req) {
        String endpoint = "/api.add_product";

        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
            .url(URL + endpoint +"?token="+ token
                + "&product_no="+ req.getProductNo()
                + "&ahs_dimensions=" + req.getAhsDimensions()
                + "&ahs_weight=" + req.getAhsWeight()
                +"&chn_name=" + req.getChnName()
                + "&amount=" + req.getAmount()
                + "&bar_code=" + req.getBarCode()
                + "&weight_lbs=" + req.getWeightLbs()
                +"&weight_lbs=" + req.getWeightLbs()
                + "&packing_rate=" + req.getPackingRate()
                +"&size_l_ln="+req.getSizeLLn()
                +"&size_w_ln=12"+req.getSizeWLn()
                +"&size_h_ln=" + req.getSizeHLn())
            .method("POST", body)
            .build();
        Response response = client.newCall(request).execute();
        String bodySting = response.body().string();
        XinCangCommonResp xinCangCommonResp = JSONUtil.toBean(bodySting, XinCangCommonResp.class);
        return xinCangCommonResp;
    }

    //更新产品
    @SneakyThrows
    public XinCangCommonResp updateProduct(String token, XinCangUpdateProductReq req) {
        String endpoint = "/api.update_product";

        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
            .url(URL + endpoint +"?token="+ token
                + "&product_no="+ req.getProductNo()
                + "&ahs_dimensions=" + req.getAhsDimensions()
                + "&ahs_weight=" + req.getAhsWeight()
                +"&chn_name=" + req.getChnName()
                + "&amount=" + req.getAmount()
                + "&bar_code=" + req.getBarCode()
                + "&weight_lbs=" + req.getWeightLbs()
                +"&weight_lbs=" + req.getWeightLbs()
                + "&packing_rate=" + req.getPackingRate()
                +"&size_l_ln="+req.getSizeLLn()
                +"&size_w_ln=12"+req.getSizeWLn()
                +"&size_h_ln=" + req.getSizeHLn())
            .method("POST", body)
            .build();
        Response response = client.newCall(request).execute();
        String bodySting = response.body().string();
        XinCangCommonResp xinCangCommonResp = JSONUtil.toBean(bodySting, XinCangCommonResp.class);
        return xinCangCommonResp;
    }

    //删除产品
    @SneakyThrows
    public XinCangCommonResp deleteProduct(String token, String productNo) {
        String endPoint = "api.delete_product";
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create(mediaType, "");
        Request request = new Request.Builder()
            .url(URL + endPoint +"?token="+ token
                + "&product_no="+ productNo)
            .method("POST", body)
            .build();
        Response response = client.newCall(request).execute();
        String bodySting = response.body().string();
        XinCangCommonResp xinCangCommonResp = JSONUtil.toBean(bodySting, XinCangCommonResp.class);
        return xinCangCommonResp;
    }
}
