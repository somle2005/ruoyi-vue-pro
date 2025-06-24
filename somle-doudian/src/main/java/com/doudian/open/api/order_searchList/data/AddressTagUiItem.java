package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddressTagUiItem {


	@SerializedName("key")
	@OpField(desc = "双地址标签 key", example = "double_address")
	private String key;

	@SerializedName("text")
	@OpField(desc = "双地址", example = "双地址")
	private String text;

	@SerializedName("hover_text")
	@OpField(desc = "双地址 hover 提示", example = "用户选择的省、市、区/县、街道与填写的详细地址层级不一致，可能为双地址")
	private String hoverText;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setHoverText(String hoverText){
		this.hoverText = hoverText;
	}

	
	public String getHoverText(){
		return this.hoverText;
	}

}