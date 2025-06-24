package com.doudian.open.api.logistics_trackNoRouteDetail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsTrackNoRouteDetailParam {


	@SerializedName("logistics_code")
	@OpField(required = true , desc = "物流商编码；需使用【/order/logisticsCompanyList】接口响应参数中的code；", example= "shentong")
	private String logisticsCode;

	@SerializedName("track_no")
	@OpField(required = true , desc = "运单号；可使用电子面单接口获取返回的单号查询【/logistics/newCreateOrder】或商家店铺后台查看", example= "78393454")
	private String trackNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

}