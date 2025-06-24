package com.doudian.open.api.order_queryOrderLogistics.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ReverseExpressInfo {


	@SerializedName("express_info")
	@OpField(desc = "快递信息", example = "")
	private ExpressInfo expressInfo;

	@SerializedName("deliver_id")
	@OpField(desc = "包裹ID", example = "1")
	private String deliverId;

	@SerializedName("logistics_no")
	@OpField(desc = "物流单号", example = "1")
	private String logisticsNo;

	@SerializedName("track_no")
	@OpField(desc = "快递单号", example = "1")
	private String trackNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExpressInfo(ExpressInfo expressInfo){
		this.expressInfo = expressInfo;
	}

	
	public ExpressInfo getExpressInfo(){
		return this.expressInfo;
	}

	
	public void setDeliverId(String deliverId){
		this.deliverId = deliverId;
	}

	
	public String getDeliverId(){
		return this.deliverId;
	}

	
	public void setLogisticsNo(String logisticsNo){
		this.logisticsNo = logisticsNo;
	}

	
	public String getLogisticsNo(){
		return this.logisticsNo;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

}