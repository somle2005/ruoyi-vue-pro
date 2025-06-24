package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RecycleActualAmountInfo {


	@SerializedName("send_status")
	@OpField(desc = "回收款发放状态1-已发放", example = "1")
	private Long sendStatus;

	@SerializedName("send_channel")
	@OpField(desc = "回收款发放渠道1-抖音钱包", example = "1")
	private Long sendChannel;

	@SerializedName("actual_amount")
	@OpField(desc = "实际回收价；单位：分", example = "1")
	private Long actualAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSendStatus(Long sendStatus){
		this.sendStatus = sendStatus;
	}

	
	public Long getSendStatus(){
		return this.sendStatus;
	}

	
	public void setSendChannel(Long sendChannel){
		this.sendChannel = sendChannel;
	}

	
	public Long getSendChannel(){
		return this.sendChannel;
	}

	
	public void setActualAmount(Long actualAmount){
		this.actualAmount = actualAmount;
	}

	
	public Long getActualAmount(){
		return this.actualAmount;
	}

}