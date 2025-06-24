package com.doudian.open.api.product_previewChannelProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductPreviewChannelProductParam {


	@SerializedName("main_product_id")
	@OpField(required = true , desc = "主商品ID", example= "3631654780608339610")
	private Long mainProductId;

	@SerializedName("channel_id")
	@OpField(required = true , desc = "渠道ID", example= "1775199232748660")
	private Long channelId;

	@SerializedName("channel_type")
	@OpField(required = true , desc = "渠道类型", example= "3")
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