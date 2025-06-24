package com.doudian.open.api.order_getCrossBorderFulfillInfo.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderGetCrossBorderFulfillInfoParam {


	@SerializedName("shop_order_id")
	@OpField(required = true , desc = "主订单号(不带A)", example= "4795451507070928840")
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