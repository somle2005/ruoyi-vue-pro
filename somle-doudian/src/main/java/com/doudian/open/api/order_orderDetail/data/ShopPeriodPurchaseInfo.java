package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopPeriodPurchaseInfo {


	@SerializedName("deliver_type")
	@OpField(desc = "类型（5预约送达，6预约发货）", example = "5")
	private Long deliverType;

	@SerializedName("period_num")
	@OpField(desc = "总期数", example = "5")
	private Long periodNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setDeliverType(Long deliverType){
		this.deliverType = deliverType;
	}

	
	public Long getDeliverType(){
		return this.deliverType;
	}

	
	public void setPeriodNum(Long periodNum){
		this.periodNum = periodNum;
	}

	
	public Long getPeriodNum(){
		return this.periodNum;
	}

}