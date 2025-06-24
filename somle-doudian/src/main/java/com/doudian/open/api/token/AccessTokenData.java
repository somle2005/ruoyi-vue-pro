package com.doudian.open.api.token;


import com.doudian.open.gson.annotations.SerializedName;

public class AccessTokenData {
    /**
     * 用于调用API的access_token
     * 过期时间为expires_in值
     * 可通过refresh_token刷新获取新的access_token，过期时间仍为expires_in值
     */
    @SerializedName("access_token")
    private String accessToken;

    /**
     * access_token接口调用凭证超时时间，单位（秒），默认有效期：7天
     */
    @SerializedName("expires_in")
    private Long expiresIn;

    /**
     * 授权作用域，使用逗号,分隔。预留字段
     */
    @SerializedName("scope")
    private String scope;

    /**
     * 店铺ID
     */
    @SerializedName("shop_id")
    private String shopId;

    /**
     * 店铺名称
     */
    @SerializedName("shop_name")
    private String shopName;

    /**
     * 用于刷新access_token的刷新令牌（有效期：14 天）
     */
    @SerializedName("refresh_token")
    private String refreshToken;

    public Long getShopBizType() {
        return shopBizType;
    }

    public void setShopBizType(Long shopBizType) {
        this.shopBizType = shopBizType;
    }

    /**
     * 店铺业务类型。0：普通店铺，1：即时零售连锁店，2：即时零售个体店
     */
    @SerializedName("shop_biz_type")
    private Long shopBizType;

    @SerializedName("authority_id")
    private String authorityId;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId;
    }
}
