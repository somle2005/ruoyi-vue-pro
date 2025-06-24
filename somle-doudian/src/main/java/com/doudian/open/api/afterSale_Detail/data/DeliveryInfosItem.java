package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DeliveryInfosItem {


	@SerializedName("info_unit")
	@OpField(desc = "g", example = "单位")
	private String infoUnit;

	@SerializedName("info_value")
	@OpField(desc = "220", example = "值")
	private String infoValue;

	@SerializedName("info_type")
	@OpField(desc = "weight", example = "类型")
	private String infoType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setInfoUnit(String infoUnit){
		this.infoUnit = infoUnit;
	}

	
	public String getInfoUnit(){
		return this.infoUnit;
	}

	
	public void setInfoValue(String infoValue){
		this.infoValue = infoValue;
	}

	
	public String getInfoValue(){
		return this.infoValue;
	}

	
	public void setInfoType(String infoType){
		this.infoType = infoType;
	}

	
	public String getInfoType(){
		return this.infoType;
	}

}