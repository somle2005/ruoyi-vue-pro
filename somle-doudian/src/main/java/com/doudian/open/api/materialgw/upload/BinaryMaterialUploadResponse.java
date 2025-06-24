package com.doudian.open.api.materialgw.upload;

import com.doudian.open.api.materialgw.address.ResponseMetaError;
import com.doudian.open.gson.annotations.SerializedName;

public class BinaryMaterialUploadResponse {

    @SerializedName("Version")
    private String version;

    @SerializedName("success")
    private int success;

    @SerializedName("error")
    private UploadError error;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public UploadError getError() {
        return error;
    }

    public void setError(UploadError error) {
        this.error = error;
    }
}
