package com.doudian.open.api.materialgw.upload;

import com.doudian.open.gson.annotations.SerializedName;

public class UploadError {

    @SerializedName("code")
    private int code;

    @SerializedName("error")
    private String error;

    @SerializedName("error_code")
    private int errorCode;

    @SerializedName("message")
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
