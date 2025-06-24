package com.doudian.open.api.product_updateChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Channel {


	@SerializedName("channel_type")
	@OpField(desc = "渠道类型（3：商家自卖，4：达人带货）", example = "3")
	private Long channelType;

	@SerializedName("channel_id")
	@OpField(desc = "渠道ID", example = "1775199232748660")
	private Long channelId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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