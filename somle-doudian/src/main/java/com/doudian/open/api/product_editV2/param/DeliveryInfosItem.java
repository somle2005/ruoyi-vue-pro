package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DeliveryInfosItem {


	@SerializedName("info_unit")
	@OpField(required = false , desc = "信息计量单位", example= "1")
	private String infoUnit;

	@SerializedName("info_value")
	@OpField(required = false , desc = "信息值", example= "1")
	private String infoValue;

	@SerializedName("info_type")
	@OpField(required = false , desc = "信息类型", example= "1")
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