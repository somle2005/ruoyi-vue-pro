package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleDetailData {


	@SerializedName("process_info")
	@OpField(desc = "售后单及相关信息", example = "")
	private ProcessInfo processInfo;

	@SerializedName("order_info")
	@OpField(desc = "售后单关联订单信息", example = "")
	private OrderInfo orderInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProcessInfo(ProcessInfo processInfo){
		this.processInfo = processInfo;
	}

	
	public ProcessInfo getProcessInfo(){
		return this.processInfo;
	}

	
	public void setOrderInfo(OrderInfo orderInfo){
		this.orderInfo = orderInfo;
	}

	
	public OrderInfo getOrderInfo(){
		return this.orderInfo;
	}

}