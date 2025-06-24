package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropMapItem {


	@SerializedName("value")
	@OpField(desc = "value不为0则推荐选择项", example = "无")
	private Long value;

	@SerializedName("name")
	@OpField(desc = "value为0则取name", example = "无")
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