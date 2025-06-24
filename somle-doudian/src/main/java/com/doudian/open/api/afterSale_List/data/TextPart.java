package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TextPart {


	@SerializedName("logistics_text")
	@OpField(desc = "正向物流发货状态文案", example = "已发货")
	private String logisticsText;

	@SerializedName("aftersale_status_text")
	@OpField(desc = "售后状态文案", example = "待商家审核")
	private String aftersaleStatusText;

	@SerializedName("aftersale_type_text")
	@OpField(desc = "售后类型文案", example = "退货退款")
	private String aftersaleTypeText;

	@SerializedName("return_logistics_text")
	@OpField(desc = "退货物流发货状态文案", example = "已发货")
	private String returnLogisticsText;

	@SerializedName("aftersale_refund_type_text")
	@OpField(desc = "售后退款类型文案", example = "保证金")
	private String aftersaleRefundTypeText;

	@SerializedName("reason_text")
	@OpField(desc = "售后理由文案", example = "无理由退款")
	private String reasonText;

	@SerializedName("bad_item_text")
	@OpField(desc = "坏单比例文案", example = "")
	private String badItemText;

	@SerializedName("arbitrate_status_text")
	@OpField(desc = "仲裁状态文案", example = "")
	private String arbitrateStatusText;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsText(String logisticsText){
		this.logisticsText = logisticsText;
	}

	
	public String getLogisticsText(){
		return this.logisticsText;
	}

	
	public void setAftersaleStatusText(String aftersaleStatusText){
		this.aftersaleStatusText = aftersaleStatusText;
	}

	
	public String getAftersaleStatusText(){
		return this.aftersaleStatusText;
	}

	
	public void setAftersaleTypeText(String aftersaleTypeText){
		this.aftersaleTypeText = aftersaleTypeText;
	}

	
	public String getAftersaleTypeText(){
		return this.aftersaleTypeText;
	}

	
	public void setReturnLogisticsText(String returnLogisticsText){
		this.returnLogisticsText = returnLogisticsText;
	}

	
	public String getReturnLogisticsText(){
		return this.returnLogisticsText;
	}

	
	public void setAftersaleRefundTypeText(String aftersaleRefundTypeText){
		this.aftersaleRefundTypeText = aftersaleRefundTypeText;
	}

	
	public String getAftersaleRefundTypeText(){
		return this.aftersaleRefundTypeText;
	}

	
	public void setReasonText(String reasonText){
		this.reasonText = reasonText;
	}

	
	public String getReasonText(){
		return this.reasonText;
	}

	
	public void setBadItemText(String badItemText){
		this.badItemText = badItemText;
	}

	
	public String getBadItemText(){
		return this.badItemText;
	}

	
	public void setArbitrateStatusText(String arbitrateStatusText){
		this.arbitrateStatusText = arbitrateStatusText;
	}

	
	public String getArbitrateStatusText(){
		return this.arbitrateStatusText;
	}

}