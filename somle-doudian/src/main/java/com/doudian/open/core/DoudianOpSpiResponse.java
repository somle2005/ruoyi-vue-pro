package com.doudian.open.core;

import com.doudian.open.gson.annotations.SerializedName;

public class DoudianOpSpiResponse<T> {

    @SerializedName("code")
    private Long code;

    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private T data;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
