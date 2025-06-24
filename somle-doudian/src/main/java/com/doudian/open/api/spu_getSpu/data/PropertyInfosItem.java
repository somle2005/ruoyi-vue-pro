package com.doudian.open.api.spu_getSpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PropertyInfosItem {


	@SerializedName("property_id")
	@OpField(desc = "属性ID", example = "1618")
	private Long propertyId;

	@SerializedName("property_values")
	@OpField(desc = "属性值", example = "")
	private List<PropertyValuesItem> propertyValues;

	@SerializedName("property_name")
	@OpField(desc = "属性名", example = "书名")
	private String propertyName;

	@SerializedName("property_type")
	@OpField(desc = "属性类型，0 绑定属性 1关键属性 2销售属性", example = "1")
	private Long propertyType;


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

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setPropertyType(Long propertyType){
		this.propertyType = propertyType;
	}

	
	public Long getPropertyType(){
		return this.propertyType;
	}

}