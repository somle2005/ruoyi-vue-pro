package com.doudian.open.api.materialgw.address;

import com.doudian.open.gson.annotations.SerializedName;

public class ResponseMetadata {

    @SerializedName("RequestId")
    private String requestId;

    @SerializedName("Error")
    private ResponseMetaError responseMetaError;

    public ResponseMetaError getError() {
        return responseMetaError;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setError(ResponseMetaError responseMetaError) {
        this.responseMetaError = responseMetaError;
    }
}
