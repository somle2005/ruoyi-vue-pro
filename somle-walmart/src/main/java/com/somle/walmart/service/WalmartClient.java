package com.somle.walmart.service;


import cn.iocoder.yudao.framework.common.util.general.CoreUtils;
import cn.iocoder.yudao.framework.common.util.io.IoUtils;
import cn.iocoder.yudao.framework.common.util.json.JSONObject;
import cn.iocoder.yudao.framework.common.util.json.JsonUtilsX;
import cn.iocoder.yudao.framework.common.util.web.RequestX;
import cn.iocoder.yudao.framework.common.util.web.WebUtils;
import com.alibaba.fastjson.JSON;
import com.somle.walmart.model.WalmartAllItemsReqVO;
import com.somle.walmart.model.WalmartOrderReqVO;
import com.somle.walmart.model.WalmartToken;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.HttpClientErrorException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Slf4j
public abstract class WalmartClient {


    private final int pageSize = 50;
    WalmartToken token;

    private String accessToken;

    public WalmartClient(WalmartToken token) {
        this.token = token;
        this.accessToken = getAccessToken();
        log.info(token.getSvcName());
    }

    /**
     * 对密钥进行编码
     */
    private String getAuthorization(WalmartToken token) {
        String str = token.getClientId()+ ":" + token.getClientSecret();
        return "Basic " + Base64.encodeBase64String(str.getBytes());
    }

    Headers commonHeaders() {
        return new Headers.Builder()
                .add("WM_QOS.CORRELATION_ID", "b3261d2d-028a-4ef7-8602-633c23200af6")
                .add("WM_SVC.NAME", token.getSvcName())
                .add("Accept", "application/json")
                .build();

    }

    Headers normalHeaders() {
        return commonHeaders().newBuilder()
                .add("WM_SEC.ACCESS_TOKEN", getAccessToken())
                .build();
    }

    abstract Headers headers();

    abstract HttpUrl url(String endpoint);


    @SneakyThrows
    public String getAccessToken() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials");
        var url = url("v3/token");
        Request request = new Request.Builder()
                .url(url)
                .method("POST", body)
                .headers(commonHeaders())
                .addHeader("Authorization", getAuthorization(token))
                .build();

        log.info(request.toString());
        Response response = client.newCall(request).execute();
        var bodyString = response.body().string();
        log.info(bodyString);
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result.getString("access_token");
    }


    @Scheduled(cron = "0 */7 * * * *")
    public void refreshAccessToken() {
        accessToken = getAccessToken();
    }

    @SneakyThrows
    public JSONObject getOrders(WalmartOrderReqVO vo) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        var url = url("v3/orders");
        var headers = WebUtils.merge(headers(), WebUtils.toHeaders(vo));
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .headers(headers)
                .build();
        Response response = client.newCall(request).execute();
        var bodyString = response.body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    public List<String> getAvailableReconFileDates() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        var url = url("v3/report/reconreport/availableReconFiles").newBuilder()
                .addQueryParameter("reportVersion", "v1")
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .headers(headers())
                .build();
        Response response = client.newCall(request).execute();
        var bodyString = response.body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result.getStringList("availableApReportDates");
    }

    @SneakyThrows
    public String getReconFile(String date) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        var url = url("v3/report/reconreport/availableReconFiles").newBuilder()
                .addQueryParameter("reportVersion", "v1")
                .addQueryParameter("reportDate", date)
                .build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .headers(headers())
                .addHeader("Accept", "application/octet-stream")
                .build();
        Response response = client.newCall(request).execute();
        // Execute the request
        if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
        }

        // Get the Content-Disposition header
//        String contentDisposition = response.header("Content-Disposition");
//        if (contentDisposition == null || !contentDisposition.contains("filename=")) {
//            throw new IOException("Filename not found in Content-Disposition header");
//        }
//
//        String zipFileName = contentDisposition.split("filename=")[1];
//        log.info("zip file name: " + zipFileName);

        // Save the response body as a zip file
        InputStream inputStream = response.body().byteStream();
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipEntry entry;
        String result = null;
        while ((entry = zipInputStream.getNextEntry()) != null) {
            if (!entry.isDirectory() && entry.getName().endsWith(".csv")) {
                result = IoUtils.readUtf8(zipInputStream, false);
            }
            zipInputStream.closeEntry();
        }

        return result;
    }

    public String getReconFile(LocalDate date) {
        var formatter = DateTimeFormatter.ofPattern("MMddyyyy");
        return getReconFile(date.format(formatter));
    }

    @SneakyThrows
    public JSONObject getPaymentStatement() {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        var url = url("v3/report/payment/statement");
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .headers(headers())
                .build();
        Response response = client.newCall(request).execute();
        var bodyString = response.body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

    @SneakyThrows
    public JSONObject getAllItems() {
        OkHttpClient client = new OkHttpClient().newBuilder()
            .build();
        HttpUrl url = url("v3/items");
        HttpUrl.Builder urlBuilder = url.newBuilder();
        urlBuilder.addQueryParameter("limit", "30");

        Request request = new Request.Builder()
            .url(urlBuilder.build().toString())
            .method("GET", null)
            .headers(headers())
            .build();
        Response response = client.newCall(request).execute();
        var bodyString = response.body().string();
        var result = JsonUtilsX.parseObject(bodyString, JSONObject.class);
        return result;
    }

//    @SneakyThrows
//    public Stream<JSONObject> streamAllItems(WalmartAllItemsReqVO walmartAllItemsReqVO) {
//        String endpoint = "v3/items";
//        return getAllPage(JsonUtilsX.toJSONObject(walmartAllItemsReqVO), endpoint);
//    }
//
//    private Stream<JSONObject> getAllPage(JSONObject payload, String endpoint) {
//        payload.put("page", 1);
//        payload.put("page_size", pageSize);
//        return Stream.iterate(
//            getPage(payload, endpoint), Objects::nonNull,
//            bizContent -> {
//                if (bizContent.hasNext()) {
//                    log.debug("have next,endpoint:{}当前进度：{}/{}", endpoint, (bizContent.getPage() - 1) * pageSize + bizContent.getData().size(), bizContent.getTotal());
//                    payload.put("page", bizContent.getPage() + 1);
//                    return getPage(payload, endpoint);
//                } else {
//                    log.debug("no next page");
//                    return null;
//                }
//            }
//        );
//    }
//
//    private JSONObject getPage(Object payload, String endpoint) {
//        JSONObject response = getResponse(payload, endpoint);
//        return response.getBizContent(EccangPage.class);
//    }
//
//    @SneakyThrows
//    private JSONObject getResponse(Object payload, String endpoint) {
//
//        String url = url(endpoint).toString();
//
//        JSONObject responseFinal = CoreUtils.retry(ctx -> {
//            var requestBody = requestBody(payload, endpoint);
//            var request = RequestX.builder()
//                .requestMethod(RequestX.Method.POST)
//                .url(url)
//                .payload(requestBody)
//                .build();
//            // 获取当前重试次数
//            int retryCount = ctx.getRetryCount();
//            // 记录每次重试的日志
//            if (ctx.getRetryCount() != 0) {
//                log.debug("正在请求url= {},第 {} 次重试。endpoint = {}", request.getUrl(), retryCount, endpoint);
//                log.debug("重试原因：{}", ctx.getLastThrowable().toString());
//            }
//            try (var response = WebUtils.sendRequest(request)) {
//                switch (response.code()) {
//                    case 200:
//                        var responseBody = response.body().string();
//                        var responseOriginal = JsonUtilsX.parseObject(responseBody, EccangResponse.class);
//                        validateResponse(responseOriginal);
//                        return responseOriginal;
//                    case 429:
//                        throw new HttpClientErrorException(HttpStatus.TOO_MANY_REQUESTS, "Too many requests, please try again later.");
//                    default:
//                        throw new RuntimeException("Unknown response code " + response);
//                }
//            }
//        });
//        return responseFinal;
//    }
}