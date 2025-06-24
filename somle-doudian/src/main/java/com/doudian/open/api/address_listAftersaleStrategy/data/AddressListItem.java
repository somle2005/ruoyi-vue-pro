package com.doudian.open.api.address_listAftersaleStrategy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressListItem {


	@SerializedName("address")
	@OpField(desc = "具体地址信息;", example = "")
	private Address address;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddress(Address address){
		this.address = address;
	}

	
	public Address getAddress(){
		return this.address;
	}

}