package com.doudian.open.api.order_searchList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class TextItem {


	@SerializedName("id")
	@OpField(desc = "id", example = "1")
	private Long id;

	@SerializedName("key")
	@OpField(desc = "key", example = "order_id")
	private String key;

	@SerializedName("content")
	@OpField(desc = "content", example = "1234567")
	private String content;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

	
	public void setContent(String content){
		this.content = content;
	}

	
	public String getContent(){
		return this.content;
	}

}