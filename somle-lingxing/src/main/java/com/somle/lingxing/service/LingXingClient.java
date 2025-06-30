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
import com.somle.lingxing.model.req.LingXingGetProductReq;
import com.somle.lingxing.model.req.LingXingInventoryReq;
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

        Map<String, Object> resultMap = LingXingUtil.getAuthCode(account.getAppKey(), account.getAppSecret(), JsonUtilsX.toJsonString(req));
        String authCode = (String) resultMap.get("authcode");
        String reqTime  = resultMap.get("reqTime").toString();

        String url = URL + "/openapi/v1/integratedInventory/pageOpen?authcode=" + authCode;
        JSONObject param = new JSONObject();
        param.put("appKey", account.getAppKey());
        param.put("data", req);
        param.put("reqTime", reqTime);
        RequestX requestX = RequestX.builder().url(url).requestMethod(RequestX.Method.POST).payload(param).build();
        Response response = WebUtils.sendRequest(requestX);
        String json = WebUtils.getBodyString(response);
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
        Map<String, Object> resultMap = LingXingUtil.getAuthCode(account.getAppKey(), account.getAppSecret(), JsonUtilsX.toJsonString(data));
        String authCode = (String) resultMap.get("authcode");
        String reqTime  = resultMap.get("reqTime").toString();
        JSONObject param = new JSONObject();
        param.put("appKey", account.getAppKey());
        param.put("data",  data);
        param.put("reqTime", reqTime);
        String url = URL + "/openapi/v1/product/pagelist?authcode=" + authCode;
        RequestX requestX = RequestX.builder().url(url).requestMethod(RequestX.Method.POST).payload(param).build();
        Response response = WebUtils.sendRequest(requestX);
        String json = WebUtils.getBodyString(response);
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


}
