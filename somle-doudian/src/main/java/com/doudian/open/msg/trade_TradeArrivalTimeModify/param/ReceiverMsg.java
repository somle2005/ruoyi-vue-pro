package com.doudian.open.msg.trade_TradeArrivalTimeModify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReceiverMsg {


	@SerializedName("early_arrival")
	@OpField(required = false , desc = "订单送达时效变更后是否为尽快送达，true-是（配合target_arrival_time字段使用），false-否（配合earliest_receipt_time和latest_receipt_time使用）", example= "true")
	private Boolean earlyArrival;

	@SerializedName("target_arrival_time")
	@OpField(required = false , desc = "订单送达时效变更后尽快送达的时间点，Unix时间戳：秒；当early_arrival=true时使用", example= "1722328184")
	private Long targetArrivalTime;

	@SerializedName("earliest_receipt_time")
	@OpField(required = false , desc = "订单送达时效变更后预约配送单最早送达时间，Unix时间戳：秒；当early_arrival=false时使用", example= "1722328184")
	private Long earliestReceiptTime;

	@SerializedName("latest_receipt_time")
	@OpField(required = false , desc = "订单送达时效变更后预约配送单最晚送达时间，Unix时间戳：秒；当early_arrival=false时使用", example= "1722328184")
	private Long latestReceiptTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setEarlyArrival(Boolean earlyArrival){
		this.earlyArrival = earlyArrival;
	}

	
	public Boolean getEarlyArrival(){
		return this.earlyArrival;
	}

	
	public void setTargetArrivalTime(Long targetArrivalTime){
		this.targetArrivalTime = targetArrivalTime;
	}

	
	public Long getTargetArrivalTime(){
		return this.targetArrivalTime;
	}

	
	public void setEarliestReceiptTime(Long earliestReceiptTime){
		this.earliestReceiptTime = earliestReceiptTime;
	}

	
	public Long getEarliestReceiptTime(){
		return this.earliestReceiptTime;
	}

	
	public void setLatestReceiptTime(Long latestReceiptTime){
		this.latestReceiptTime = latestReceiptTime;
	}

	
	public Long getLatestReceiptTime(){
		return this.latestReceiptTime;
	}

}