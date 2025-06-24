package com.doudian.open.core.msg;

public class MsgParam {

    private String requestBody;

    private String appId;

    private String eventSign;

    public static MsgParam build() {
        return new MsgParam();
    }

    public MsgParam setRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public String getAppId() {
        return appId;
    }

    public MsgParam setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getEventSign() {
        return eventSign;
    }

    public MsgParam setEventSign(String eventSign) {
        this.eventSign = eventSign;
        return this;
    }
}
