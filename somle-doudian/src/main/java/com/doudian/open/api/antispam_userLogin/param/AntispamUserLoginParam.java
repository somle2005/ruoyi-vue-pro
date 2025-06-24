package com.doudian.open.api.antispam_userLogin.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AntispamUserLoginParam {


	@SerializedName("params")
	@OpField(required = true , desc = "json 字符串", example= "{aid:1128}")
	private String params;

	@SerializedName("event_time")
	@OpField(required = true , desc = "事件发生的时间", example= "1624430601")
	private Long eventTime;

	@SerializedName("user")
	@OpField(required = false , desc = "用户", example= "-")
	private User user;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setParams(String params){
		this.params = params;
	}

	
	public String getParams(){
		return this.params;
	}

	
	public void setEventTime(Long eventTime){
		this.eventTime = eventTime;
	}

	
	public Long getEventTime(){
		return this.eventTime;
	}

	
	public void setUser(User user){
		this.user = user;
	}

	
	public User getUser(){
		return this.user;
	}

}