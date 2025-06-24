package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExpressInfoListItem {


	@SerializedName("tail_Info")
	@OpField(desc = "超长单", example = "")
	private TailInfo tailInfo;

	@SerializedName("ccr_Info")
	@OpField(desc = "物流负向反馈率（狭义）", example = "")
	private CcrInfo ccrInfo;

	@SerializedName("rank_route")
	@OpField(desc = "此线路上该物流商排名", example = "1")
	private Integer rankRoute;

	@SerializedName("undeliverable_reason")
	@OpField(desc = "是否可用（含不可达与线路机构异常）", example = "服务不可达")
	private String undeliverableReason;

	@SerializedName("express")
	@OpField(desc = "物流商编码", example = "zhongtong")
	private String express;

	@SerializedName("is_deliverable")
	@OpField(desc = "是否可达", example = "true")
	private Boolean isDeliverable;

	@SerializedName("is_shop_eBill")
	@OpField(desc = "是否订购电子面单", example = "true")
	private Boolean isShopEBill;

	@SerializedName("is_recommended")
	@OpField(desc = "是否推荐", example = "true")
	private Boolean isRecommended;

	@SerializedName("collect_sign_info")
	@OpField(desc = "时长维度的推荐原因", example = "")
	private CollectSignInfo collectSignInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTailInfo(TailInfo tailInfo){
		this.tailInfo = tailInfo;
	}

	
	public TailInfo getTailInfo(){
		return this.tailInfo;
	}

	
	public void setCcrInfo(CcrInfo ccrInfo){
		this.ccrInfo = ccrInfo;
	}

	
	public CcrInfo getCcrInfo(){
		return this.ccrInfo;
	}

	
	public void setRankRoute(Integer rankRoute){
		this.rankRoute = rankRoute;
	}

	
	public Integer getRankRoute(){
		return this.rankRoute;
	}

	
	public void setUndeliverableReason(String undeliverableReason){
		this.undeliverableReason = undeliverableReason;
	}

	
	public String getUndeliverableReason(){
		return this.undeliverableReason;
	}

	
	public void setExpress(String express){
		this.express = express;
	}

	
	public String getExpress(){
		return this.express;
	}

	
	public void setIsDeliverable(Boolean isDeliverable){
		this.isDeliverable = isDeliverable;
	}

	
	public Boolean getIsDeliverable(){
		return this.isDeliverable;
	}

	
	public void setIsShopEBill(Boolean isShopEBill){
		this.isShopEBill = isShopEBill;
	}

	
	public Boolean getIsShopEBill(){
		return this.isShopEBill;
	}

	
	public void setIsRecommended(Boolean isRecommended){
		this.isRecommended = isRecommended;
	}

	
	public Boolean getIsRecommended(){
		return this.isRecommended;
	}

	
	public void setCollectSignInfo(CollectSignInfo collectSignInfo){
		this.collectSignInfo = collectSignInfo;
	}

	
	public CollectSignInfo getCollectSignInfo(){
		return this.collectSignInfo;
	}

}