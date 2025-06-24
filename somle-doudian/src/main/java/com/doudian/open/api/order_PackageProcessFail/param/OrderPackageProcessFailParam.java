package com.doudian.open.api.order_PackageProcessFail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderPackageProcessFailParam {


	@SerializedName("order_id")
	@OpField(required = true , desc = "订单号", example= "123456")
	private String orderId;

	@SerializedName("op")
	@OpField(required = false , desc = "风控相关信息", example= "")
	private Op op;


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

	
	public void setOp(Op op){
		this.op = op;
	}

	
	public Op getOp(){
		return this.op;
	}

}