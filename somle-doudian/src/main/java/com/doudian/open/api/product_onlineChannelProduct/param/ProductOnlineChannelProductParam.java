package com.doudian.open.api.product_onlineChannelProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductOnlineChannelProductParam {


	@SerializedName("main_product_id")
	@OpField(required = true , desc = "主商品ID", example= "3631537689540566918")
	private Long mainProductId;

	@SerializedName("channel_id")
	@OpField(required = true , desc = "渠道ID", example= "1775544218362132")
	private Long channelId;

	@SerializedName("channel_type")
	@OpField(required = true , desc = "渠道类型。不支持修改。3：商家自卖4：达人带货", example= "3")
	private Long channelType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMainProductId(Long mainProductId){
		this.mainProductId = mainProductId;
	}

	
	public Long getMainProductId(){
		return this.mainProductId;
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

}