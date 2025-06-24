package com.doudian.open.api.address_update.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressUpdateParam {


	@SerializedName("address")
	@OpField(required = true , desc = "地址信息", example= "")
	private Address address;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店场景需要传门店ID，其他场景默认值0即可", example= "123")
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