package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExtraPromotionAmountDetailItem {


	@SerializedName("share_cost")
	@OpField(desc = "承担信息", example = "")
	private ShareCost shareCost;

	@SerializedName("promotion_type")
	@OpField(desc = "优惠活动code：freight_discount--运费优惠foodtakeout_shop_freight_discount--外卖运费优惠", example = "freight_discount")
	private String promotionType;

	@SerializedName("promotion_desc")
	@OpField(desc = "优惠活动描述", example = "满20减2元运费")
	private String promotionDesc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setPromotionDesc(String promotionDesc){
		this.promotionDesc = promotionDesc;
	}

	
	public String getPromotionDesc(){
		return this.promotionDesc;
	}

}