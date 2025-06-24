package com.doudian.open.api.spu_QuerySpu.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ContentItem {


	@SerializedName("content")
	@OpField(desc = "内容", example = "https://p3-ecom-spu.byteimg.com/tos-cn-i-89jsre2ap7/2feb661390654869ab35a2d05fea5472~tplv-89jsre2ap7-image.image")
	private String content;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setContent(String content){
		this.content = content;
	}

	
	public String getContent(){
		return this.content;
	}

}