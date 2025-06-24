package com.doudian.open.api.spu_batchUploadImg.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ImageUrlListItem {


	@SerializedName("name")
	@OpField(required = true , desc = "图片名", example= "demo2")
	private String name;

	@SerializedName("url")
	@OpField(required = true , desc = "公网可访问URL", example= "https://static.runoob.com/images/demo/demo2.jpg")
	private String url;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}