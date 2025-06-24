package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ThreeGuarantees {


	@SerializedName("duration")
	@OpField(required = false , desc = "售后天数", example= "180")
	private Long duration;

	@SerializedName("service_type")
	@OpField(required = false , desc = "服务类型 1-寄修 2-延保", example= "1")
	private Long serviceType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDuration(Long duration){
		this.duration = duration;
	}

	
	public Long getDuration(){
		return this.duration;
	}

	
	public void setServiceType(Long serviceType){
		this.serviceType = serviceType;
	}

	
	public Long getServiceType(){
		return this.serviceType;
	}

}