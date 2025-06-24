package com.doudian.open.api.product_getCascadeValue.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyValuesItem {


	@SerializedName("property_value_id")
	@OpField(desc = "属性值id", example = "153")
	private Long propertyValueId;

	@SerializedName("property_value_name")
	@OpField(desc = "属性值名称", example = "华为P40")
	private String propertyValueName;

	@SerializedName("cascade_id")
	@OpField(desc = "级联id", example = "1234")
	private Long cascadeId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyValueId(Long propertyValueId){
		this.propertyValueId = propertyValueId;
	}

	
	public Long getPropertyValueId(){
		return this.propertyValueId;
	}

	
	public void setPropertyValueName(String propertyValueName){
		this.propertyValueName = propertyValueName;
	}

	
	public String getPropertyValueName(){
		return this.propertyValueName;
	}

	
	public void setCascadeId(Long cascadeId){
		this.cascadeId = cascadeId;
	}

	
	public Long getCascadeId(){
		return this.cascadeId;
	}

}