package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DelayRule {


	@SerializedName("enable")
	@OpField(required = true , desc = "是否开启特殊日期延迟发货", example= "true")
	private Boolean enable;

	@SerializedName("config_type")
	@OpField(required = true , desc = "1 时间点；2 时间范围", example= "1")
	private Integer configType;

	@SerializedName("config_value")
	@OpField(required = true , desc = "特殊日期延迟发货时间最晚发货时间，时间戳，单位秒：当config_type=1时，传时间戳，代表最晚x发货；当config_type=2时，传天数，代表延迟x天发货", example= "1673539199")
	private Long configValue;

	@SerializedName("start_time")
	@OpField(required = true , desc = "特殊日期延迟发货时间下单开始时间，时间戳，单位秒", example= "1643040000")
	private Long startTime;

	@SerializedName("end_time")
	@OpField(required = true , desc = "特殊日期延迟发货时间下单结束时间，时间戳，单位秒", example= "1672502400")
	private Long endTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEnable(Boolean enable){
		this.enable = enable;
	}

	
	public Boolean getEnable(){
		return this.enable;
	}

	
	public void setConfigType(Integer configType){
		this.configType = configType;
	}

	
	public Integer getConfigType(){
		return this.configType;
	}

	
	public void setConfigValue(Long configValue){
		this.configValue = configValue;
	}

	
	public Long getConfigValue(){
		return this.configValue;
	}

	
	public void setStartTime(Long startTime){
		this.startTime = startTime;
	}

	
	public Long getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(Long endTime){
		this.endTime = endTime;
	}

	
	public Long getEndTime(){
		return this.endTime;
	}

}