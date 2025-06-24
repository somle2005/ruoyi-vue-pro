package com.doudian.open.core.msg;

import com.doudian.open.gson.annotations.SerializedName;

public class DoudianOpMsgResponse {
    @SerializedName("code")
    private Long code;

    @SerializedName("msg")
    private String msg;

    public Long getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static DoudianOpMsgResponse wrapSuccess() {
        DoudianOpMsgResponse response = new DoudianOpMsgResponse();
        response.setCode(0L);
        response.setMsg("success");
        return response;
    }

    public static DoudianOpMsgResponse wrapError(Long code, String message) {
        DoudianOpMsgResponse response = new DoudianOpMsgResponse();
        response.setCode(code);
        response.setMsg(message);
        return response;
    }
}
