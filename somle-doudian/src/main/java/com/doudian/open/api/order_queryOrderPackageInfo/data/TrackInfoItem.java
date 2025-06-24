package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TrackInfoItem {


	@SerializedName("context")
	@OpField(desc = "轨迹文案", example = "包裹已完成出库，来自【XXX仓】")
	private String context;

	@SerializedName("time_stamp")
	@OpField(desc = "unix时间戳", example = "1708659849")
	private Long timeStamp;

	@SerializedName("site")
	@OpField(desc = "站点名称", example = "北京")
	private String site;

	@SerializedName("state")
	@OpField(desc = "轨迹状态code；枚举值详见：https://op.jinritemai.com/docs/question-docs/94/1642", example = "122")
	private String state;

	@SerializedName("state_desc")
	@OpField(desc = "轨迹状态详情", example = "仓库处理中")
	private String stateDesc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setContext(String context){
		this.context = context;
	}

	
	public String getContext(){
		return this.context;
	}

	
	public void setTimeStamp(Long timeStamp){
		this.timeStamp = timeStamp;
	}

	
	public Long getTimeStamp(){
		return this.timeStamp;
	}

	
	public void setSite(String site){
		this.site = site;
	}

	
	public String getSite(){
		return this.site;
	}

	
	public void setState(String state){
		this.state = state;
	}

	
	public String getState(){
		return this.state;
	}

	
	public void setStateDesc(String stateDesc){
		this.stateDesc = stateDesc;
	}

	
	public String getStateDesc(){
		return this.stateDesc;
	}

}