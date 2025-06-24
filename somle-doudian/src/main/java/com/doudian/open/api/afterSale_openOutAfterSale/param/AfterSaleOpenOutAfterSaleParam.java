package com.doudian.open.api.afterSale_openOutAfterSale.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleOpenOutAfterSaleParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "要打开超售后入口的商品单ID", example= "4610000000000000000")
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