package com.doudian.open.core;

import com.doudian.open.api.token.AccessTokenData;
import com.doudian.open.api.token.AccessTokenResponse;
import com.doudian.open.api.token.RefreshTokenResponse;
import com.doudian.open.gson.annotations.SerializedName;

public class AccessToken {

    private String code;

    private String msg;

    private String subCode;

    private String subMsg;

    private AccessTokenData data;

    private String logId;

    public AccessTokenData getData() {
        return data;
    }

    public void setData(AccessTokenData data) {
        this.data = data;
    }

    private String appKey;

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppKey() {
        return appKey;
    }

    public static AccessToken wrapWithAppKey(AccessTokenResponse response, String appKey) {
        AccessToken accessToken = new AccessToken();
        accessToken.data = response.getData();
        accessToken.logId = response.getLogId();
        accessToken.code = response.getCode();
        accessToken.msg = response.getMsg();
        accessToken.subCode = response.getSubCode();
        accessToken.subMsg = response.getSubMsg();
        accessToken.appKey = appKey;
        return accessToken;
    }

    public static AccessToken wrapWithAppKey(RefreshTokenResponse response, String appKey) {
        AccessToken accessToken = new AccessToken();
        accessToken.data = response.getData();
        accessToken.logId = response.getLogId();
        accessToken.code = response.getCode();
        accessToken.msg = response.getMsg();
        accessToken.subCode = response.getSubCode();
        accessToken.subMsg = response.getSubMsg();
        accessToken.appKey = appKey;
        return accessToken;
    }

    public static AccessToken wrapWithAppKey(String accessTokenStr, String refreshTokenStr, String appKey) {
        AccessToken accessToken = new AccessToken();
        AccessTokenData tokenData = new AccessTokenData();
        tokenData.setAccessToken(accessTokenStr);
        tokenData.setRefreshToken(refreshTokenStr);
        accessToken.data = tokenData;
        accessToken.appKey = appKey;
        return accessToken;
    }

//    public static AccessToken wrap(AccessTokenResponse response) {
//        return wrapWithAppKey(response, null);
//    }
//
//
//    public static AccessToken wrap(RefreshTokenResponse response) {
//        return wrapWithAppKey(response, null);
//    }

    public static AccessToken wrap(String accessTokenStr, String refreshTokenStr) {

        return wrapWithAppKey(accessTokenStr, refreshTokenStr, null);
    }

    public boolean isSuccess() {
        return code != null && code.equals("10000");
    }

    public String getAccessToken() {
        if (data != null) {
            return data.getAccessToken();
        }
        return null;
    }

    public Long getExpireIn() {
        if (data != null) {
            return data.getExpiresIn();
        }
        return null;
    }

    public String getScope() {
        if (data != null) {
            return data.getScope();
        }
        return null;
    }

    public String getShopId() {
        if (data  != null) {
            return data.getShopId();
        }
        return null;
    }

    public String getShopName() {
        if (data != null) {
            return data.getShopName();
        }
        return null;
    }

    public String getRefreshToken() {
        if (data != null) {
            return data.getRefreshToken();
        }
        return null;
    }

    public String getAuthorityId() {
        if (data != null) {
            return data.getAuthorityId();
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getSubCode() {
        return subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }
}
