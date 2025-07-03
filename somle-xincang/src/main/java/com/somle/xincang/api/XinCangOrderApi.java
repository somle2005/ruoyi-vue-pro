package com.somle.xincang.api;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.xincang.model.req.*;
import com.somle.xincang.model.resp.XinCangOrderListResp;
import okhttp3.OkHttpClient;
import okhttp3.Response;

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
    public void addOrderMultiple(String token, XinCangAddOrderMultipleReq req) {
        String endPoint = "/api.add_order_multiple";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(URL + endPoint + "?token=" + token)
            .payload(req)
            .build();
        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        System.out.println(json);
    }

    //修改订单
    public void updateOrder(String token, XinCangUpdateOrderReq req) {
        String endPoint = "/api.update_order";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(URL + endPoint + "?token=" + token)
            .payload(req)
            .build();
        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        System.out.println(json);
    }

    //拦截订单
    public void interceptOrder(String token, XinCangDoInterceptReq req) {
        String endPoint = "/api.do_intercept_by_ids";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(URL + endPoint + "?token=" + token)
            .payload(req)
            .build();
        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        System.out.println(json);
    }

    //审核订单
    public void approveOrders(String token, String orderNos) {
        String endPoint = "/api.approve_orders";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(URL + endPoint + "?token=" + token)
            .payload(Map.of("orderNos", orderNos))
            .build();
        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        System.out.println(json);
    }
    //删除订单
    public void deleteOrder(String token, XinCangDeleteOrderReq req) {
        String endPoint = "/api.delete_order";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.POST)
            .url(URL + endPoint + "?token=" + token)
            .payload(req)
            .build();

        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        System.out.println(json);
    }
}
