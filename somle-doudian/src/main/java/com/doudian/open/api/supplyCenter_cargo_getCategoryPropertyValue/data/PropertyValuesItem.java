package com.doudian.open.api.supplyCenter_cargo_getCategoryPropertyValue.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyValuesItem {


	@SerializedName("property_value_id")
	@OpField(desc = "属性值id", example = "8897")
	private Long propertyValueId;

	@SerializedName("property_value_name")
	@OpField(desc = "属性值名称", example = "XXS")
	private String propertyValueName;

	@SerializedName("value_pic")
	@OpField(desc = "规格值图片", example = "")
	private ValuePic valuePic;


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

	
	public void setValuePic(ValuePic valuePic){
		this.valuePic = valuePic;
	}

	
	public ValuePic getValuePic(){
		return this.valuePic;
	}

}