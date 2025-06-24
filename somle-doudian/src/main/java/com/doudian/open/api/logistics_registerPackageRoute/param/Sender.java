package com.doudian.open.api.logistics_registerPackageRoute.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Sender {


	@SerializedName("contact")
	@OpField(required = true , desc = "联系人", example= "")
	private Contact contact;

	@SerializedName("address")
	@OpField(required = false , desc = "地址", example= "")
	private Address address;


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

	
	public void setAddress(Address address){
		this.address = address;
	}

	
	public Address getAddress(){
		return this.address;
	}

}