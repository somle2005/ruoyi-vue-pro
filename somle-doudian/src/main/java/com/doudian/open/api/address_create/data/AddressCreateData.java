package com.doudian.open.api.address_create.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressCreateData {


	@SerializedName("address_id")
	@OpField(desc = "新建地址ID", example = "10000")
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