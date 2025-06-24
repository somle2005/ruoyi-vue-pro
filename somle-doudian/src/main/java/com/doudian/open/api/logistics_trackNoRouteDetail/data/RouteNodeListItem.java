package com.doudian.open.api.logistics_trackNoRouteDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RouteNodeListItem {


	@SerializedName("content")
	@OpField(desc = "轨迹内容", example = "配送中")
	private String content;

	@SerializedName("timestamp")
	@OpField(desc = "时间戳；单位：秒", example = "161324234234")
	private String timestamp;

	@SerializedName("state")
	@OpField(desc = "轨迹状态code；枚举值详见：https://op.jinritemai.com/docs/question-docs/94/1642", example = "1")
	private String state;

	@SerializedName("state_description")
	@OpField(desc = "轨迹状态描述", example = "配送")
	private String stateDescription;

	@SerializedName("site_name")
	@OpField(desc = "站点名称", example = "北京")
	private String siteName;


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

	
	public void setTimestamp(String timestamp){
		this.timestamp = timestamp;
	}

	
	public String getTimestamp(){
		return this.timestamp;
	}

	
	public void setState(String state){
		this.state = state;
	}

	
	public String getState(){
		return this.state;
	}

	
	public void setStateDescription(String stateDescription){
		this.stateDescription = stateDescription;
	}

	
	public String getStateDescription(){
		return this.stateDescription;
	}

	
	public void setSiteName(String siteName){
		this.siteName = siteName;
	}

	
	public String getSiteName(){
		return this.siteName;
	}

}