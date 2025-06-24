package com.doudian.open.api.order_deliverTimeChangeTaskInfo.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDeliverTimeChangeTaskInfoParam {


	@SerializedName("shop_order_id")
	@OpField(required = true , desc = "店铺单号", example= "6936452933365274515")
	private String shopOrderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

}