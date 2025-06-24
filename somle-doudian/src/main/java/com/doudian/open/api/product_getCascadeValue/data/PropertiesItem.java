package com.doudian.open.api.product_getCascadeValue.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class PropertiesItem {


	@SerializedName("property_id")
	@OpField(desc = "属性id", example = "134")
	private Long propertyId;

	@SerializedName("property_values")
	@OpField(desc = "属性内容", example = "")
	private List<PropertyValuesItem> propertyValues;

	@SerializedName("has_sub_property")
	@OpField(desc = "是否有下级属性", example = "false")
	private Boolean hasSubProperty;


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

	
	public void setHasSubProperty(Boolean hasSubProperty){
		this.hasSubProperty = hasSubProperty;
	}

	
	public Boolean getHasSubProperty(){
		return this.hasSubProperty;
	}

}