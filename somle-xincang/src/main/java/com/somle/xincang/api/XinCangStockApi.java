package com.somle.xincang.api;

import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.xincang.model.req.XingCangStockListReq;
import com.somle.xincang.model.resp.XinCangCustomerWarehousesResp;
import com.somle.xincang.model.resp.XinCangStockListResp;
import okhttp3.OkHttpClient;
import okhttp3.Response;

import java.util.Map;

public class XinCangStockApi {

    private String URL = "https://oms.xincang-tech.com/oms";
    private OkHttpClient client = new OkHttpClient();


    //获取客户所有仓库
    public XinCangCustomerWarehousesResp getCustomerWarehouses(String token) {
        String endpoint = "/api.get_customer_warehouses";
        String url = URL + endpoint + "?token=" + token;
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(url)
            .build();
        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        XinCangCustomerWarehousesResp customerWarehousesResp = JSONUtil.toBean(json, XinCangCustomerWarehousesResp.class);
        return customerWarehousesResp;
    }

    //实时库存
    public XinCangStockListResp getStockList(XingCangStockListReq req) {
        String endPoint = "/api.stocklist";
        RequestX request = RequestX.builder()
            .requestMethod(RequestX.Method.GET)
            .url(URL + endPoint)
            .queryParams(Map.of(
                "token", req.getToken(),
                "warehouse_code", req.getWarehouseCode(),
                "page", req.getPage(),
                "limit", req.getLimit()
            ))
            .build();
        Response response = WebUtils.sendRequest(request);
        String json = WebUtils.getBodyString(response);
        XinCangStockListResp stockListResp = JSONUtil.toBean(json, XinCangStockListResp.class);
        return stockListResp;
    }
}
