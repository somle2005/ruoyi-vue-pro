package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class FullDiscountInfoItem_6_6 {


	@SerializedName("extra_map")
	@OpField(desc = "营销优惠扩展字段instant_activity_id是商家营销活动id", example = "{aftersaleReturnType:whole,business_scene_key:,conditionType:2,conditionValue:500,couponType:0,credit:400,discountType:2,discountValue:400,instant_custom_info:{instant_activity_id:1111684352258},promotion_desc:满5减4,tool_code:shop_coupon}")
	private Map<String,String> extraMap;

	@SerializedName("campaign_id")
	@OpField(desc = "活动ID", example = "4781320682406083640")
	private Long campaignId;

	@SerializedName("campaign_type")
	@OpField(desc = "活动类型：100-店铺满减活动 110-平台满减活动 150-立减活动", example = "150")
	private Long campaignType;

	@SerializedName("share_discount_cost")
	@OpField(desc = "成本分摊", example = "")
	private ShareDiscountCost shareDiscountCost;

	@SerializedName("campaign_name")
	@OpField(desc = "活动名称", example = "XXX活动")
	private String campaignName;

	@SerializedName("campaign_amount")
	@OpField(desc = "活动优惠金额（单位：分）", example = "200")
	private Long campaignAmount;

	@SerializedName("campaign_sub_type")
	@OpField(desc = "活动子类型：0-店铺活动，1-平台活动", example = "1")
	private Long campaignSubType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExtraMap(Map<String,String> extraMap){
		this.extraMap = extraMap;
	}

	
	public Map<String,String> getExtraMap(){
		return this.extraMap;
	}

	
	public void setCampaignId(Long campaignId){
		this.campaignId = campaignId;
	}

	
	public Long getCampaignId(){
		return this.campaignId;
	}

	
	public void setCampaignType(Long campaignType){
		this.campaignType = campaignType;
	}

	
	public Long getCampaignType(){
		return this.campaignType;
	}

	
	public void setShareDiscountCost(ShareDiscountCost shareDiscountCost){
		this.shareDiscountCost = shareDiscountCost;
	}

	
	public ShareDiscountCost getShareDiscountCost(){
		return this.shareDiscountCost;
	}

	
	public void setCampaignName(String campaignName){
		this.campaignName = campaignName;
	}

	
	public String getCampaignName(){
		return this.campaignName;
	}

	
	public void setCampaignAmount(Long campaignAmount){
		this.campaignAmount = campaignAmount;
	}

	
	public Long getCampaignAmount(){
		return this.campaignAmount;
	}

	
	public void setCampaignSubType(Long campaignSubType){
		this.campaignSubType = campaignSubType;
	}

	
	public Long getCampaignSubType(){
		return this.campaignSubType;
	}

}