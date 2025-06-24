package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopOrderTagUiItem {


	@SerializedName("extra")
	@OpField(desc = "标签额外信息", example = "标签额外信息")
	private String extra;

	@SerializedName("key")
	@OpField(desc = "标签Key", example = "sug_home_deliver")
	private String key;

	@SerializedName("text")
	@OpField(desc = "标签说明", example = "建议音尊达")
	private String text;

	@SerializedName("help_doc")
	@OpField(desc = "帮助文档地址", example = "http://")
	private String helpDoc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExtra(String extra){
		this.extra = extra;
	}

	
	public String getExtra(){
		return this.extra;
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

	
	public void setText(String text){
		this.text = text;
	}

	
	public String getText(){
		return this.text;
	}

	
	public void setHelpDoc(String helpDoc){
		this.helpDoc = helpDoc;
	}

	
	public String getHelpDoc(){
		return this.helpDoc;
	}

}