package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuSpecItem {


	@SerializedName("name")
	@OpField(desc = "规格类型名称", example = "颜色")
	private String name;

	@SerializedName("value")
	@OpField(desc = "规格值", example = "白")
	private String value;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
	}

}