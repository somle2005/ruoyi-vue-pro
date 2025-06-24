package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DelayRule_4_4 {


	@SerializedName("config_type")
	@OpField(desc = "配置类型", example = "1")
	private Integer configType;

	@SerializedName("config_value")
	@OpField(desc = "配置值", example = "1")
	private Long configValue;

	@SerializedName("start_time")
	@OpField(desc = "商家配置的开始时间", example = "121")
	private Long startTime;

	@SerializedName("end_time")
	@OpField(desc = "商家配置的结束时间", example = "123")
	private Long endTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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