package com.doudian.open.api.product_addSchema.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuItem {


	@SerializedName("sku_id")
	@OpField(desc = "skuID", example = "123")
	private Long skuId;

	@SerializedName("out_sku_id")
	@OpField(desc = "外部skuID", example = "123")
	private Long outSkuId;

	@SerializedName("outer_sku_id")
	@OpField(desc = "外部skuID", example = "1234")
	private String outerSkuId;

	@SerializedName("code")
	@OpField(desc = "外部skuID", example = "1234")
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

	
	public void setOutSkuId(Long outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public Long getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setOuterSkuId(String outerSkuId){
		this.outerSkuId = outerSkuId;
	}

	
	public String getOuterSkuId(){
		return this.outerSkuId;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

}