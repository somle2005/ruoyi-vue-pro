package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PromiseTimeDetail {


	@SerializedName("promise_recommend_end_ship_time")
	@OpField(desc = "promise_type=2，承诺发货订单的最晚建议发货时间；", example = "1730883081")
	private Long promiseRecommendEndShipTime;

	@SerializedName("promise_exp_ship_time")
	@OpField(desc = "promise_type=1或者6有值，普通时效订单/预约发货订的最晚发货时间", example = "1730883081")
	private Long promiseExpShipTime;

	@SerializedName("promise_latest_receipt_time")
	@OpField(desc = "promise_type=2或者5，承诺发货订单/预约送达订单的最晚送达时间；", example = "1730883081")
	private Long promiseLatestReceiptTime;

	@SerializedName("promise_appointment_ship_time")
	@OpField(desc = "预约发货时间，promise_type=1或者6，消费者预约或者商家通过飞鸽修改最晚发货时效后存在该值", example = "1730883081")
	private Long promiseAppointmentShipTime;

	@SerializedName("promise_recommend_start_ship_time")
	@OpField(desc = "promise_type=2，承诺发货订单的最早建议发货时间；", example = "1730883081")
	private Long promiseRecommendStartShipTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPromiseRecommendEndShipTime(Long promiseRecommendEndShipTime){
		this.promiseRecommendEndShipTime = promiseRecommendEndShipTime;
	}

	
	public Long getPromiseRecommendEndShipTime(){
		return this.promiseRecommendEndShipTime;
	}

	
	public void setPromiseExpShipTime(Long promiseExpShipTime){
		this.promiseExpShipTime = promiseExpShipTime;
	}

	
	public Long getPromiseExpShipTime(){
		return this.promiseExpShipTime;
	}

	
	public void setPromiseLatestReceiptTime(Long promiseLatestReceiptTime){
		this.promiseLatestReceiptTime = promiseLatestReceiptTime;
	}

	
	public Long getPromiseLatestReceiptTime(){
		return this.promiseLatestReceiptTime;
	}

	
	public void setPromiseAppointmentShipTime(Long promiseAppointmentShipTime){
		this.promiseAppointmentShipTime = promiseAppointmentShipTime;
	}

	
	public Long getPromiseAppointmentShipTime(){
		return this.promiseAppointmentShipTime;
	}

	
	public void setPromiseRecommendStartShipTime(Long promiseRecommendStartShipTime){
		this.promiseRecommendStartShipTime = promiseRecommendStartShipTime;
	}

	
	public Long getPromiseRecommendStartShipTime(){
		return this.promiseRecommendStartShipTime;
	}

}