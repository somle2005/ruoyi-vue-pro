package com.doudian.open.api.token_refresh.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TokenRefreshParam {


	@SerializedName("refresh_token")
	@OpField(required = true , desc = "用于刷新access_token的刷新令牌；有效期：14 天；", example= "82bdc687-eff1-4f63-8444-0b43086c25fd")
	private String refreshToken;

	@SerializedName("grant_type")
	@OpField(required = true , desc = "授权类型；请传入默认值：refresh_token", example= "refresh_token1")
	private String grantType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRefreshToken(String refreshToken){
		this.refreshToken = refreshToken;
	}

	
	public String getRefreshToken(){
		return this.refreshToken;
	}

	
	public void setGrantType(String grantType){
		this.grantType = grantType;
	}

	
	public String getGrantType(){
		return this.grantType;
	}

}