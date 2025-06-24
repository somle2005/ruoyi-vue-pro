package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProcessInfo {


	@SerializedName("after_sale_info")
	@OpField(desc = "售后单信息", example = "")
	private AfterSaleInfo afterSaleInfo;

	@SerializedName("arbitrate_info")
	@OpField(desc = "仲裁信息", example = "")
	private ArbitrateInfo arbitrateInfo;

	@SerializedName("after_sale_service_tag")
	@OpField(desc = "售后标签", example = "")
	private AfterSaleServiceTag afterSaleServiceTag;

	@SerializedName("logistics_info")
	@OpField(desc = "物流信息", example = "")
	private LogisticsInfo logisticsInfo;

	@SerializedName("after_sale_shop_remarks")
	@OpField(desc = "售后备注", example = "")
	private List<AfterSaleShopRemarksItem> afterSaleShopRemarks;

	@SerializedName("price_protection_detail")
	@OpField(desc = "价保详情", example = "")
	private PriceProtectionDetail priceProtectionDetail;

	@SerializedName("record_logs_list")
	@OpField(desc = "协商记录", example = "")
	private List<RecordLogsListItem> recordLogsList;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAfterSaleInfo(AfterSaleInfo afterSaleInfo){
		this.afterSaleInfo = afterSaleInfo;
	}

	
	public AfterSaleInfo getAfterSaleInfo(){
		return this.afterSaleInfo;
	}

	
	public void setArbitrateInfo(ArbitrateInfo arbitrateInfo){
		this.arbitrateInfo = arbitrateInfo;
	}

	
	public ArbitrateInfo getArbitrateInfo(){
		return this.arbitrateInfo;
	}

	
	public void setAfterSaleServiceTag(AfterSaleServiceTag afterSaleServiceTag){
		this.afterSaleServiceTag = afterSaleServiceTag;
	}

	
	public AfterSaleServiceTag getAfterSaleServiceTag(){
		return this.afterSaleServiceTag;
	}

	
	public void setLogisticsInfo(LogisticsInfo logisticsInfo){
		this.logisticsInfo = logisticsInfo;
	}

	
	public LogisticsInfo getLogisticsInfo(){
		return this.logisticsInfo;
	}

	
	public void setAfterSaleShopRemarks(List<AfterSaleShopRemarksItem> afterSaleShopRemarks){
		this.afterSaleShopRemarks = afterSaleShopRemarks;
	}

	
	public List<AfterSaleShopRemarksItem> getAfterSaleShopRemarks(){
		return this.afterSaleShopRemarks;
	}

	
	public void setPriceProtectionDetail(PriceProtectionDetail priceProtectionDetail){
		this.priceProtectionDetail = priceProtectionDetail;
	}

	
	public PriceProtectionDetail getPriceProtectionDetail(){
		return this.priceProtectionDetail;
	}

	
	public void setRecordLogsList(List<RecordLogsListItem> recordLogsList){
		this.recordLogsList = recordLogsList;
	}

	
	public List<RecordLogsListItem> getRecordLogsList(){
		return this.recordLogsList;
	}

}