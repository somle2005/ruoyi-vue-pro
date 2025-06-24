package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.Map;

//auto generated, do not edit

public class CampaignInfoItem {


	@SerializedName("extra_map")
	@OpField(desc = "活动额外信息；例如{    instant_custom_info: {instant_open_id:101010}}", example = "{    instant_custom_info: {instant_open_id:101010}}")
	private Map<String,String> extraMap;

	@SerializedName("campaign_activity_id")
	@OpField(desc = "商家活动ID", example = "4781320682406083612")
	private String campaignActivityId;

	@SerializedName("campaign_id")
	@OpField(desc = "活动ID", example = "4781320682406083640")
	private Long campaignId;

	@SerializedName("campaign_type")
	@OpField(desc = "活动类型：7-限时特卖 10-定金预售 11-定金预售尾款部分 13-达人专属价 14-限时限量限人 120-拼团", example = "7")
	private Long campaignType;

	@SerializedName("share_discount_cost")
	@OpField(desc = "成本分摊", example = "")
	private ShareDiscountCost shareDiscountCost;

	@SerializedName("campaign_name")
	@OpField(desc = "活动名称", example = "XXX活动")
	private String campaignName;

	@SerializedName("campaign_amount")
	@OpField(desc = "活动金额（单位：分）", example = "200")
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

	
	public void setCampaignActivityId(String campaignActivityId){
		this.campaignActivityId = campaignActivityId;
	}

	
	public String getCampaignActivityId(){
		return this.campaignActivityId;
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