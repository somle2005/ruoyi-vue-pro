package com.doudian.open.msg.product_change.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ChannelMainProduct {


	@SerializedName("outer_product_id")
	@OpField(required = false , desc = "主商品的外部商品ID", example= "3488625851803765000")
	private String outerProductId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "主商品的商品ID", example= "3641497799809465271")
	private String productId;

	@SerializedName("channel_type")
	@OpField(required = false , desc = "渠道类型，小时达是2", example= "2")
	private Long channelType;

	@SerializedName("channel_id")
	@OpField(required = false , desc = "渠道ID", example= "1111420330")
	private Long channelId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOuterProductId(String outerProductId){
		this.outerProductId = outerProductId;
	}

	
	public String getOuterProductId(){
		return this.outerProductId;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setChannelType(Long channelType){
		this.channelType = channelType;
	}

	
	public Long getChannelType(){
		return this.channelType;
	}

	
	public void setChannelId(Long channelId){
		this.channelId = channelId;
	}

	
	public Long getChannelId(){
		return this.channelId;
	}

}