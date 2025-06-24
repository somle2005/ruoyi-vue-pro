package com.doudian.open.api.order_downloadSettleItemToShop.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderDownloadSettleItemToShopParam {


	@SerializedName("start_time")
	@OpField(required = true , desc = "开始时间", example= "2021-02-01 17:06:49")
	private String startTime;

	@SerializedName("end_time")
	@OpField(required = true , desc = "结束时间", example= "2021-03-21 17:06:49")
	private String endTime;

	@SerializedName("time_type")
	@OpField(required = true , desc = "时间类型 0:结算时间 1：下单时间", example= "0")
	private String timeType;

	@SerializedName("order_id")
	@OpField(required = false , desc = "订单ID", example= "1222333333")
	private String orderId;

	@SerializedName("bill_id")
	@OpField(required = false , desc = "字段已作废,勿填", example= "1234555")
	private String billId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID", example= "123456")
	private String productId;

	@SerializedName("pay_type")
	@OpField(required = false , desc = "结算账户 0:全部 1:微信（升级前） 2:微信 3:支付宝 4:合众支付 5:聚合账户", example= "0")
	private String payType;

	@SerializedName("flow_type")
	@OpField(required = false , desc = "业务类型，不传则默认为0 0:全部 1:鲁班广告, 2:值点商城, 3:精选联盟  4:小店自卖", example= "0")
	private String flowType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	
	public String getStartTime(){
		return this.startTime;
	}

	
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	
	public String getEndTime(){
		return this.endTime;
	}

	
	public void setTimeType(String timeType){
		this.timeType = timeType;
	}

	
	public String getTimeType(){
		return this.timeType;
	}

	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}

	
	public String getOrderId(){
		return this.orderId;
	}

	
	public void setBillId(String billId){
		this.billId = billId;
	}

	
	public String getBillId(){
		return this.billId;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setPayType(String payType){
		this.payType = payType;
	}

	
	public String getPayType(){
		return this.payType;
	}

	
	public void setFlowType(String flowType){
		this.flowType = flowType;
	}

	
	public String getFlowType(){
		return this.flowType;
	}

}