package com.somle.gigacloud.service;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.somle.gigacloud.model.GigaCloudAccount;
import com.somle.gigacloud.model.reps.GigaCloudTokenResp;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Response;

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





}
