package com.somle.gigacloud.service;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.gigacloud.model.GigaCloudAccount;
import com.somle.gigacloud.model.reps.GigaCloudBatchInventoryQueryResp;
import com.somle.gigacloud.model.reps.GigaCloudInventorySearchReps;
import com.somle.gigacloud.model.reps.GigaCloudTokenResp;
import com.somle.gigacloud.model.req.GigaCloudBatchInventoryQueryReq;
import com.somle.gigacloud.model.req.GigaCloudInventorySearchReq;
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
public class GigaCloudClient {

    private OkHttpClient client = new OkHttpClient();
    private GigaCloudAccount account;
    private final String URL = "https://3plglobal.gigacloudlogistics.com";
    public GigaCloudClient(GigaCloudAccount account) {
        this.account = account;
    }


    public String getToken() {
        String endPoint = "/3plapi/getToken";
        JSONObject payload = new JSONObject();
        payload.put("username", account.getUserName());
        payload.put("password", account.getPassword());
        RequestX requestX = RequestX.builder().url(URL + endPoint).requestMethod(RequestX.Method.POST).payload(payload).build();
        Response response = WebUtils.sendRequest(requestX);
        String json = WebUtils.getBodyString(response);
        GigaCloudTokenResp tokenResp = JSONUtil.toBean(json, GigaCloudTokenResp.class);
        return tokenResp.getToken();
    }


    //库存查询
    public GigaCloudInventorySearchReps inventoryQuery(GigaCloudInventorySearchReq req){
        String endPoint = "/3plapi/inventory/inventoryQuery";
        RequestX requestX = RequestX.builder()
            .url(URL + endPoint)
            .requestMethod(RequestX.Method.POST)
            .payload(req)
            .headers(Map.of("Authorization", "Bearer " + account.getToken()))
            .build();
        Response response = WebUtils.sendRequest(requestX);
        String json = WebUtils.getBodyString(response);
        GigaCloudInventorySearchReps gigaCloudInventorySearchReps = JSONUtil.toBean(json, GigaCloudInventorySearchReps.class);
        return gigaCloudInventorySearchReps;
    }

    //获得所有的库存查询信息
    public List<GigaCloudInventorySearchReps.ProductInfo> getAllInventoryQuery(){
        List<GigaCloudInventorySearchReps.ProductInfo> list = new ArrayList<>();
        Integer pageNum = 1;
        while (true) {
            GigaCloudInventorySearchReq req = GigaCloudInventorySearchReq.builder()
                .customerCode("D303")
                .country("2")
                .showZeroData(false)
                .pageNum(pageNum++)
                .pageSize(500)
                .build();
            GigaCloudInventorySearchReps gigaCloudInventorySearchReps = inventoryQuery(req);
            if (list.size() == gigaCloudInventorySearchReps.getTotal()) {
                break;
            }
            list.addAll(gigaCloudInventorySearchReps.getData());
        }
        return list;
    }

    //批次库存查询
    @SneakyThrows
    public GigaCloudBatchInventoryQueryResp batchInventoryQuery(GigaCloudBatchInventoryQueryReq req) {
        String endPoint = "/3plapi/inventory/batchInventoryQuery";
        RequestX requestX = RequestX.builder()
            .url(URL + endPoint)
            .requestMethod(RequestX.Method.POST)
            .payload(req)
            .headers(Map.of("Authorization", "Bearer " + account.getToken()))
            .build();
        Response response = WebUtils.sendRequest(requestX);
        String bodyString = response.body().string();
        GigaCloudBatchInventoryQueryResp gigaCloudBatchInventoryQueryResp = JSONUtil.toBean(bodyString, GigaCloudBatchInventoryQueryResp.class);
        return gigaCloudBatchInventoryQueryResp;
    }

    //获取所有的批次库存查询信息
    public List<GigaCloudBatchInventoryQueryResp.InventoryItem> getAllBatchInventoryQuery() {
        List<GigaCloudBatchInventoryQueryResp.InventoryItem> inventoryItems = new ArrayList<>();
        Integer pageNum = 1;
        while (true) {
            GigaCloudBatchInventoryQueryReq req = GigaCloudBatchInventoryQueryReq.builder()
                .country("2")
                .customerCode("D303")
                .pageNum(pageNum++)
                .pageSize(100)
                .showZeroData(false)
                .build();
            GigaCloudBatchInventoryQueryResp resp = batchInventoryQuery(req);
            if (resp.getTotal() == inventoryItems.size()) {
                break;
            }
            inventoryItems.addAll(resp.getData());
        }
        return inventoryItems;
    }






}
