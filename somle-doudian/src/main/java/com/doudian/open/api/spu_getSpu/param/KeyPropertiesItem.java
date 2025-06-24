package com.doudian.open.api.spu_getSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class KeyPropertiesItem {


	@SerializedName("property_id")
	@OpField(required = false , desc = "属性ID", example= "1618")
	private Long propertyId;

	@SerializedName("property_values")
	@OpField(required = false , desc = "属性值", example= "")
	private List<PropertyValuesItem> propertyValues;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

	
	public void setPropertyValues(List<PropertyValuesItem> propertyValues){
		this.propertyValues = propertyValues;
	}

	
	public List<PropertyValuesItem> getPropertyValues(){
		return this.propertyValues;
	}

}