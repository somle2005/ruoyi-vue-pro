package com.doudian.open.api.materialgw.address;

import com.doudian.open.gson.annotations.SerializedName;

public class BinaryMaterialUploadAddressStoreInfo {

    @SerializedName("StoreUri")
    private String storeUri;

    @SerializedName("Auth")
    private String auth;

    @SerializedName("UploadID")
    private String uploadID;

    public String getStoreUri() {
        return storeUri;
    }

    public void setStoreUri(String storeUri) {
        this.storeUri = storeUri;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getUploadID() {
        return uploadID;
    }

    public void setUploadID(String uploadID) {
        this.uploadID = uploadID;
    }
}
