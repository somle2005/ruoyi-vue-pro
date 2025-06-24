package com.doudian.open.api.product_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DeliveryInfosItem {


	@SerializedName("info_type")
	@OpField(desc = "信息类型", example = "weight")
	private String infoType;

	@SerializedName("info_value")
	@OpField(desc = "信息值", example = "100")
	private String infoValue;

	@SerializedName("info_unit")
	@OpField(desc = "信息计量单位", example = "当info_type=weight时，支持mg,g,kg三种类型")
	private String infoUnit;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setInfoType(String infoType){
		this.infoType = infoType;
	}

	
	public String getInfoType(){
		return this.infoType;
	}

	
	public void setInfoValue(String infoValue){
		this.infoValue = infoValue;
	}

	
	public String getInfoValue(){
		return this.infoValue;
	}

	
	public void setInfoUnit(String infoUnit){
		this.infoUnit = infoUnit;
	}

	
	public String getInfoUnit(){
		return this.infoUnit;
	}

}