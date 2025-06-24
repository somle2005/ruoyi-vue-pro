package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PlaceholderItem {


	@SerializedName("text")
	@OpField(desc = "占位符文案", example = "防控中心")
	private String text;

	@SerializedName("url")
	@OpField(desc = "占位符跳转链接", example = "略")
	private String url;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setText(String text){
		this.text = text;
	}

	
	public String getText(){
		return this.text;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}