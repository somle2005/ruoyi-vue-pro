package com.doudian.open.api.order_queryOrderLogistics.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderQueryOrderLogisticsParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "店铺单号", example= "123456789")
	private String orderId;


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

}