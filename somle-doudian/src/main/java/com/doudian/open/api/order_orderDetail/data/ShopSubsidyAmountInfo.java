package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopSubsidyAmountInfo {


	@SerializedName("subsidy_channel")
	@OpField(desc = "补贴渠道；1-返金额，2-平台红包", example = "1")
	private Long subsidyChannel;

	@SerializedName("subsidy_status")
	@OpField(desc = "补贴发送状态; 1-待发送 2-发送中 3-已发送", example = "1")
	private Long subsidyStatus;

	@SerializedName("subsidya_amount")
	@OpField(desc = "补贴金额，单位：分", example = "100")
	private Long subsidyaAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSubsidyChannel(Long subsidyChannel){
		this.subsidyChannel = subsidyChannel;
	}

	
	public Long getSubsidyChannel(){
		return this.subsidyChannel;
	}

	
	public void setSubsidyStatus(Long subsidyStatus){
		this.subsidyStatus = subsidyStatus;
	}

	
	public Long getSubsidyStatus(){
		return this.subsidyStatus;
	}

	
	public void setSubsidyaAmount(Long subsidyaAmount){
		this.subsidyaAmount = subsidyaAmount;
	}

	
	public Long getSubsidyaAmount(){
		return this.subsidyaAmount;
	}

}