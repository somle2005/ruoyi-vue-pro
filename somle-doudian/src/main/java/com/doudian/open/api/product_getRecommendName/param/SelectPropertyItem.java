package com.doudian.open.api.product_getRecommendName.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SelectPropertyItem {


	@SerializedName("value")
	@OpField(required = true , desc = "属性id", example= "27182")
	private Long value;

	@SerializedName("name")
	@OpField(required = true , desc = "属性名称", example= "钛钢")
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