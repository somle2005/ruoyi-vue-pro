package com.doudian.open.api.product_getPublishProductLimit.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductGetPublishProductLimitParam {


	@SerializedName("first_category_id")
	@OpField(required = false , desc = "一级类目id，可选", example= "20017")
	private Long firstCategoryId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setFirstCategoryId(Long firstCategoryId){
		this.firstCategoryId = firstCategoryId;
	}

	
	public Long getFirstCategoryId(){
		return this.firstCategoryId;
	}

}