package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class SpecValuesItem {


	@SerializedName("property_name")
	@OpField(required = true , desc = "颜色", example= "颜色")
	private String propertyName;

	@SerializedName("values")
	@OpField(required = true , desc = "规格值", example= "")
	private List<ValuesItem_4> values;

	@SerializedName("property_id")
	@OpField(required = false , desc = "规格项标准属性id", example= "1234")
	private Long propertyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	
	public String getPropertyName(){
		return this.propertyName;
	}

	
	public void setValues(List<ValuesItem_4> values){
		this.values = values;
	}

	
	public List<ValuesItem_4> getValues(){
		return this.values;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

}