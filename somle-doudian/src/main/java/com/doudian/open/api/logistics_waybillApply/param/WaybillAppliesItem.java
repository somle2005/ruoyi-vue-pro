package com.doudian.open.api.logistics_waybillApply.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WaybillAppliesItem {


	@SerializedName("logistics_code")
	@OpField(required = true , desc = "物流公司编码", example= "1")
	private String logisticsCode;

	@SerializedName("track_no")
	@OpField(required = true , desc = "运单号", example= "1")
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