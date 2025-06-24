package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Return {


	@SerializedName("tracking_no")
	@OpField(desc = "物流单号", example = "12345")
	private String trackingNo;

	@SerializedName("company_name")
	@OpField(desc = "物流公司名称", example = "顺丰")
	private String companyName;

	@SerializedName("company_code")
	@OpField(desc = "物流公司编码", example = "shunfeng")
	private String companyCode;

	@SerializedName("logistics_time")
	@OpField(desc = "买家填写退货物流时间", example = "1735660800")
	private Long logisticsTime;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

	
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	
	public String getCompanyName(){
		return this.companyName;
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setLogisticsTime(Long logisticsTime){
		this.logisticsTime = logisticsTime;
	}

	
	public Long getLogisticsTime(){
		return this.logisticsTime;
	}

}