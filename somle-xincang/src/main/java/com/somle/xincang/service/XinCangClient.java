package com.somle.xincang.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import com.somle.xincang.api.XinCangOrderApi;
import com.somle.xincang.api.XinCangProductApi;
import com.somle.xincang.api.XinCangStockApi;
import com.somle.xincang.model.XinCangAccount;
import com.somle.xincang.model.XinCangCommonResp;
import com.somle.xincang.model.req.*;
import com.somle.xincang.model.resp.*;
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
    private XinCangStockApi xinCangStockApi;
    private XinCangOrderApi xinCangOrderApi;
    private final String URL = "https://oms.xincang-tech.com/oms";
    public XinCangClient(XinCangAccount account) {
        this.account = account;
        this.xinCangProductApi = new XinCangProductApi();
        this.xinCangStockApi = new XinCangStockApi();
        this.xinCangOrderApi = new XinCangOrderApi();
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

    //获得所有仓库信息
    public XinCangCustomerWarehousesResp getCustomerWarehouses() {
        return xinCangStockApi.getCustomerWarehouses(account.getToken());
    }

    //获取所有仓库的实时库存
    public List<XinCangStockListResp.InventoryItem> getStockList() {
        XinCangCustomerWarehousesResp warehouses = xinCangStockApi.getCustomerWarehouses(account.getToken());
        List<String> warehouseCodes = warehouses.getRst().getData().stream().map(XinCangCustomerWarehousesResp.Warehouse::getWarehouseCode).toList();
        List<XinCangStockListResp.InventoryItem> inventoryItems = new ArrayList<>();
        for (String warehouseCode : warehouseCodes) {
            Integer page = 1;
            while (true) {
                XingCangStockListReq req = XingCangStockListReq.builder()
                    .warehouseCode(warehouseCode)
                    .token(account.getToken())
                    .page(page++)
                    .limit(100)
                    .build();
                XinCangStockListResp stockListResp = xinCangStockApi.getStockList(req);
                if (CollUtil.isEmpty(stockListResp.getRst().getData())) {
                    break;
                }
                inventoryItems.addAll(stockListResp.getRst().getData());
            }
        }
        return inventoryItems;
    }

    //获取所有订单
    public List<XinCangOrderListResp.Order> getOrderList() {
        Integer page = 1;
        List<XinCangOrderListResp.Order> orders = new ArrayList<>();
        while (true) {
            XinCangOrderListReq req = XinCangOrderListReq.builder()
                .token(account.getToken())
                .page(page++)
                .limit(100)
                .build();
            XinCangOrderListResp orderList = xinCangOrderApi.getOrderList(req);
            if (CollUtil.isEmpty(orderList.getRst().getData())) {
                break;
            }
            orders.addAll(orderList.getRst().getData());
        }
        return orders;
    }

    //新增临时产品
    public XinCangCommonResp addProduct(XinCangAddProductReq req){
        XinCangCommonResp xinCangCommonResp = xinCangProductApi.addProduct(account.getToken(), req);
        if (xinCangCommonResp.getErrno() == 0) {
            log.info("新增临时产品成功{}",req);
        }
        return xinCangCommonResp;
    }

    //更新临时产品
    public XinCangCommonResp updateProduct(XinCangUpdateProductReq req){
        XinCangCommonResp xinCangCommonResp = xinCangProductApi.updateProduct(account.getToken(), req);
        if (xinCangCommonResp.getErrno() == 0) {
            log.info("更新临时产品成功{}",req);
        }
        return xinCangCommonResp;
    }




    //删除临时产品 有问题
    public XinCangCommonResp deleteProduct(String productNo){
        XinCangCommonResp xinCangCommonResp = xinCangProductApi.deleteProduct(account.getToken(), productNo);
        if (xinCangCommonResp.getErrno() == 0) {
            log.info("删除临时产品成功{}",productNo);
        }
        return xinCangCommonResp;
    }


    //新增一票多件
    public XinCangCommonResp addOrderMultiple(XinCangAddOrderMultipleReq req){
        XinCangCommonResp xinCangCommonResp = xinCangOrderApi.addOrderMultiple(account.getToken(), req);
        if (xinCangCommonResp.getErrno() == 0) {
            log.info("新增一票多件成功{}",req);
        }
        return xinCangCommonResp;
    }

    //修改订单
    public XinCangCommonResp updateOrder(XinCangUpdateOrderReq req){
        XinCangCommonResp xinCangCommonResp = xinCangOrderApi.updateOrder(account.getToken(), req);
        if (xinCangCommonResp.getErrno() == 0) {
            log.info("修改订单成功{}",req);
        }
        return xinCangCommonResp;
    }

    //审核订单
    public XinCangCommonResp approveOrders(String orderNos){
        XinCangCommonResp xinCangCommonResp = xinCangOrderApi.approveOrders(account.getToken(), orderNos);
        if (xinCangCommonResp.getErrno() == 0) {
            log.info("审核订单成功{}",orderNos);
        }
        return xinCangCommonResp;
    }

    //拦截订单
    public XinCangCommonResp interceptOrder(XinCangDoInterceptReq req){
        XinCangCommonResp xinCangCommonResp = xinCangOrderApi.interceptOrder(account.getToken(), req);
        if (xinCangCommonResp.getErrno() == 0) {
            log.info("拦截订单成功{}",req);
        }
        return xinCangCommonResp;
    }

    //删除订单
    public XinCangCommonResp deleteOrder(XinCangDeleteOrderReq req){
        XinCangCommonResp xinCangCommonResp = xinCangOrderApi.deleteOrder(account.getToken(), req);
        if (xinCangCommonResp.getErrno() == 0) {
            log.info("删除订单成功{}",req);
        }
        return xinCangCommonResp;
    }

}
