package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopRecycleSubsidyAmountInfo {


	@SerializedName("amount_composition_info")
	@OpField(desc = "换新额外补贴金额组成", example = "")
	private AmountCompositionInfo amountCompositionInfo;

	@SerializedName("subsidy_status")
	@OpField(desc = "补贴渠道；1-返金额，2-平台红包", example = "1")
	private Long subsidyStatus;

	@SerializedName("subsidy_channel")
	@OpField(desc = "补贴渠道；1-返金额，2-平台红包", example = "1")
	private Long subsidyChannel;

	@SerializedName("subsidy_amount")
	@OpField(desc = "换新额外补贴，单位：分", example = "100")
	private Long subsidyAmount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAmountCompositionInfo(AmountCompositionInfo amountCompositionInfo){
		this.amountCompositionInfo = amountCompositionInfo;
	}

	
	public AmountCompositionInfo getAmountCompositionInfo(){
		return this.amountCompositionInfo;
	}

	
	public void setSubsidyStatus(Long subsidyStatus){
		this.subsidyStatus = subsidyStatus;
	}

	
	public Long getSubsidyStatus(){
		return this.subsidyStatus;
	}

	
	public void setSubsidyChannel(Long subsidyChannel){
		this.subsidyChannel = subsidyChannel;
	}

	
	public Long getSubsidyChannel(){
		return this.subsidyChannel;
	}

	
	public void setSubsidyAmount(Long subsidyAmount){
		this.subsidyAmount = subsidyAmount;
	}

	
	public Long getSubsidyAmount(){
		return this.subsidyAmount;
	}

}