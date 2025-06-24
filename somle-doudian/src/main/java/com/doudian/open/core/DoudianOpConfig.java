package com.doudian.open.core;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DoudianOpConfig {
    /**
     * app key
     */
    private String appKey;

    /**
     * app secret
     */
    private String appSecret;

    /**
     * 多应用
     */
    private Map<String, String> multiAppKeyMap = new ConcurrentHashMap<>();

    /**
     * 抖店开放平台请求地址
     */
    private String openRequestUrl = "https://openapi-fxg.jinritemai.com";

    /**
     * http请求连接超时时间
     */
    private Integer httpClientConnectTimeout;

    /**
     * http请求读取数据超时时间
     */
    private Integer httpClientReadTimeout;

    /**
     * 异步调用线程池大小
     */
    private Integer asyncThreadPoolSize = 100;

    /**
     * 调用素材网关超时时间
     */
    private Integer materialGatewayHttpReadTimeout;

    /**
     * 调用素材网关连接超时时间
     */
    private Integer materialGatewayHttpConnectTimeout;

    public Integer getMaterialGatewayHttpReadTimeout() {
        return materialGatewayHttpReadTimeout;
    }

    public void setMaterialGatewayHttpReadTimeout(Integer materialGatewayHttpReadTimeout) {
        this.materialGatewayHttpReadTimeout = materialGatewayHttpReadTimeout;
    }

    public Integer getMaterialGatewayHttpConnectTimeout() {
        return materialGatewayHttpConnectTimeout;
    }

    public void setMaterialGatewayHttpConnectTimeout(Integer materialGatewayHttpConnectTimeout) {
        this.materialGatewayHttpConnectTimeout = materialGatewayHttpConnectTimeout;
    }

    /**
     * 异步调用等待队列大小
     */
    private Integer asyncThreadPoolQueueSize = 1000;

    /**
     *  http请求头
     */
    private final Map<String, String> httpRequestHeader = new HashMap<>();

    /**
     *  是否进行参数校验
     */
    private boolean fieldCheck = true;

    /**
     * 消息网关是否执行签名验证
     */
    private boolean msgSignValidate = false;


    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getOpenRequestUrl() {
        return openRequestUrl;
    }

    public void setOpenRequestUrl(String openRequestUrl) {
        this.openRequestUrl = openRequestUrl;
    }

    public Integer getHttpClientConnectTimeout() {
        return httpClientConnectTimeout;
    }

    public void setHttpClientConnectTimeout(Integer httpClientConnectTimeout) {
        this.httpClientConnectTimeout = httpClientConnectTimeout;
    }

    public Integer getHttpClientReadTimeout() {
        return httpClientReadTimeout;
    }

    public void setHttpClientReadTimeout(Integer httpClientReadTimeout) {
        this.httpClientReadTimeout = httpClientReadTimeout;
    }


    public Integer getAsyncThreadPoolSize() {
        return asyncThreadPoolSize;
    }

    public void setAsyncThreadPoolSize(Integer asyncThreadPoolSize) {
        this.asyncThreadPoolSize = asyncThreadPoolSize;
    }

    public Integer getAsyncThreadPoolQueueSize() {
        return asyncThreadPoolQueueSize;
    }

    public void setAsyncThreadPoolQueueSize(Integer asyncThreadPoolQueueSize) {
        this.asyncThreadPoolQueueSize = asyncThreadPoolQueueSize;
    }

    public Map<String, String> getHttpRequestHeader() {
        return httpRequestHeader;
    }

    public void addHttpRequestHeader(String key, String value) {
        this.httpRequestHeader.put(key, value);
    }

    public boolean getFieldCheck() {
        return fieldCheck;
    }

    public void setFieldCheck(boolean fieldCheck) {
        this.fieldCheck = fieldCheck;
    }

    public void setMsgSignValidate(boolean msgSignValidate) {
        this.msgSignValidate = msgSignValidate;
    }

    public boolean getMsgSignValidate() {
        return msgSignValidate;
    }

    public String getSecretByAppKey(String appKey) {
        return multiAppKeyMap.getOrDefault(appKey, null);
    }

    public void AddAppKeyAndSecret(String appKey, String appSecret) {
        this.multiAppKeyMap.put(appKey, appSecret);
    }
}

