package com.doudian.open.core;

import com.doudian.open.constant.SDKConstant;
import com.doudian.open.core.http.DefaultHttpClient;
import com.doudian.open.core.http.HttpClient;
import com.doudian.open.core.http.HttpRequest;
import com.doudian.open.core.http.HttpResponse;
import com.doudian.open.core.threadpool.DoudianOpThreadPool;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.exception.DoudianOpException;
import com.doudian.open.utils.LogUtils;
import com.doudian.open.utils.Logger;
import com.doudian.open.utils.SignUtil;


import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

import static com.doudian.open.exception.DoudianOpException.Code.UNRECOGNIZED_EXCEPTION;


public class DefaultDoudianOpClient implements DoudianOpClient{

    private static final Logger LOG = Logger.getLogger(DefaultDoudianOpClient.class);

    private static final DefaultDoudianOpClient DEFAULT_DOUDIAN_OP_CLIENT = new DefaultDoudianOpClient();

    private HttpClient httpClient = DefaultHttpClient.getDefaultClient();


    @Override
    public <T, R> DoudianOpResponseWrapper<T> request(DoudianOpRequest<R> request, AccessToken accessToken) {
        return doRequest(request, accessToken);
    }

    @SuppressWarnings("unchecked")
    private <T, R> DoudianOpResponseWrapper<T> doRequest(DoudianOpRequest<R> request, AccessToken accessToken) {
        String appKey = request.getConfig().getAppKey();
        String appSecret = request.getConfig().getAppSecret();
        //如果accessToken中有appKey，则需要拿对应的appSecret
        if (accessToken != null && accessToken.getAppKey() != null) {
            appKey = accessToken.getAppKey();
            appSecret = request.getConfig().getSecretByAppKey(appKey);
            if (appSecret == null) {
                throw new DoudianOpException(DoudianOpException.Code.APP_SECRET_NOT_FOUND);
            }
        }

        String paramJson = JsonUtil.toJson(request.getParam());
        String requestUrlPath = getRequestUrlPath(request.getUrlPath());

        String timestamp = String.valueOf(System.currentTimeMillis());
        String requestUrlPattern = "%s/%s?app_key=%s&method=%s&v=2&sign=%s&timestamp=%s&access_token=%s";
        String method = requestUrlPath.replaceAll("/", ".");
        String sign = SignUtil.sign(appKey, appSecret, method, timestamp, paramJson, "2");
        String accessTokenStr = "";
        if(accessToken != null){
            accessTokenStr = accessToken.getAccessToken();
        }

        //参数校验
        if(request.getConfig().getFieldCheck()) {
            ParameterChecker.check(request.getParam());
        }

        String requestUrl = null;
        requestUrl = String.format(requestUrlPattern, request.getConfig().getOpenRequestUrl(), requestUrlPath, appKey, method, sign, timestamp, accessTokenStr);
        HttpRequest httpRequest = HttpRequest.build(requestUrl, paramJson);
        LOG.info("http request url: %s, body: %s", requestUrl, paramJson);
        String logId = LogUtils.getLogId();
        if(logId!=null){
            httpRequest.addHeader("x-tt-logid", logId);
        }


        httpRequest.addHeader("from", "sdk");
        httpRequest.addHeader("sdk-version", SDKConstant.SDK_VERSION);
        httpRequest.addHeader("sdk-type", "java");
        httpRequest.addHeader("x-open-no-old-err-code", "1");

        if (request.isPerf()) {
            httpRequest.addHeader("X-Perf-Env", "dop_isv_mock");
        }
        

        if(request.getConfig().getHttpClientConnectTimeout() != null){
            httpRequest.setConnectTimeout(request.getConfig().getHttpClientConnectTimeout());
        }
        if(request.getConfig().getHttpClientReadTimeout() != null){
            httpRequest.setReadTimeout(request.getConfig().getHttpClientReadTimeout());
        }
        if(request.getConfig().getHttpRequestHeader() != null && request.getConfig().getHttpRequestHeader().size() > 0) {
            httpRequest.addHeader(request.getConfig().getHttpRequestHeader());
        }

        HttpResponse httpResponse = httpClient.post(httpRequest);
        if(httpResponse.getStatusCode() != 200){
            throw new DoudianOpException(DoudianOpException.Code.HTTP_RESPONSE_STATUS_CODE_NOT_2XX);
        }
        String httpBody = httpResponse.getBody();
        LOG.info("http response: %s", httpBody);

        if (httpBody == null || "".equals(httpBody)) {
            //确保反序列化出来的对象不为null
            httpBody = "{}";
        }

        try {
            //将http返回的json字符串序列化成java模型
            DoudianOpResponse<?> response = JsonUtil.fromJson(httpBody, request.getResponseClass());
            //将原始的返回数据设置进去
            response.setOriginResponse(httpBody);
            //组装一个wrapper，wrapper中主要额外存储一些上下文信息
            DoudianOpResponseWrapper<T> responseWrapper = new DoudianOpResponseWrapper<>();
            responseWrapper.setResponse((T)response);
            responseWrapper.setHttpRequest(httpRequest);
            responseWrapper.setHttpResponse(httpResponse);
            return responseWrapper;
        }catch (Exception e){
            throw new DoudianOpException(DoudianOpException.Code.JSON_ERROR, e);
        }
    }

    @Override
    public <T, R> Future<DoudianOpResponseWrapper<T>> asyncRequest(final DoudianOpRequest<R> request, final AccessToken accessToken) {
        return DoudianOpThreadPool.getInstance(request.getConfig()).submit(new Callable<DoudianOpResponseWrapper<T>>() {
            @Override
            public DoudianOpResponseWrapper<T> call() throws Exception {
                return DefaultDoudianOpClient.this.request(request, accessToken);
            }
        });
    }

    private String getRequestUrlPath(String originUrl){
        if (originUrl == null || originUrl.length() == 0){
            return originUrl;
        }
        if (originUrl.startsWith("/")) {
            return originUrl.substring(1);
        }
        return originUrl;
    }

    public static DefaultDoudianOpClient getDefaultClient(){
        return DEFAULT_DOUDIAN_OP_CLIENT;
    }

    public void setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }
}
