package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductChannelInfo {


	@SerializedName("product_channel_type")
	@OpField(desc = "3--商家自卖4且skuordertag中有kol_exclusive_product标签：专属达人带货；无标签的channeltype =4为达人带货", example = "4")
	private Long productChannelType;

	@SerializedName("product_channel_id")
	@OpField(desc = "渠道商品id", example = "6832432432")
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