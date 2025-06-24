package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PromotionPayAmountDetailsItem {


	@SerializedName("pay_promotion_type")
	@OpField(desc = "支付优惠类型", example = "混合出资-mixed_charge；GovernmentReduce-政府补贴")
	private String payPromotionType;

	@SerializedName("share_cost")
	@OpField(desc = "承担方详情", example = "")
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