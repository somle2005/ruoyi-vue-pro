package com.somle.lingxing.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.alibaba.fastjson.JSON;
import com.somle.lingxing.model.LingXingAccount;
import com.somle.lingxing.model.reps.LingXingGetProductReps;
import com.somle.lingxing.model.reps.LingXingInventoryReps;
import com.somle.lingxing.model.reps.LingXingOutboundOrderDetailReps;
import com.somle.lingxing.model.reps.LingXingOutboundOrderListReps;
import com.somle.lingxing.model.req.*;
import com.somle.lingxing.util.LingXingUtil;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@Slf4j
public class LingXingClient {

    private OkHttpClient client = new OkHttpClient();
    private LingXingAccount account;
    private final String URL = "https://api.xlwms.com";
    public LingXingClient(LingXingAccount account) {
        this.account = account;
    }


    /***
     *
     * 获取综合库存信息
     */
    public LingXingInventoryReps comprehensiveInventoryInquiry(Integer page) {
        LingXingInventoryReq req = LingXingInventoryReq.builder().page(page).pageSize(100).build();
        String endPoint = "/openapi/v1/integratedInventory/pageOpen";
        String json = postMethod(endPoint, JsonUtilsX.toJsonString(req), req);
        LingXingInventoryReps reps = JSON.parseObject(json, LingXingInventoryReps.class);
        return reps;
    }

    public List<LingXingInventoryReps.ResponseData.InventoryRecord> getInventory() {
        Integer page = 1;
        List<LingXingInventoryReps.ResponseData.InventoryRecord> records = new ArrayList<>();
        while (true) {
            LingXingInventoryReps reps = comprehensiveInventoryInquiry(page);
            if (CollUtil.isEmpty(reps.getData().getRecords())) {
                break;
            }
            records.addAll(reps.getData().getRecords());
            page++;
        }
        return records;
    }

    /**
     * 通过此接口可以查询海外仓系统中已存在的产品资料，只有“已审核”的产品才可以直接使用
     * */
    public LingXingGetProductReps getProduct(Integer page) {
        LingXingGetProductReq.RequestData data = LingXingGetProductReq.RequestData.builder().page(page).pageSize(100).build();
        String endPoint = "/openapi/v1/product/pagelist";
        String json = postMethod(endPoint, JsonUtilsX.toJsonString(data), data);
        LingXingGetProductReps reps = JSONUtil.toBean(json, LingXingGetProductReps.class);
        return reps;
    }

    @SneakyThrows
    public List<LingXingGetProductReps.ResponseData.Product> getAllProducts(){
        Integer page = 1;
        List<LingXingGetProductReps.ResponseData.Product> products = new ArrayList<>();
        while (true) {
            LingXingGetProductReps reps = getProduct(page);
            if (CollUtil.isEmpty(reps.getData().getRecords())) {
                break;
            }
            products.addAll(reps.getData().getRecords());
            page++;
        }
        return products;
    }
    /***
     * 批量创建产品
     */
    @SneakyThrows
    public void batchCreateProduct(List<LingXingBatchCreateProductReq.ProductData> productDataList) {
        String endPoint = "/openapi/v1/product/batchCreate";
        String json = postMethod(endPoint, JsonUtilsX.toJsonString(productDataList),productDataList);
        System.out.println(json);
    }


    /**
     * 修改产品
     * */
    public void updateProduct(LingXingBatchCreateProductReq.ProductData productData) {
        String endPoint = "/openapi/v1/product/update";
        String json = postMethod(endPoint, JsonUtilsX.toJsonString(productData),productData);
        System.out.println(json);
    }

    /**
     * 创建小包出库单
     * */
    public void createWmsOutbound(LingXingCreateOutboundOrderReq req) {
        String endPoint = "/openapi/v1/outboundOrder/create";
        String json = postMethod(endPoint, JsonUtilsX.toJsonString(req),req);
        System.out.println(json);
    }



    /**
     *(Deprecated) 获取小包出库单列表
     * */
    public LingXingOutboundOrderListReps getOutboundOrderList(Integer page) {
        String endPoint = "/openapi/v1/outboundOrder/pageList";
        LingXingOutboundOrderListReq req = LingXingOutboundOrderListReq.builder()
                .page(page)
                .pageSize(10)
                .build();
        String json = postMethod(endPoint, JsonUtilsX.toJsonString(req),req);
        LingXingOutboundOrderListReps reps = JSONUtil.toBean(json, LingXingOutboundOrderListReps.class);
        return reps;
    }

    public List<LingXingOutboundOrderListReps.ResponseData.OutboundRecord> getAllOutboundOrder() {
        Integer page = 1;
        List<LingXingOutboundOrderListReps.ResponseData.OutboundRecord> outboundOrderList = new ArrayList<>();
        while (true) {
            LingXingOutboundOrderListReps reps = getOutboundOrderList(page++);
            if (CollUtil.isEmpty(reps.getData().getRecords())) {
                break;
            }
            outboundOrderList.addAll(reps.getData().getRecords());
        }
        return outboundOrderList;
    }

    /***
     * 获取小包出库单详情
     */
    public LingXingOutboundOrderDetailReps getOutBoundOrderDetail(LingXingOutboundOrderDetailReq  req) {
        String endPoint = "/openapi/v1/outboundOrder/detail";
        String json = postMethod(endPoint, JsonUtilsX.toJsonString(req), req);
        LingXingOutboundOrderDetailReps reps = JSONUtil.toBean(json, LingXingOutboundOrderDetailReps.class);
        return reps;
    }

    /***
     * 取消/截单小包出库单
     */
    public void cancelOutboundOrder(LingXingOutboundOrderDetailReq  req) {
        String endPoint = "/openapi/v1/outboundOrder/cancel";
        String json = postMethod(endPoint, JsonUtilsX.toJsonString(req), req);
        System.out.println(json);
    }

    public String postMethod(String endPoint, String json,Object data) {
        Map<String, Object> resultMap = LingXingUtil.getAuthCode(account.getAppKey(), account.getAppSecret(), json);
        String authCode = (String) resultMap.get("authcode");
        String reqTime  = resultMap.get("reqTime").toString();
        String url = URL + endPoint +"?authcode=" + authCode;
        JSONObject param = new JSONObject();
        param.put("appKey", account.getAppKey());
        param.put("data", data);
        param.put("reqTime", reqTime);
        RequestX requestX = RequestX.builder().url(url).requestMethod(RequestX.Method.POST).payload(param).build();
        Response response = WebUtils.sendRequest(requestX);
        String jsonStr = WebUtils.getBodyString(response);
        return jsonStr;
    }


}
