package com.doudian.open.core;

public class DoudianOpSpiParam {

    private String appKey;

    private String timestamp;

    private String sign;

    private String signV2;

    private String signMethod;

    private String paramJson;

    public static DoudianOpSpiParam build() {
        return new DoudianOpSpiParam();
    }

    public String getAppKey() {
        return appKey;
    }

    public DoudianOpSpiParam setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public DoudianOpSpiParam setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getSign() {
        return sign;
    }

    public DoudianOpSpiParam setSign(String sign) {
        this.sign = sign;
        return this;
    }

    public String getSignMethod() {
        return signMethod;
    }

    public DoudianOpSpiParam setSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }

    public String getParamJson() {
        return paramJson;
    }

    public DoudianOpSpiParam setParamJson(String paramJson) {
        this.paramJson = paramJson;
        return this;
    }

    public String getSignV2() {
        return signV2;
    }

    public DoudianOpSpiParam setSignV2(String signV2) {
        this.signV2 = signV2;
        return this;
    }
}
