package com.doudian.open.api.spu_getSpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SalePropertiesItem {


	@SerializedName("property_id")
	@OpField(desc = "属性ID", example = "1998")
	private Long propertyId;

	@SerializedName("property_name")
	@OpField(desc = "属性名", example = "颜色")
	private String propertyName;

	@SerializedName("value_id")
	@OpField(desc = "属性值ID", example = "0")
	private Long valueId;

	@SerializedName("value_name")
	@OpField(desc = "属性值", example = "红色")
	private String valueName;


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

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setValueId(Long valueId){
		this.valueId = valueId;
	}

	
	public Long getValueId(){
		return this.valueId;
	}

	
	public void setValueName(String valueName){
		this.valueName = valueName;
	}

	
	public String getValueName(){
		return this.valueName;
	}

}