package com.doudian.open.api.logistics_queryPackageRoute.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TrackRoutesItem {


	@SerializedName("content")
	@OpField(desc = "内容", example = "【深圳市】 快件离开 【深圳南山】 已发往 【南充中转站】")
	private String content;

	@SerializedName("state")
	@OpField(desc = "状态", example = "0")
	private String state;

	@SerializedName("state_time")
	@OpField(desc = "时间", example = "1642421380")
	private Long stateTime;

	@SerializedName("opcode")
	@OpField(desc = "code", example = "TRANS_ARRIVE")
	private String opcode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setContent(String content){
		this.content = content;
	}

	
	public String getContent(){
		return this.content;
	}

	
	public void setState(String state){
		this.state = state;
	}

	
	public String getState(){
		return this.state;
	}

	
	public void setStateTime(Long stateTime){
		this.stateTime = stateTime;
	}

	
	public Long getStateTime(){
		return this.stateTime;
	}

	
	public void setOpcode(String opcode){
		this.opcode = opcode;
	}

	
	public String getOpcode(){
		return this.opcode;
	}

}