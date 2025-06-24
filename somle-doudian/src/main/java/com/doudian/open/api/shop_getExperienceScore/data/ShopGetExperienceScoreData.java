package com.doudian.open.api.shop_getExperienceScore.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopGetExperienceScoreData {


	@SerializedName("seller_rating_info")
	@OpField(desc = "体验分总分", example = "")
	private SellerRatingInfo sellerRatingInfo;

	@SerializedName("prod_dsr")
	@OpField(desc = "商品综合评价", example = "")
	private ProdDsr prodDsr;

	@SerializedName("lgt_qreturn_rate")
	@OpField(desc = "发货物流品退率", example = "")
	private LgtQreturnRate lgtQreturnRate;

	@SerializedName("quality_return_rate")
	@OpField(desc = "商品品质退货率得分", example = "")
	private QualityReturnRate qualityReturnRate;

	@SerializedName("collect_ontime_rate")
	@OpField(desc = "揽收时效达成率", example = "")
	private CollectOntimeRate collectOntimeRate;

	@SerializedName("delivery_accomplish_rate")
	@OpField(desc = "运单配送时效达成率", example = "")
	private DeliveryAccomplishRate deliveryAccomplishRate;

	@SerializedName("average_feedback_time")
	@OpField(desc = "飞鸽平均响应时长", example = "")
	private AverageFeedbackTime averageFeedbackTime;

	@SerializedName("aftersale_deal_reach_rate")
	@OpField(desc = "售后处理时长达成率", example = "")
	private AftersaleDealReachRate aftersaleDealReachRate;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSellerRatingInfo(SellerRatingInfo sellerRatingInfo){
		this.sellerRatingInfo = sellerRatingInfo;
	}

	
	public SellerRatingInfo getSellerRatingInfo(){
		return this.sellerRatingInfo;
	}

	
	public void setProdDsr(ProdDsr prodDsr){
		this.prodDsr = prodDsr;
	}

	
	public ProdDsr getProdDsr(){
		return this.prodDsr;
	}

	
	public void setLgtQreturnRate(LgtQreturnRate lgtQreturnRate){
		this.lgtQreturnRate = lgtQreturnRate;
	}

	
	public LgtQreturnRate getLgtQreturnRate(){
		return this.lgtQreturnRate;
	}

	
	public void setQualityReturnRate(QualityReturnRate qualityReturnRate){
		this.qualityReturnRate = qualityReturnRate;
	}

	
	public QualityReturnRate getQualityReturnRate(){
		return this.qualityReturnRate;
	}

	
	public void setCollectOntimeRate(CollectOntimeRate collectOntimeRate){
		this.collectOntimeRate = collectOntimeRate;
	}

	
	public CollectOntimeRate getCollectOntimeRate(){
		return this.collectOntimeRate;
	}

	
	public void setDeliveryAccomplishRate(DeliveryAccomplishRate deliveryAccomplishRate){
		this.deliveryAccomplishRate = deliveryAccomplishRate;
	}

	
	public DeliveryAccomplishRate getDeliveryAccomplishRate(){
		return this.deliveryAccomplishRate;
	}

	
	public void setAverageFeedbackTime(AverageFeedbackTime averageFeedbackTime){
		this.averageFeedbackTime = averageFeedbackTime;
	}

	
	public AverageFeedbackTime getAverageFeedbackTime(){
		return this.averageFeedbackTime;
	}

	
	public void setAftersaleDealReachRate(AftersaleDealReachRate aftersaleDealReachRate){
		this.aftersaleDealReachRate = aftersaleDealReachRate;
	}

	
	public AftersaleDealReachRate getAftersaleDealReachRate(){
		return this.aftersaleDealReachRate;
	}

}