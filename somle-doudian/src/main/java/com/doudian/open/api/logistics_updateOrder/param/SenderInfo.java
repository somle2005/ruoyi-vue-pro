package com.doudian.open.api.logistics_updateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SenderInfo {


	@SerializedName("contact")
	@OpField(required = false , desc = "寄件人联系信息", example= "")
	private Contact contact;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setContact(Contact contact){
		this.contact = contact;
	}

	
	public Contact getContact(){
		return this.contact;
	}

}