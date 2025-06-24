package com.doudian.open.api.spu_createSpu.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ContentItem {


	@SerializedName("content")
	@OpField(required = true , desc = "素材内容（/spu/batchUploadImg返回的URL）", example= "https://p3-ecom-spu.byteimg.com/tos-cn-i-89jsre2ap7/dc491713470d4d6c8e49733f20283e18~tplv-89jsre2ap7-image.image")
	private String content;

	@SerializedName("name")
	@OpField(required = true , desc = "文件的名称", example= "主图1")
	private String name;


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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}