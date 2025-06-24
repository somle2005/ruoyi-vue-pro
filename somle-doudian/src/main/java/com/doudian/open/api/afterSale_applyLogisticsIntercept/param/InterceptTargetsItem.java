package com.doudian.open.api.afterSale_applyLogisticsIntercept.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class InterceptTargetsItem {


	@SerializedName("company_code")
	@OpField(required = true , desc = "物流公司编码", example= "yuantong")
	private String companyCode;

	@SerializedName("tracking_no")
	@OpField(required = true , desc = "物流单号", example= "YT1387990014325")
	private String trackingNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCompanyCode(String companyCode){
		this.companyCode = companyCode;
	}

	
	public String getCompanyCode(){
		return this.companyCode;
	}

	
	public void setTrackingNo(String trackingNo){
		this.trackingNo = trackingNo;
	}

	
	public String getTrackingNo(){
		return this.trackingNo;
	}

}