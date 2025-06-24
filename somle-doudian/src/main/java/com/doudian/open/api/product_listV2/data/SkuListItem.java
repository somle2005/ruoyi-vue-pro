package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuListItem {


	@SerializedName("url")
	@OpField(desc = "规格图url", example = "略")
	private String url;

	@SerializedName("title")
	@OpField(desc = "规格名称", example = "略")
	private String title;

	@SerializedName("sku_id")
	@OpField(desc = "skuid", example = "略")
	private Long skuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setTitle(String title){
		this.title = title;
	}

	
	public String getTitle(){
		return this.title;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

}