package com.somle.xincang.api;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.xincang.model.XinCangCommonResp;
import com.somle.xincang.model.req.*;
import com.somle.xincang.model.resp.XinCangOrderListResp;
import lombok.SneakyThrows;
import okhttp3.*;

import java.util.Map;

public class XinCangOrderApi {

    private String URL = "https://oms.xincang-tech.com/oms";
    private OkHttpClient client = new OkHttpClient();


    //获取订单列表
    public XinCangOrderListResp getOrderList(XinCangOrderListReq req) {
        String endPoint = "/api.orderlist";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(URL + endPoint)
            .queryParams(Map.of(
                "token", req.getToken(),
                "page", req.getPage(),
                "limit", req.getLimit()
            ))
            .build();
        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        XinCangOrderListResp orderListResp = JSONUtil.toBean(json, XinCangOrderListResp.class);
        return orderListResp;
    }

    //新增一票多件
    @SneakyThrows
    public XinCangCommonResp addOrderMultiple(String token, XinCangAddOrderMultipleReq req) {
        String endPoint = "/api.add_order_multiple";

        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
            .addFormDataPart("order_type",req.getOrderType())
            .addFormDataPart("warehouse_code",req.getWarehouseCode())
            .addFormDataPart("products",req.getProducts())
            .addFormDataPart("ckh",req.getCkh())
            .addFormDataPart("country",req.getCountry())
            .addFormDataPart("province",req.getProvince())
            .addFormDataPart("city",req.getCity())
            .addFormDataPart("address",req.getAddress())
            .addFormDataPart("logistics_type",req.getLogisticsType())
            .addFormDataPart("postcode",req.getPostcode())
            .addFormDataPart("receive_user",req.getReceiveUser())
            .addFormDataPart("phone",req.getPhone())
            .addFormDataPart("is_sign",req.getIsSign())
            .build();
        Request request = new Request.Builder()
            .url(URL + endPoint + "?token=" + token)
            .method("POST", body)
            .build();
        Response response = client.newCall(request).execute();
        String bodySting = response.body().string();
        XinCangCommonResp xinCangCommonResp = JSONUtil.toBean(bodySting, XinCangCommonResp.class);
        return xinCangCommonResp;
    }

    //修改订单
    @SneakyThrows
    public XinCangCommonResp updateOrder(String token, XinCangUpdateOrderReq req) {
        String endPoint = "/api.update_order";
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
            .addFormDataPart("order_no",req.getOrderNo())
            .addFormDataPart("order_type",req.getOrderType())
            .addFormDataPart("warehouse_code",req.getWarehouseCode())
            .addFormDataPart("product_sku",req.getProductSku())
            .addFormDataPart("sku_count",req.getSkuCount())
            .addFormDataPart("ckh",req.getCkh())
            .addFormDataPart("country",req.getCountry())
            .addFormDataPart("province",req.getProvince())
            .addFormDataPart("city",req.getCity())
            .addFormDataPart("address",req.getAddress())
            .addFormDataPart("logistics_type",req.getLogisticsType())
            .addFormDataPart("postcode",req.getPostcode())
            .addFormDataPart("receive_user",req.getReceiveUser())
            .addFormDataPart("phone",req.getPhone())
            .addFormDataPart("is_sign",req.getIsSign())
            .build();
        Request request = new Request.Builder()
            .url(URL + endPoint + "?token=" + token)
            .method("POST", body)
            .build();
        Response response = client.newCall(request).execute();
        String bodySting = response.body().string();
        XinCangCommonResp xinCangCommonResp = JSONUtil.toBean(bodySting, XinCangCommonResp.class);
        return xinCangCommonResp;
    }

    //拦截订单
    @SneakyThrows
    public XinCangCommonResp interceptOrder(String token, XinCangDoInterceptReq req) {
        String endPoint = "/api.do_intercept_by_ids";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(URL + endPoint + "?token=" + token + "&order_nos=" + req.getOrdernos())
            .build();
        Response response = WebUtils.sendRequest(request);
        String bodySting = response.body().string();
        XinCangCommonResp xinCangCommonResp = JSONUtil.toBean(bodySting, XinCangCommonResp.class);
        return xinCangCommonResp;
    }

    //审核订单
    @SneakyThrows
    public XinCangCommonResp approveOrders(String token, String orderNos) {
        String endPoint = "/api.approve_orders";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(URL + endPoint + "?token=" + token + "&order_nos=" + orderNos)
            .build();
        Response response = WebUtils.sendRequest(request);
        String bodySting = response.body().string();
        XinCangCommonResp xinCangCommonResp = JSONUtil.toBean(bodySting, XinCangCommonResp.class);
        return xinCangCommonResp;
    }

    //删除订单
    @SneakyThrows
    public XinCangCommonResp deleteOrder(String token, XinCangDeleteOrderReq req) {
        String endPoint = "/api.delete_order";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(URL + endPoint + "?token=" + token+ "&order_no=" + req.getOrderNo())
            .payload(req)
            .build();

        Response response = WebUtils.sendRequest(request);
        String bodySting = response.body().string();
        XinCangCommonResp xinCangCommonResp = JSONUtil.toBean(bodySting, XinCangCommonResp.class);
        return xinCangCommonResp;
    }
}
