package com.doudian.open.api.order_mergeV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class MergeListItem {


	@SerializedName("order_id")
	@OpField(required = false , desc = "店铺单id", example= "123123")
	private String orderId;

	@SerializedName("open_address_id")
	@OpField(required = false , desc = "open address id", example= "xxxxxxxxxx")
	private String openAddressId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setOpenAddressId(String openAddressId){
		this.openAddressId = openAddressId;
	}

	
	public String getOpenAddressId(){
		return this.openAddressId;
	}

}