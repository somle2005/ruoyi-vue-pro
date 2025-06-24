package com.doudian.open.api.order_updatePostAmount.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderUpdatePostAmountParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单id", example= "1231231")
	private String orderId;

	@SerializedName("post_amount")
	@OpField(required = true , desc = "邮费", example= "11")
	private Long postAmount;


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

	
	public void setPostAmount(Long postAmount){
		this.postAmount = postAmount;
	}

	
	public Long getPostAmount(){
		return this.postAmount;
	}

}