package com.doudian.open.msg.logistics_orderTagPush.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderTagListItem {


	@SerializedName("tag_key")
	@OpField(required = false , desc = "订单标签key", example= "PriorityDelivery")
	private String tagKey;

	@SerializedName("tag_reason")
	@OpField(required = false , desc = "订单标签原因", example= "用户催发货")
	private String tagReason;

	@SerializedName("tag_value")
	@OpField(required = false , desc = "订单标签名称", example= "优先发货")
	private String tagValue;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTagKey(String tagKey){
		this.tagKey = tagKey;
	}

	
	public String getTagKey(){
		return this.tagKey;
	}

	
	public void setTagReason(String tagReason){
		this.tagReason = tagReason;
	}

	
	public String getTagReason(){
		return this.tagReason;
	}

	
	public void setTagValue(String tagValue){
		this.tagValue = tagValue;
	}

	
	public String getTagValue(){
		return this.tagValue;
	}

}