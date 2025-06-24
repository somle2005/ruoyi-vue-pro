package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductPropertyItem {


	@SerializedName("property_key")
	@OpField(desc = "属性key", example = "")
	private PropertyKey propertyKey;

	@SerializedName("property_value")
	@OpField(desc = "属性值列表", example = "")
	private List<PropertyValueItem> propertyValue;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyKey(PropertyKey propertyKey){
		this.propertyKey = propertyKey;
	}

	
	public PropertyKey getPropertyKey(){
		return this.propertyKey;
	}

	
	public void setPropertyValue(List<PropertyValueItem> propertyValue){
		this.propertyValue = propertyValue;
	}

	
	public List<PropertyValueItem> getPropertyValue(){
		return this.propertyValue;
	}

}