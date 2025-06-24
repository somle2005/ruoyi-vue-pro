package com.doudian.open.api.materialgw.address;

import com.doudian.open.gson.annotations.SerializedName;

public class ResponseMetaError {

    @SerializedName("CodeN")
    int codeN;

    @SerializedName("Code")
    String code;

    @SerializedName("Message")
    String message;

    public int getCodeN() {
        return codeN;
    }

    public void setCodeN(int codeN) {
        this.codeN = codeN;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
