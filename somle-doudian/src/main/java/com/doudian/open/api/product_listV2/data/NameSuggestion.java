package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class NameSuggestion {


	@SerializedName("after_name")
	@OpField(desc = "改后标题", example = "改后标题")
	private String afterName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setAfterName(String afterName){
		this.afterName = afterName;
	}

	
	public String getAfterName(){
		return this.afterName;
	}

}