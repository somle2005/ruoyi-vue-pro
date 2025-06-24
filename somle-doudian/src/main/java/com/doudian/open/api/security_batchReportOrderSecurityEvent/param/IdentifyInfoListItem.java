package com.doudian.open.api.security_batchReportOrderSecurityEvent.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class IdentifyInfoListItem {


	@SerializedName("name")
	@OpField(required = true , desc = "代表订单某个信息的字段名 (可直接取抖店开放平台返回的订单信息中的字段名)", example= "orderId")
	private String name;

	@SerializedName("encrypted")
	@OpField(required = true , desc = "代表此字段在发送给第三方时是否为加密状态", example= "false")
	private Boolean encrypted;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setEncrypted(Boolean encrypted){
		this.encrypted = encrypted;
	}

	
	public Boolean getEncrypted(){
		return this.encrypted;
	}

}