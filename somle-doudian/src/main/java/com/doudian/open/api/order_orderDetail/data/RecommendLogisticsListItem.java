package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RecommendLogisticsListItem {


	@SerializedName("logistics_collection_end_time")
	@OpField(desc = "该物流最晚揽收时间（秒级时间戳，精确到分钟）", example = "1730883081")
	private Long logisticsCollectionEndTime;

	@SerializedName("logistics_latest_receipt_time")
	@OpField(desc = "该物流承诺送达时间（秒级时间戳，精确到分钟）", example = "1730883081")
	private Long logisticsLatestReceiptTime;

	@SerializedName("logistics_company_code")
	@OpField(desc = "该订单推荐使用的物流公司code", example = "shunfeng")
	private String logisticsCompanyCode;

	@SerializedName("logistics_company_name")
	@OpField(desc = "该订单推荐使用的物流公司名称", example = "顺丰")
	private String logisticsCompanyName;

	@SerializedName("logistics_company_product_type")
	@OpField(desc = "快递产品类型type", example = "tekuai")
	private String logisticsCompanyProductType;

	@SerializedName("logistics_company_product_type_name")
	@OpField(desc = "快递产品类型名称;", example = "特快")
	private String logisticsCompanyProductTypeName;

	@SerializedName("logistics_recommend_end_ship_time")
	@OpField(desc = "该推荐快递下，建议最晚发货时间时间", example = "1730883081")
	private Long logisticsRecommendEndShipTime;

	@SerializedName("logistics_recommend_start_ship_time")
	@OpField(desc = "该推荐快递下，建议最早发货时间时间", example = "1730883081")
	private Long logisticsRecommendStartShipTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsCollectionEndTime(Long logisticsCollectionEndTime){
		this.logisticsCollectionEndTime = logisticsCollectionEndTime;
	}

	
	public Long getLogisticsCollectionEndTime(){
		return this.logisticsCollectionEndTime;
	}

	
	public void setLogisticsLatestReceiptTime(Long logisticsLatestReceiptTime){
		this.logisticsLatestReceiptTime = logisticsLatestReceiptTime;
	}

	
	public Long getLogisticsLatestReceiptTime(){
		return this.logisticsLatestReceiptTime;
	}

	
	public void setLogisticsCompanyCode(String logisticsCompanyCode){
		this.logisticsCompanyCode = logisticsCompanyCode;
	}

	
	public String getLogisticsCompanyCode(){
		return this.logisticsCompanyCode;
	}

	
	public void setLogisticsCompanyName(String logisticsCompanyName){
		this.logisticsCompanyName = logisticsCompanyName;
	}

	
	public String getLogisticsCompanyName(){
		return this.logisticsCompanyName;
	}

	
	public void setLogisticsCompanyProductType(String logisticsCompanyProductType){
		this.logisticsCompanyProductType = logisticsCompanyProductType;
	}

	
	public String getLogisticsCompanyProductType(){
		return this.logisticsCompanyProductType;
	}

	
	public void setLogisticsCompanyProductTypeName(String logisticsCompanyProductTypeName){
		this.logisticsCompanyProductTypeName = logisticsCompanyProductTypeName;
	}

	
	public String getLogisticsCompanyProductTypeName(){
		return this.logisticsCompanyProductTypeName;
	}

	
	public void setLogisticsRecommendEndShipTime(Long logisticsRecommendEndShipTime){
		this.logisticsRecommendEndShipTime = logisticsRecommendEndShipTime;
	}

	
	public Long getLogisticsRecommendEndShipTime(){
		return this.logisticsRecommendEndShipTime;
	}

	
	public void setLogisticsRecommendStartShipTime(Long logisticsRecommendStartShipTime){
		this.logisticsRecommendStartShipTime = logisticsRecommendStartShipTime;
	}

	
	public Long getLogisticsRecommendStartShipTime(){
		return this.logisticsRecommendStartShipTime;
	}

}