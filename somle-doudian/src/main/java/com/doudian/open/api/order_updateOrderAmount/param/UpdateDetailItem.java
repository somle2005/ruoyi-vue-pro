package com.doudian.open.api.order_updateOrderAmount.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UpdateDetailItem {


	@SerializedName("order_id")
	@OpField(required = false , desc = "", example= "")
	private String orderId;

	@SerializedName("discount_amount")
	@OpField(required = false , desc = "", example= "")
	private Long discountAmount;


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

	
	public void setDiscountAmount(Long discountAmount){
		this.discountAmount = discountAmount;
	}

	
	public Long getDiscountAmount(){
		return this.discountAmount;
	}

}