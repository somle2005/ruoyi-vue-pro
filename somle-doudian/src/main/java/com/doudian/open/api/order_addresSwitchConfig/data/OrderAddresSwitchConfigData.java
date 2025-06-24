package com.doudian.open.api.order_addresSwitchConfig.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderAddresSwitchConfigData {


	@SerializedName("authorized_status")
	@OpField(desc = "0: 商家当前未开启审核 1:商家当前已开启审核，但本应用不可进行审核 2:商家当前已开启审核，且本应用可审核", example = "0")
	private Long authorizedStatus;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAuthorizedStatus(Long authorizedStatus){
		this.authorizedStatus = authorizedStatus;
	}

	
	public Long getAuthorizedStatus(){
		return this.authorizedStatus;
	}

}