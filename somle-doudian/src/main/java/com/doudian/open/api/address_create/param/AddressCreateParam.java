package com.doudian.open.api.address_create.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressCreateParam {


	@SerializedName("address")
	@OpField(required = true , desc = "地址信息", example= "")
	private Address address;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID（新建地址绑定在该门店下，非门店场景无需填写）", example= "123")
	private Long storeId;


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

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}