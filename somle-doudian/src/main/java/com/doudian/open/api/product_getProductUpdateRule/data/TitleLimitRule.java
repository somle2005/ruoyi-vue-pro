package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TitleLimitRule {


	@SerializedName("max_length")
	@OpField(desc = "标题最长长度", example = "60")
	private String maxLength;

	@SerializedName("min_length")
	@OpField(desc = "标题最短长度", example = "0")
	private String minLength;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMaxLength(String maxLength){
		this.maxLength = maxLength;
	}

	
	public String getMaxLength(){
		return this.maxLength;
	}

	
	public void setMinLength(String minLength){
		this.minLength = minLength;
	}

	
	public String getMinLength(){
		return this.minLength;
	}

}