package com.doudian.open.api.logistics_getUserDeliverServiceInfos.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UserServiceInfosItem {


	@SerializedName("service_info")
	@OpField(desc = "发货服务信息", example = "")
	private ServiceInfo serviceInfo;

	@SerializedName("effect_status")
	@OpField(desc = "0：未生效 1：已生效 2：已失效", example = "开启状态")
	private Integer effectStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setServiceInfo(ServiceInfo serviceInfo){
		this.serviceInfo = serviceInfo;
	}

	
	public ServiceInfo getServiceInfo(){
		return this.serviceInfo;
	}

	
	public void setEffectStatus(Integer effectStatus){
		this.effectStatus = effectStatus;
	}

	
	public Integer getEffectStatus(){
		return this.effectStatus;
	}

}