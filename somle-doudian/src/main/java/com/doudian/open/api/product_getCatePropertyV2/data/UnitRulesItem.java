package com.doudian.open.api.product_getCatePropertyV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UnitRulesItem {


	@SerializedName("max")
	@OpField(desc = "最大值", example = "10")
	private Double max;

	@SerializedName("min")
	@OpField(desc = "最小值", example = "2")
	private Double min;

	@SerializedName("unit_id")
	@OpField(desc = "单位id", example = "1")
	private Long unitId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMax(Double max){
		this.max = max;
	}

	
	public Double getMax(){
		return this.max;
	}

	
	public void setMin(Double min){
		this.min = min;
	}

	
	public Double getMin(){
		return this.min;
	}

	
	public void setUnitId(Long unitId){
		this.unitId = unitId;
	}

	
	public Long getUnitId(){
		return this.unitId;
	}

}