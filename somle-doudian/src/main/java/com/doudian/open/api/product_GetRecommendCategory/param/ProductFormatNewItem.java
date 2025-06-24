package com.doudian.open.api.product_GetRecommendCategory.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductFormatNewItem {


	@SerializedName("value")
	@OpField(required = false , desc = "属性id", example= "32314111111")
	private Long value;

	@SerializedName("name")
	@OpField(required = false , desc = "属性名称", example= "衣长1")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setValue(Long value){
		this.value = value;
	}

	
	public Long getValue(){
		return this.value;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}