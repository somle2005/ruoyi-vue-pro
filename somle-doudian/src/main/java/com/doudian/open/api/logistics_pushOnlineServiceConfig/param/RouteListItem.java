package com.doudian.open.api.logistics_pushOnlineServiceConfig.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RouteListItem {


	@SerializedName("send_address")
	@OpField(required = false , desc = "寄件地址", example= "")
	private SendAddress sendAddress;

	@SerializedName("rece_address")
	@OpField(required = false , desc = "收件地址", example= "")
	private ReceAddress receAddress;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSendAddress(SendAddress sendAddress){
		this.sendAddress = sendAddress;
	}

	
	public SendAddress getSendAddress(){
		return this.sendAddress;
	}

	
	public void setReceAddress(ReceAddress receAddress){
		this.receAddress = receAddress;
	}

	
	public ReceAddress getReceAddress(){
		return this.receAddress;
	}

}