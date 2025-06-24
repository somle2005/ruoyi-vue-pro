package com.doudian.open.msg.trade_contractPhoneWithhold.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TradeContractPhoneWithholdParam {


	@SerializedName("request_id")
	@OpField(required = false , desc = "代扣请求唯一ID", example= "xxxxxxx")
	private String requestId;

	@SerializedName("withhold_result")
	@OpField(required = false , desc = "代扣结果，0: 失败，1: 成功", example= "1")
	private Long withholdResult;

	@SerializedName("order_id")
	@OpField(required = false , desc = "合约机订单ID", example= "xxxxxxxxxx")
	private String orderId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	
	public String getRequestId(){
		return this.requestId;
	}

	
	public void setWithholdResult(Long withholdResult){
		this.withholdResult = withholdResult;
	}

	
	public Long getWithholdResult(){
		return this.withholdResult;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

}