package com.doudian.open.api.materialgw.auth;

import com.doudian.open.gson.annotations.SerializedName;

public class BinaryMaterialUploadAddressAuthParam {

    @SerializedName("file_extension")
    private String fileExtension;

    @SerializedName("upload_num")
    private Integer uploadNum;

    @SerializedName("biz_type")
    private Integer bizType;

    @SerializedName("store_keys_array_json")
    private String storeKeys;

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Integer getUploadNum() {
        return uploadNum;
    }

    public void setUploadNum(Integer uploadNum) {
        this.uploadNum = uploadNum;
    }

    public Integer getBizType() {
        return bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getStoreKeys() {
        return storeKeys;
    }

    public void setStoreKeys(String storeKeys) {
        this.storeKeys = storeKeys;
    }
}
