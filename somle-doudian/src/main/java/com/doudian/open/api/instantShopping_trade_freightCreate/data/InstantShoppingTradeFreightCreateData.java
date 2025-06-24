package com.doudian.open.api.instantShopping_trade_freightCreate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class InstantShoppingTradeFreightCreateData {


	@SerializedName("template_id")
	@OpField(desc = "模板id", example = "1")
	private Long templateId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplateId(Long templateId){
		this.templateId = templateId;
	}

	
	public Long getTemplateId(){
		return this.templateId;
	}

}