package com.doudian.open.api.product_getCategoryPropertyValue.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class Property {


	@SerializedName("property_values")
	@OpField(desc = "属性值", example = "")
	private List<PropertyValuesItem> propertyValues;

	@SerializedName("property_id")
	@OpField(desc = "属性id", example = "123")
	private Long propertyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyValues(List<PropertyValuesItem> propertyValues){
		this.propertyValues = propertyValues;
	}

	
	public List<PropertyValuesItem> getPropertyValues(){
		return this.propertyValues;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

}