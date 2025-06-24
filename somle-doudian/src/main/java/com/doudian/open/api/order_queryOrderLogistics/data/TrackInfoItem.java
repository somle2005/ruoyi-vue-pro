package com.doudian.open.api.order_queryOrderLogistics.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TrackInfoItem {


	@SerializedName("context")
	@OpField(desc = "轨迹文案", example = "1")
	private String context;

	@SerializedName("time_stamp")
	@OpField(desc = "状态变更时间", example = "1")
	private Long timeStamp;

	@SerializedName("site")
	@OpField(desc = "站点信息", example = "1")
	private String site;

	@SerializedName("state")
	@OpField(desc = "物流状态", example = "1")
	private String state;

	@SerializedName("state_desc")
	@OpField(desc = "物流状态描述", example = "1")
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