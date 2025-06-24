package com.doudian.open.api.logistics_getOutRange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ServiceListItem {


	@SerializedName("service_code")
	@OpField(required = false , desc = "code", example= "SVC-INSURE")
	private String serviceCode;

	@SerializedName("service_value")
	@OpField(required = false , desc = "value", example= "100")
	private String serviceValue;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setServiceCode(String serviceCode){
		this.serviceCode = serviceCode;
	}

	
	public String getServiceCode(){
		return this.serviceCode;
	}

	
	public void setServiceValue(String serviceValue){
		this.serviceValue = serviceValue;
	}

	
	public String getServiceValue(){
		return this.serviceValue;
	}

}