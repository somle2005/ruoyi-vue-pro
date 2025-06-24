package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class UserTagUiItem {


	@SerializedName("key")
	@OpField(desc = "标签key", example = "user_profile_buy_frequency")
	private String key;

	@SerializedName("text")
	@OpField(desc = "标签名称", example = "服务优先")
	private String text;


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

}