package com.doudian.open.api.logistics_createSFOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class WaybillNoInfoListItem {


	@SerializedName("waybill_type")
	@OpField(desc = "运单号类型: 1：母单 2 :子单 3 : 签回单", example = "2")
	private Integer waybillType;

	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "UT290000008742")
	private String trackNo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setWaybillType(Integer waybillType){
		this.waybillType = waybillType;
	}

	
	public Integer getWaybillType(){
		return this.waybillType;
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

}