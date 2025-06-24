package com.doudian.open.api.logistics_newCreateOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReceiverInfo {


	@SerializedName("address")
	@OpField(required = true , desc = "收件人地址信息", example= "")
	private Address_4_4 address;

	@SerializedName("contact")
	@OpField(required = true , desc = "收件人联系信息", example= "")
	private Contact contact;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddress(Address_4_4 address){
		this.address = address;
	}

	
	public Address_4_4 getAddress(){
		return this.address;
	}

	
	public void setContact(Contact contact){
		this.contact = contact;
	}

	
	public Contact getContact(){
		return this.contact;
	}

}