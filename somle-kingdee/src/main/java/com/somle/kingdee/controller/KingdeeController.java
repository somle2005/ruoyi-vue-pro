package com.somle.kingdee.controller;


import com.somle.framework.common.util.json.JSONObject;
import com.somle.framework.common.util.web.WebUtils;
import com.somle.kingdee.model.KingdeeCustomField;
import com.somle.kingdee.model.KingdeeResponse;
import com.somle.kingdee.model.KingdeeToken;
import com.somle.kingdee.service.KingDeeDataService;
import com.somle.kingdee.service.KingdeeClient;
import com.somle.kingdee.service.KingdeeService;

import jakarta.annotation.Resource;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import static com.somle.kingdee.util.SignatureUtils.*;

@Slf4j
@RestController
@RequestMapping("/api/kingdee")
public class KingdeeController {

    @Autowired
    private KingdeeService kingdeeService;

    private KingdeeClient kingdeeClient;

    @PostConstruct
    public void init() {
        this.kingdeeClient = kingdeeService.getClientList().get(0);
        log.info(kingdeeClient.getToken().getAccountName());
    }

    @Data
    public static class KingdeeRequest {
        private String bizType;
        private String operation;
        private long timestamp;
        private List<KingdeeToken> data;
    }
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/getAppToken")
    public Object getAppToken() {
        log.info("preparing app token");
        String appKey = kingdeeClient.getToken().getAppKey();
        String appSignature = kingdeeClient.getToken().getAppSignature();
        String reqMtd = "GET";
        String ctime = String.valueOf(System.currentTimeMillis());
        String endUrl = "/jdyconnector/app_management/kingdee_auth_token";
        String fullUrl = BASE_HOST + endUrl;
        TreeMap<String, String> params = new TreeMap<>();
        params.put("app_key", appKey);
        params.put("app_signature", appSignature);
        String apiSignature = getApiSignature(reqMtd, endUrl, params, ctime);
        //封装请求头
        HttpEntity<MultiValueMap<String, Object>> formEntity = new HttpEntity<>(null,getAuthRestHeaders(ctime,apiSignature));
        ResponseEntity<Map> response = restTemplate.exchange(fullUrl + "?app_key=" + appKey + "&app_signature=" + appSignature, HttpMethod.GET, formEntity, Map.class);
        if (response.getStatusCode().is2xxSuccessful()){
            System.err.println(response.getBody());
            return response.getBody();
        }else {
            throw new RuntimeException("Failed to get app token: " + response.getStatusCode());
        }
    }

    @Resource
    private KingDeeDataService kingDeeDataService;
    @GetMapping("/test")
    public Object test() {
        return kingDeeDataService.getPurchaseApplyList();
    }














    @GetMapping("/refreshAuth")
    @ResponseBody
    public void refreshAuth(
    ) {
        kingdeeService.refreshAuths();
    }



    @PostMapping("/broadcast")
    @ResponseBody
    public void broadcast(
        @RequestBody KingdeeRequest body
    ) {

        RestTemplate restTemplate = new RestTemplate();
        String[] urlList = {
            "http://8.218.43.27:8889/api0/givesign",
            "http://test.esb.somle.com:55002/api/kingdee/updateToken",
            "http://dev.esb.somle.com:55002/api/kingdee/updateToken",
            "http://prod.esb.somle.com:55002/api/kingdee/updateToken",
        };
        for (String url : urlList) {
            try {
                restTemplate.exchange(url, HttpMethod.POST, new HttpEntity<>(body), JSONObject.class);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


    @GetMapping("/getSupplier")
    @ResponseBody
    public KingdeeResponse getSupplier(
    ) {
        return kingdeeClient.getSupplier();
    }

    @GetMapping("/getVoucher")
    @ResponseBody
    public KingdeeResponse getVoucher(
        @RequestParam String date
    ) {
        return kingdeeClient.getVoucher(LocalDate.parse(date));
    }

    @GetMapping("/getVoucherDetail")
    @ResponseBody
    public KingdeeResponse getVoucherDetail(
        @RequestParam String id
    ) {
        return kingdeeClient.getVoucherDetail(id);
    }

    @GetMapping("/getCustomField")
    @ResponseBody
    public Stream<KingdeeCustomField> getCustomField(
        @RequestParam String entity_number
    ) {
        return kingdeeClient.getCustomField(entity_number);
    }

    @GetMapping("/list")
    @ResponseBody
    public List<KingdeeResponse> list(
        @RequestParam String endpoint
    ) {
        return kingdeeClient.list(endpoint).toList();
    }

    @PostMapping("/post")
    @ResponseBody
    public KingdeeResponse post(
        @RequestParam String endpoint,
        @RequestBody JSONObject payload
    ) {
        log.debug("delegate to service");
        return kingdeeClient.post(endpoint, payload);
    }

}