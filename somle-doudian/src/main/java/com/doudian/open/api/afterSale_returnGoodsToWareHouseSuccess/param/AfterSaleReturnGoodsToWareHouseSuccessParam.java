package com.doudian.open.api.afterSale_returnGoodsToWareHouseSuccess.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleReturnGoodsToWareHouseSuccessParam {


	@SerializedName("aftersale_id")
	@OpField(required = true , desc = "售后单Id", example= "12345")
	private String aftersaleId;

	@SerializedName("op_time")
	@OpField(required = true , desc = "商家确认退货入仓时间，Unix时间戳，时间为秒", example= "1627905819")
	private Long opTime;

	@SerializedName("tracking_no")
	@OpField(required = false , desc = "用户退货物流单号", example= "SF12334")
	private String trackingNo;

	@SerializedName("logistics_company_code")
	@OpField(required = false , desc = "物流公司代号", example= "shunfeng")
	private String logisticsCompanyCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAftersaleId(String aftersaleId){
		this.aftersaleId = aftersaleId;
	}

	
	public String getAftersaleId(){
		return this.aftersaleId;
	}

	
	public void setOpTime(Long opTime){
		this.opTime = opTime;
	}

	
	public Long getOpTime(){
		return this.opTime;
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

	
	public void setLogisticsCompanyCode(String logisticsCompanyCode){
		this.logisticsCompanyCode = logisticsCompanyCode;
	}

	
	public String getLogisticsCompanyCode(){
		return this.logisticsCompanyCode;
	}

}