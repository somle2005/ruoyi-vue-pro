package com.doudian.open.api.sku_detail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuDetailParam {


	@SerializedName("sku_id")
	@OpField(required = false , desc = "sku id", example= "1234")
	private Long skuId;

	@SerializedName("code")
	@OpField(required = false , desc = "sku code", example= "cccc")
	private String code;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

}