package com.doudian.open.core;

import com.doudian.open.api.token.*;
import java.net.URLEncoder;


public class AccessTokenBuilder {

    //店铺授权类型
    public static AccessToken build(Long shopId) {
        return build(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), shopId);
    }

    //非店铺授权类型
    public static AccessToken build(String authId, String authSubjectType) {
        return buildSelfUseGeneric(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), authId, authSubjectType, null);
    }

    public static AccessToken build(String code) {
        return build(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), code);
    }

    public static AccessToken buildWithAppKey(Long shopId, String appKey) {
        return build(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), null, shopId, true, appKey);
    }

    //非店铺授权类型
    public static AccessToken buildWithAppKey(String authId, String authSubjectType, String appKey) {
        return buildSelfUseGeneric(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), authId, authSubjectType, appKey);
    }

    public static AccessToken buildWithAppKey(String code, String appKey) {
        return build(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), code, null, false, appKey);
    }

    public static AccessToken build(DoudianOpConfig config, DoudianOpClient httpClient, Long shopId) {
        return build(config, httpClient, null, shopId, true, null);
    }

    public static AccessToken build(DoudianOpConfig config, DoudianOpClient httpClient, String code) {
        return build(config, httpClient, code, null, false, null);
    }

    public static AccessToken parse(String accessTokenStr) {
        //构造一个AccessTokenResponse
        return parse(accessTokenStr, null);
    }

    public static AccessToken parse(String accessTokenStr, String appKey) {
        //构造一个AccessTokenResponse
        AccessTokenResponse response = new AccessTokenResponse();
        response.setCode("10000");
        AccessTokenData data = new AccessTokenData();
        data.setAccessToken(accessTokenStr);
        response.setData(data);
        return AccessToken.wrapWithAppKey(response, appKey);
    }

    public static AccessToken refresh(AccessToken accessToken) {
        return refresh(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), accessToken, accessToken.getAppKey());
    }

    public static AccessToken refresh(String refreshTokenStr) {
        AccessToken accessToken = AccessToken.wrap(null, refreshTokenStr);
        return refresh(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), accessToken,null);
    }

    public static AccessToken refreshWithAppKey(AccessToken accessToken, String appKey) {
        return refresh(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), accessToken, appKey);
    }

    public static AccessToken refreshWithAppKey(String refreshTokenStr, String appKey) {
        AccessToken accessToken = AccessToken.wrapWithAppKey(null, refreshTokenStr, appKey);
        return refresh(GlobalConfig.getGlobalConfig(), DoudianOpClientHolder.getClient(), accessToken, appKey);
    }

    public static AccessToken refresh(DoudianOpConfig config, DoudianOpClient client, AccessToken accessToken, String appKey) {
        RefreshTokenRequest request = new RefreshTokenRequest();
        request.setConfig(config);
        request.setClient(client);

        request.getParam().setGrantType("refresh_token");
        request.getParam().setRefreshToken(accessToken.getRefreshToken());

        AccessToken ac = null;
        if (appKey != null) {
            ac = new AccessToken();
            ac.setAppKey(appKey);
        }

        RefreshTokenResponse response = request.execute(ac);
        return AccessToken.wrapWithAppKey(response, appKey);
    }

    private static AccessToken build(DoudianOpConfig config, DoudianOpClient client, String code, Long shopId, boolean isSelfAuth, String appKey) {
        AccessTokenRequest request = new AccessTokenRequest();
        if(isSelfAuth){
            request.getParam().setCode("");
            request.getParam().setGrantType("authorization_self");
            request.getParam().setShopId(shopId);
        } else {
            request.getParam().setCode(code);
            request.getParam().setGrantType("authorization_code");
        }
        request.setConfig(config);
        request.setClient(client);

        AccessToken ac = null;
        if (appKey != null) {
            ac = new AccessToken();
            ac.setAppKey(appKey);
        }

        AccessTokenResponse resp = request.execute(ac);
        return AccessToken.wrapWithAppKey(resp, appKey);
    }

    private static AccessToken buildSelfUseGeneric(DoudianOpConfig config, DoudianOpClient client, String authId, String authSubjectType, String appKey) {
        AccessTokenRequest request = new AccessTokenRequest();
        request.getParam().setCode("");
        request.getParam().setGrantType("authorization_self");
        request.getParam().setAuthId(authId);
        request.getParam().setAuthSubjectType(authSubjectType);
        request.setConfig(config);
        request.setClient(client);

        AccessToken ac = null;
        if (appKey != null) {
            ac = new AccessToken();
            ac.setAppKey(appKey);
        }

        AccessTokenResponse resp = request.execute(ac);
        return AccessToken.wrapWithAppKey(resp, appKey);
    }


    private static String getEncodeString(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            //ignore
        }
        return str;
    }

}
