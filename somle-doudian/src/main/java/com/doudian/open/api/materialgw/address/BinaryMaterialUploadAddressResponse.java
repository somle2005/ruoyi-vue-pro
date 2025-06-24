package com.doudian.open.api.materialgw.address;

import com.doudian.open.gson.annotations.SerializedName;

public class BinaryMaterialUploadAddressResponse {

    @SerializedName("ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @SerializedName("Result")
    private BinaryMaterialUploadAddressResult result;

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public BinaryMaterialUploadAddressResult getResult() {
        return result;
    }

    public void setResult(BinaryMaterialUploadAddressResult result) {
        this.result = result;
    }
}
