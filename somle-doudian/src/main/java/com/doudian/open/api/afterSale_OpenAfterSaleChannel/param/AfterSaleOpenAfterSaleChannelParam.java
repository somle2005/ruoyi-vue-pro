package com.doudian.open.api.afterSale_OpenAfterSaleChannel.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleOpenAfterSaleChannelParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单ID", example= "4810811637262779447")
	private Long orderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderId(Long orderId){
		this.orderId = orderId;
	}

	
	public Long getOrderId(){
		return this.orderId;
	}

}