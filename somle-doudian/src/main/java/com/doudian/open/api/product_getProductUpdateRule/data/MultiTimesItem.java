package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MultiTimesItem {


	@SerializedName("time_desc")
	@OpField(desc = "时效描述", example = "5天内发")
	private String timeDesc;

	@SerializedName("time_type")
	@OpField(desc = "时效", example = "5")
	private Long timeType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTimeDesc(String timeDesc){
		this.timeDesc = timeDesc;
	}

	
	public String getTimeDesc(){
		return this.timeDesc;
	}

	
	public void setTimeType(Long timeType){
		this.timeType = timeType;
	}

	
	public Long getTimeType(){
		return this.timeType;
	}

}