package com.doudian.open.api.order_policy.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderPolicyParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单id", example= "6496679971677798670")
	private String orderId;

	@SerializedName("ins_product_id")
	@OpField(required = true , desc = "保单类型枚举值：returnfreight2020v1-运费险；allergyinsurance2021-过敏险；plant7dinsurance2021-绿植养死包赔7天； plant15dinsurance2021-绿植养死包赔15天；insopenbox2022v12b-开箱无忧；foodsafety2022ecom2b-食安保；", example= "returnfreight2020v1")
	private String insProductId;


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

	
	public void setInsProductId(String insProductId){
		this.insProductId = insProductId;
	}

	
	public String getInsProductId(){
		return this.insProductId;
	}

}