package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExtraPromotionAmountDetailItem {


	@SerializedName("promotion_desc")
	@OpField(desc = "满20减元运费", example = "优惠描述")
	private String promotionDesc;

	@SerializedName("share_cost")
	@OpField(desc = "金额承担方", example = "")
	private ShareCost shareCost;

	@SerializedName("promotion_type")
	@OpField(desc = "freight_discount--运费优惠foodtakeout_shop_freight_discount--外卖运费优惠", example = "优惠类型")
	private String promotionType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPromotionDesc(String promotionDesc){
		this.promotionDesc = promotionDesc;
	}

	
	public String getPromotionDesc(){
		return this.promotionDesc;
	}

	
	public void setShareCost(ShareCost shareCost){
		this.shareCost = shareCost;
	}

	
	public ShareCost getShareCost(){
		return this.shareCost;
	}

	
	public void setPromotionType(String promotionType){
		this.promotionType = promotionType;
	}

	
	public String getPromotionType(){
		return this.promotionType;
	}

}