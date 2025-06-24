package com.doudian.open.api.order_getMCToken.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderGetMCTokenData {


	@SerializedName("token")
	@OpField(desc = "前端组件token", example = "ahiosdfhuiq2h41io5j4398ras")
	private String token;

	@SerializedName("expire_time")
	@OpField(desc = "token过期时间，时间戳，秒级", example = "1680522259")
	private Long expireTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setToken(String token){
		this.token = token;
	}

	
	public String getToken(){
		return this.token;
	}

	
	public void setExpireTime(Long expireTime){
		this.expireTime = expireTime;
	}

	
	public Long getExpireTime(){
		return this.expireTime;
	}

}