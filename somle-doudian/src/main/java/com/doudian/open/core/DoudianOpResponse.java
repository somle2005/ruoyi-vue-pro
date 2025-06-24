package com.doudian.open.core;


import com.doudian.open.gson.annotations.SerializedName;

public class DoudianOpResponse<T> {

    @SerializedName("data")
    private T data;

    @SerializedName("log_id")
    private String logId;

    @SerializedName("code")
    private String code;

    @SerializedName("msg")
    private String msg;

    @SerializedName("sub_code")
    private String subCode;

    @SerializedName("sub_msg")
    private String subMsg;

    private transient String originResponse;

    public boolean isSuccess() {
        return code != null && code.equals("10000");
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public void setOriginResponse(String originResponse) {
        this.originResponse = originResponse;
    }

    public String getOriginResponse() {
        return originResponse;
    }
}
