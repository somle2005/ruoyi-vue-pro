package com.doudian.open.api.product_getCategoryPropertyValue.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductGetCategoryPropertyValueParam {


	@SerializedName("category_id")
	@OpField(required = true , desc = "类目id", example= "31860")
	private Long categoryId;

	@SerializedName("property_id")
	@OpField(required = true , desc = "属性项id", example= "2176")
	private Long propertyId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setPropertyId(Long propertyId){
		this.propertyId = propertyId;
	}

	
	public Long getPropertyId(){
		return this.propertyId;
	}

}