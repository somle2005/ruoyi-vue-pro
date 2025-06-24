package com.doudian.open.api.open_getAuthInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenGetAuthInfoData {


	@SerializedName("status")
	@OpField(desc = "授权状态，1为正常。枚举为0:待商家确认，1:正常，2:取消，3:过期。授权状态为正常时，需额外判断auth_end_time", example = "1")
	private Integer status;

	@SerializedName("auth_success_time")
	@OpField(desc = "授权生效时间", example = "1681351741")
	private Long authSuccessTime;

	@SerializedName("auth_end_time")
	@OpField(desc = "授权截止时间", example = "1681351741")
	private Long authEndTime;

	@SerializedName("auth_id")
	@OpField(desc = "授权主体ID", example = "12121212")
	private String authId;

	@SerializedName("auth_update_time")
	@OpField(desc = "授权最近一次更新时间", example = "1681351741")
	private Long authUpdateTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStatus(Integer status){
		this.status = status;
	}

	
	public Integer getStatus(){
		return this.status;
	}

	
	public void setAuthSuccessTime(Long authSuccessTime){
		this.authSuccessTime = authSuccessTime;
	}

	
	public Long getAuthSuccessTime(){
		return this.authSuccessTime;
	}

	
	public void setAuthEndTime(Long authEndTime){
		this.authEndTime = authEndTime;
	}

	
	public Long getAuthEndTime(){
		return this.authEndTime;
	}

	
	public void setAuthId(String authId){
		this.authId = authId;
	}

	
	public String getAuthId(){
		return this.authId;
	}

	
	public void setAuthUpdateTime(Long authUpdateTime){
		this.authUpdateTime = authUpdateTime;
	}

	
	public Long getAuthUpdateTime(){
		return this.authUpdateTime;
	}

}