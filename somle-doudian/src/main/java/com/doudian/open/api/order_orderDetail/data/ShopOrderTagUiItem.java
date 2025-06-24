package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ShopOrderTagUiItem {


	@SerializedName("hover_text")
	@OpField(desc = "标签 hover 信息", example = "标签 hover 信息")
	private String hoverText;

	@SerializedName("extra")
	@OpField(desc = "标签额外信息", example = "标签额外信息")
	private String extra;

	@SerializedName("key")
	@OpField(desc = "标签key", example = "标签key")
	private String key;

	@SerializedName("text")
	@OpField(desc = "标签名称", example = "推荐音尊达")
	private String text;

	@SerializedName("help_doc")
	@OpField(desc = "帮助文档", example = "帮助文档")
	private String helpDoc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setHoverText(String hoverText){
		this.hoverText = hoverText;
	}

	
	public String getHoverText(){
		return this.hoverText;
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