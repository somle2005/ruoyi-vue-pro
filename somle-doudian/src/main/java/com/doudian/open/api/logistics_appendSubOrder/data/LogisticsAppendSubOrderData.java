package com.doudian.open.api.logistics_appendSubOrder.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsAppendSubOrderData {


	@SerializedName("track_no")
	@OpField(desc = "运单号", example = "sf2343434")
	private String trackNo;

	@SerializedName("pack_quantity")
	@OpField(desc = "子母单数量", example = "20")
	private Long packQuantity;

	@SerializedName("sub_waybill_codes")
	@OpField(desc = "新追加的子单号", example = "1,2,3")
	private String subWaybillCodes;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTrackNo(String trackNo){
		this.trackNo = trackNo;
	}

	
	public String getTrackNo(){
		return this.trackNo;
	}

	
	public void setPackQuantity(Long packQuantity){
		this.packQuantity = packQuantity;
	}

	
	public Long getPackQuantity(){
		return this.packQuantity;
	}

	
	public void setSubWaybillCodes(String subWaybillCodes){
		this.subWaybillCodes = subWaybillCodes;
	}

	
	public String getSubWaybillCodes(){
		return this.subWaybillCodes;
	}

}