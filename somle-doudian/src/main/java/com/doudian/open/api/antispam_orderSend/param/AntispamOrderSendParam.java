package com.doudian.open.api.antispam_orderSend.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AntispamOrderSendParam {


	@SerializedName("event_time")
	@OpField(required = true , desc = "事件时间", example= "1624514492")
	private Long eventTime;

	@SerializedName("user")
	@OpField(required = false , desc = "用户", example= "-")
	private User user;

	@SerializedName("params")
	@OpField(required = true , desc = "可变参数", example= "{account_id:12345}")
	private String params;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setParams(String params){
		this.params = params;
	}

	
	public String getParams(){
		return this.params;
	}

}