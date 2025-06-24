package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductChannelInfo {


	@SerializedName("product_channel_type")
	@OpField(desc = "3--商家自卖4且skuordertagui有kol_exclusive_product标签---专属达人带货4且无标签--达人带货", example = "4")
	private Long productChannelType;

	@SerializedName("product_channel_id")
	@OpField(desc = "渠道商品id", example = "6709347328")
	private String productChannelId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductChannelType(Long productChannelType){
		this.productChannelType = productChannelType;
	}

	
	public Long getProductChannelType(){
		return this.productChannelType;
	}

	
	public void setProductChannelId(String productChannelId){
		this.productChannelId = productChannelId;
	}

	
	public String getProductChannelId(){
		return this.productChannelId;
	}

}