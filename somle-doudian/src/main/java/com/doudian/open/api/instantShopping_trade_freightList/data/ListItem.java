package com.doudian.open.api.instantShopping_trade_freightList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ListItem {


	@SerializedName("template")
	@OpField(desc = "模板", example = "")
	private Template template;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTemplate(Template template){
		this.template = template;
	}

	
	public Template getTemplate(){
		return this.template;
	}

}