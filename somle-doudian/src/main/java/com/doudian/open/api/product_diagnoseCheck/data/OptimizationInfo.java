package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OptimizationInfo {


	@SerializedName("default_event_type")
	@OpField(desc = "无", example = "无")
	private List<String> defaultEventType;

	@SerializedName("optimization_key")
	@OpField(desc = "无", example = "无")
	private String optimizationKey;

	@SerializedName("optimization_name")
	@OpField(desc = "无", example = "无")
	private String optimizationName;

	@SerializedName("optimization_status")
	@OpField(desc = "无", example = "无")
	private String optimizationStatus;

	@SerializedName("unavailable_reason")
	@OpField(desc = "无", example = "无")
	private String unavailableReason;

	@SerializedName("default_index_value")
	@OpField(desc = "无", example = "[1,2,3]")
	private List<String> defaultIndexValue;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDefaultEventType(List<String> defaultEventType){
		this.defaultEventType = defaultEventType;
	}

	
	public List<String> getDefaultEventType(){
		return this.defaultEventType;
	}

	
	public void setOptimizationKey(String optimizationKey){
		this.optimizationKey = optimizationKey;
	}

	
	public String getOptimizationKey(){
		return this.optimizationKey;
	}

	
	public void setOptimizationName(String optimizationName){
		this.optimizationName = optimizationName;
	}

	
	public String getOptimizationName(){
		return this.optimizationName;
	}

	
	public void setOptimizationStatus(String optimizationStatus){
		this.optimizationStatus = optimizationStatus;
	}

	
	public String getOptimizationStatus(){
		return this.optimizationStatus;
	}

	
	public void setUnavailableReason(String unavailableReason){
		this.unavailableReason = unavailableReason;
	}

	
	public String getUnavailableReason(){
		return this.unavailableReason;
	}

	
	public void setDefaultIndexValue(List<String> defaultIndexValue){
		this.defaultIndexValue = defaultIndexValue;
	}

	
	public List<String> getDefaultIndexValue(){
		return this.defaultIndexValue;
	}

}