package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SupplyDayReturnSelectorItem {


	@SerializedName("name")
	@OpField(desc = "7天无理由选项名称", example = "七天无理由退货（定制类不支持）")
	private String name;

	@SerializedName("value")
	@OpField(desc = "7天无理由选项值", example = "7-6")
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