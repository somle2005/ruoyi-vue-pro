package com.doudian.open.api.promise_SaveTemplate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExtraInfo {


	@SerializedName("is_protocol_accepted")
	@OpField(required = false , desc = "是否同意了协议", example= "true")
	private Boolean isProtocolAccepted;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsProtocolAccepted(Boolean isProtocolAccepted){
		this.isProtocolAccepted = isProtocolAccepted;
	}

	
	public Boolean getIsProtocolAccepted(){
		return this.isProtocolAccepted;
	}

}