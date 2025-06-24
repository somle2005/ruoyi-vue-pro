package com.doudian.open.api.token;


import com.doudian.open.annotation.OpField;
import com.doudian.open.gson.annotations.SerializedName;

public class AccessTokenParam  {

    @SerializedName("code")
    private String code;

    @SerializedName("grant_type")
    private String grantType;

    @SerializedName("shop_id")
    private Long shopId;

    @SerializedName("auth_id")
    private String authId;

    @SerializedName("auth_subject_type")
    private String authSubjectType;

    @SerializedName("test_shop")
    private String testShop;

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getAuthSubjectType() {
        return authSubjectType;
    }

    public void setAuthSubjectType(String authSubjectType) {
        this.authSubjectType = authSubjectType;
    }

    public String getTestShop() {
        return testShop;
    }

    public void setTestShop(String testShop) {
        this.testShop = testShop;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}
