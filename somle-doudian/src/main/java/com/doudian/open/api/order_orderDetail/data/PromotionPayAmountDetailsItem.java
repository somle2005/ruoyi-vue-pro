package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PromotionPayAmountDetailsItem {


	@SerializedName("pay_promotion_type")
	@OpField(desc = "优惠类型，mixed_charge-混合出资；GovernmentReduce-政府补贴。", example = "GovernmentReduce")
	private String payPromotionType;

	@SerializedName("share_cost")
	@OpField(desc = "承担方。", example = "")
	private ShareCost_5_5 shareCost;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPayPromotionType(String payPromotionType){
		this.payPromotionType = payPromotionType;
	}

	
	public String getPayPromotionType(){
		return this.payPromotionType;
	}

	
	public void setShareCost(ShareCost_5_5 shareCost){
		this.shareCost = shareCost;
	}

	
	public ShareCost_5_5 getShareCost(){
		return this.shareCost;
	}

}