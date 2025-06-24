package com.doudian.open.api.token_refresh.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TokenRefreshData {


	@SerializedName("access_token")
	@OpField(desc = "用于调用API的access_token 过期时间为expires_in值 可通过refresh_token刷新获取新的access_token，过期时间仍为expires_in值", example = "82bdc687-eff1-4f63-8444-0b43086c25fd")
	private String accessToken;

	@SerializedName("expires_in")
	@OpField(desc = "access_token过期时间；Unix时间戳：秒", example = "530808")
	private Long expiresIn;

	@SerializedName("refresh_token")
	@OpField(desc = "用于刷新access_token的刷新令牌（有效期：14 天）", example = "ed14a703-1f27-4a0b-9b94-759242744ec8")
	private String refreshToken;

	@SerializedName("scope")
	@OpField(desc = "权限范围", example = "SCOPE")
	private String scope;

	@SerializedName("shop_id")
	@OpField(desc = "店铺ID", example = "222")
	private Long shopId;

	@SerializedName("shop_name")
	@OpField(desc = "店铺名称", example = "测试店铺")
	private String shopName;

	@SerializedName("authority_id")
	@OpField(desc = "授权ID,店铺授权为店铺id，达人授权为达人id；", example = "1321324")
	private String authorityId;

	@SerializedName("auth_subject_type")
	@OpField(desc = "授权主体类型", example = "WuLiuShang")
	private String authSubjectType;

	@SerializedName("shop_biz_type")
	@OpField(desc = "店铺业务类型。0：普通店铺，1：即时零售连锁店，2：即时零售个体店", example = "0")
	private Long shopBizType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAccessToken(String accessToken){
		this.accessToken = accessToken;
	}

	
	public String getAccessToken(){
		return this.accessToken;
	}

	
	public void setExpiresIn(Long expiresIn){
		this.expiresIn = expiresIn;
	}

	
	public Long getExpiresIn(){
		return this.expiresIn;
	}

	
	public void setRefreshToken(String refreshToken){
		this.refreshToken = refreshToken;
	}

	
	public String getRefreshToken(){
		return this.refreshToken;
	}

	
	public void setScope(String scope){
		this.scope = scope;
	}

	
	public String getScope(){
		return this.scope;
	}

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

	
	public void setShopName(String shopName){
		this.shopName = shopName;
	}

	
	public String getShopName(){
		return this.shopName;
	}

	
	public void setAuthorityId(String authorityId){
		this.authorityId = authorityId;
	}

	
	public String getAuthorityId(){
		return this.authorityId;
	}

	
	public void setAuthSubjectType(String authSubjectType){
		this.authSubjectType = authSubjectType;
	}

	
	public String getAuthSubjectType(){
		return this.authSubjectType;
	}

	
	public void setShopBizType(Long shopBizType){
		this.shopBizType = shopBizType;
	}

	
	public Long getShopBizType(){
		return this.shopBizType;
	}

}