package com.doudian.open.api.materialgw.address;

import com.doudian.open.gson.annotations.SerializedName;

public class BinaryMaterialUploadAddressResult {

    @SerializedName("UploadAddress")
    private BinaryMaterialUploadAddress uploadAddress;

    @SerializedName("RequestId")
    private String requestId;

    public BinaryMaterialUploadAddress getUploadAddress() {
        return uploadAddress;
    }

    public void setUploadAddress(BinaryMaterialUploadAddress uploadAddress) {
        this.uploadAddress = uploadAddress;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
