package com.doudian.open.api.order_serviceDetail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderServiceDetailParam {


	@SerializedName("service_id")
	@OpField(required = true , desc = "服务请求列表中获取的id", example= "123")
	private Long serviceId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setServiceId(Long serviceId){
		this.serviceId = serviceId;
	}

	
	public Long getServiceId(){
		return this.serviceId;
	}

}