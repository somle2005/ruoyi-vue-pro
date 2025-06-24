package com.doudian.open.msg.product_InfoChange.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ChannelInfo {


	@SerializedName("channel_id")
	@OpField(required = false , desc = "渠道ID channel_type=2的情况下表示超市门店ID", example= "35312")
	private Long channelId;

	@SerializedName("channel_type")
	@OpField(required = false , desc = "2-超市", example= "2")
	private Long channelType;

	@SerializedName("channel_main_product_id")
	@OpField(required = false , desc = "渠道商品的主商品ID", example= "34234112123")
	private Long channelMainProductId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setChannelId(Long channelId){
		this.channelId = channelId;
	}

	
	public Long getChannelId(){
		return this.channelId;
	}

	
	public void setChannelType(Long channelType){
		this.channelType = channelType;
	}

	
	public Long getChannelType(){
		return this.channelType;
	}

	
	public void setChannelMainProductId(Long channelMainProductId){
		this.channelMainProductId = channelMainProductId;
	}

	
	public Long getChannelMainProductId(){
		return this.channelMainProductId;
	}

}