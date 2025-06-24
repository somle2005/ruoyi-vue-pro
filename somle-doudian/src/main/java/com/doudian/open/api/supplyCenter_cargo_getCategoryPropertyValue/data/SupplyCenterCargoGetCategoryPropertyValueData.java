package com.doudian.open.api.supplyCenter_cargo_getCategoryPropertyValue.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SupplyCenterCargoGetCategoryPropertyValueData {


	@SerializedName("property")
	@OpField(desc = "属性", example = "")
	private Property property;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProperty(Property property){
		this.property = property;
	}

	
	public Property getProperty(){
		return this.property;
	}

}