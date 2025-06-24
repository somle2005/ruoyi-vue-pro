package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuPeriodPurchaseInfo {


	@SerializedName("period_num")
	@OpField(desc = "当前期数", example = "1")
	private Long periodNum;

	@SerializedName("deliver_type")
	@OpField(desc = "类型（5预约送达，6预约发货）", example = "5")
	private Long deliverType;

	@SerializedName("deliver_time")
	@OpField(desc = "预约时间（时间戳，单位秒）", example = "1243254354")
	private Long deliverTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPeriodNum(Long periodNum){
		this.periodNum = periodNum;
	}

	
	public Long getPeriodNum(){
		return this.periodNum;
	}

	
	public void setDeliverType(Long deliverType){
		this.deliverType = deliverType;
	}

	
	public Long getDeliverType(){
		return this.deliverType;
	}

	
	public void setDeliverTime(Long deliverTime){
		this.deliverTime = deliverTime;
	}

	
	public Long getDeliverTime(){
		return this.deliverTime;
	}

}