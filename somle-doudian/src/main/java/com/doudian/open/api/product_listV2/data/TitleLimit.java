package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TitleLimit {


	@SerializedName("min_length")
	@OpField(desc = "商品标题最短长度", example = "0")
	private Long minLength;

	@SerializedName("max_length")
	@OpField(desc = "商品标题最长长度", example = "60")
	private Long maxLength;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMinLength(Long minLength){
		this.minLength = minLength;
	}

	
	public Long getMinLength(){
		return this.minLength;
	}

	
	public void setMaxLength(Long maxLength){
		this.maxLength = maxLength;
	}

	
	public Long getMaxLength(){
		return this.maxLength;
	}

}