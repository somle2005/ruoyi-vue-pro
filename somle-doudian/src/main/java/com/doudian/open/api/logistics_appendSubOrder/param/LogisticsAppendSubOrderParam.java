package com.doudian.open.api.logistics_appendSubOrder.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogisticsAppendSubOrderParam {


	@SerializedName("track_no")
	@OpField(required = true , desc = "运单号", example= "1343434")
	private String trackNo;

	@SerializedName("logistics_code")
	@OpField(required = true , desc = "物流商编码", example= "shunfeng")
	private String logisticsCode;

	@SerializedName("pack_add_quantity")
	@OpField(required = true , desc = "追加个数", example= "1")
	private Integer packAddQuantity;

	@SerializedName("is_return_full_sub_codes")
	@OpField(required = false , desc = "是否返回全量的子单号", example= "false")
	private Boolean isReturnFullSubCodes;


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

	
	public void setLogisticsCode(String logisticsCode){
		this.logisticsCode = logisticsCode;
	}

	
	public String getLogisticsCode(){
		return this.logisticsCode;
	}

	
	public void setPackAddQuantity(Integer packAddQuantity){
		this.packAddQuantity = packAddQuantity;
	}

	
	public Integer getPackAddQuantity(){
		return this.packAddQuantity;
	}

	
	public void setIsReturnFullSubCodes(Boolean isReturnFullSubCodes){
		this.isReturnFullSubCodes = isReturnFullSubCodes;
	}

	
	public Boolean getIsReturnFullSubCodes(){
		return this.isReturnFullSubCodes;
	}

}