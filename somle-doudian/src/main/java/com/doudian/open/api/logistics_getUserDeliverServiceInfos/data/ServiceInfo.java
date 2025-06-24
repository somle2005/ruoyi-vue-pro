package com.doudian.open.api.logistics_getUserDeliverServiceInfos.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ServiceInfo {


	@SerializedName("service_code")
	@OpField(desc = "GetRecommendedAndDeliveryExpressByOrder", example = "服务code")
	private String serviceCode;

	@SerializedName("service_name")
	@OpField(desc = "GetRecommendedAndDeliveryExpressByOrder", example = "服务名称")
	private String serviceName;


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

	
	public void setServiceName(String serviceName){
		this.serviceName = serviceName;
	}

	
	public String getServiceName(){
		return this.serviceName;
	}

}