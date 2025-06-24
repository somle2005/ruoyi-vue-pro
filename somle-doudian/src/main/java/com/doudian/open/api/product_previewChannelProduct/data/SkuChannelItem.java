package com.doudian.open.api.product_previewChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuChannelItem {


	@SerializedName("sku_id")
	@OpField(desc = "主品SKU ID", example = "12323232132")
	private Long skuId;

	@SerializedName("name")
	@OpField(desc = "SKU名称", example = "红色")
	private String name;

	@SerializedName("sku_channel")
	@OpField(desc = "渠道品SKU", example = "")
	private SkuChannel skuChannel;

	@SerializedName("sku_main")
	@OpField(desc = "主品SKU", example = "")
	private SkuMain skuMain;

	@SerializedName("status")
	@OpField(desc = "SKU状态0：渠道品有该SKU1：渠道品无该SKU", example = "1")
	private Long status;


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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setSkuChannel(SkuChannel skuChannel){
		this.skuChannel = skuChannel;
	}

	
	public SkuChannel getSkuChannel(){
		return this.skuChannel;
	}

	
	public void setSkuMain(SkuMain skuMain){
		this.skuMain = skuMain;
	}

	
	public SkuMain getSkuMain(){
		return this.skuMain;
	}

	
	public void setStatus(Long status){
		this.status = status;
	}

	
	public Long getStatus(){
		return this.status;
	}

}