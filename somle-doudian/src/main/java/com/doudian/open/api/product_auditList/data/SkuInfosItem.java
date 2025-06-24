package com.doudian.open.api.product_auditList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuInfosItem {


	@SerializedName("sku_id")
	@OpField(desc = "skuid", example = "skuid")
	private Long skuId;

	@SerializedName("sku_title")
	@OpField(desc = "规格名", example = "规格名")
	private String skuTitle;


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

	
	public void setSkuTitle(String skuTitle){
		this.skuTitle = skuTitle;
	}

	
	public String getSkuTitle(){
		return this.skuTitle;
	}

}