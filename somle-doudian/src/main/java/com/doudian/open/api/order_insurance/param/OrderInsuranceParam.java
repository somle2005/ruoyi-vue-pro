package com.doudian.open.api.order_insurance.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderInsuranceParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单id(可以加A也可以不加）", example= "6496679971677798670")
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