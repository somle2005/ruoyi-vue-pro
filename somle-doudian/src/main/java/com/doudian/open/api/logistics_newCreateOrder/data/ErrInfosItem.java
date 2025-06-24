package com.doudian.open.api.logistics_newCreateOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ErrInfosItem {


	@SerializedName("order_id")
	@OpField(desc = "订单号", example = "1")
	private String orderId;

	@SerializedName("pack_id")
	@OpField(desc = "包裹id", example = "1")
	private String packId;

	@SerializedName("err_code")
	@OpField(desc = "错误码", example = "10701")
	private String errCode;

	@SerializedName("err_msg")
	@OpField(desc = "错误信息", example = "电子面单库存不足")
	private String errMsg;

	@SerializedName("order_channel")
	@OpField(desc = "2；详情请看文档映射表", example = "2")
	private String orderChannel;


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

	
	public void setPackId(String packId){
		this.packId = packId;
	}

	
	public String getPackId(){
		return this.packId;
	}

	
	public void setErrCode(String errCode){
		this.errCode = errCode;
	}

	
	public String getErrCode(){
		return this.errCode;
	}

	
	public void setErrMsg(String errMsg){
		this.errMsg = errMsg;
	}

	
	public String getErrMsg(){
		return this.errMsg;
	}

	
	public void setOrderChannel(String orderChannel){
		this.orderChannel = orderChannel;
	}

	
	public String getOrderChannel(){
		return this.orderChannel;
	}

}