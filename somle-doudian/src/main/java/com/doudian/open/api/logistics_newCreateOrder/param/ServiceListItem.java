package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ServiceListItem {


	@SerializedName("service_code")
	@OpField(required = false , desc = "增值服务类型", example= "SVC-INSURE")
	private String serviceCode;

	@SerializedName("service_value")
	@OpField(required = false , desc = "增值服务对应的value值，如果增值类型涉及金额会校验，单位：分", example= "{value:2200}")
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