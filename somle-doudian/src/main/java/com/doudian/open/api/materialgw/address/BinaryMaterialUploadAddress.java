package com.doudian.open.api.materialgw.address;

import com.doudian.open.gson.annotations.SerializedName;

import java.util.List;

public class BinaryMaterialUploadAddress {

    @SerializedName("StoreInfos")
    private List<BinaryMaterialUploadAddressStoreInfo> storeInfos;

    @SerializedName("UploadHosts")
    private List<String> uploadHosts;

    public List<BinaryMaterialUploadAddressStoreInfo> getStoreInfos() {
        return storeInfos;
    }

    public void setStoreInfos(List<BinaryMaterialUploadAddressStoreInfo> storeInfos) {
        this.storeInfos = storeInfos;
    }

    public List<String> getUploadHosts() {
        return uploadHosts;
    }

    public void setUploadHosts(List<String> uploadHosts) {
        this.uploadHosts = uploadHosts;
    }
}
