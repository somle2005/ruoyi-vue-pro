package com.doudian.open.api.materialgw.auth;

import com.doudian.open.gson.annotations.SerializedName;

public class BinaryMaterialUploadAddressAuthData {
    /**
     * 获取上传地址访问query
     */
    @SerializedName("auth_query")
    private String authQuery;

    public String getAuthQuery() {
        return authQuery;
    }

    public void setAuthQuery(String authQuery) {
        this.authQuery = authQuery;
    }
}
