package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DelayRule {


	@SerializedName("config_type")
	@OpField(desc = "支持的配置类型1：代表时间点，此时对应的config_value的值为支持的最晚发货的秒级时间戳2：代表相对时间，此时对应的config_value的值表示支付后几天发货；比如config_value=3表示支付后三天发货", example = "1")
	private Long configType;

	@SerializedName("config_value")
	@OpField(desc = "与规则配置类型对应的配置值", example = "1675353599")
	private Long configValue;

	@SerializedName("start_time")
	@OpField(desc = "规则开始时间", example = "1675353599")
	private Long startTime;

	@SerializedName("end_time")
	@OpField(desc = "规则结束时间", example = "1675353599")
	private Long endTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setConfigType(Long configType){
		this.configType = configType;
	}

	
	public Long getConfigType(){
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