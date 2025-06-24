package com.doudian.open.api.address_delAftersaleAddress.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressDelAftersaleAddressParam {


	@SerializedName("address_id")
	@OpField(required = true , desc = "地址ID，通过/address/list获取到的地址信息对应的address_id字段", example= "1356")
	private Long addressId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAddressId(Long addressId){
		this.addressId = addressId;
	}

	
	public Long getAddressId(){
		return this.addressId;
	}

}