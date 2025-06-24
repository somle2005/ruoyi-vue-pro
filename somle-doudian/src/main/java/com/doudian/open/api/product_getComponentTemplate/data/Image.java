package com.doudian.open.api.product_getComponentTemplate.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Image {


	@SerializedName("url")
	@OpField(desc = "图片url", example = "http://xxxx")
	private String url;

	@SerializedName("width")
	@OpField(desc = "图片宽度", example = "250")
	private Integer width;

	@SerializedName("height")
	@OpField(desc = "图片长度", example = "256")
	private Integer height;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setWidth(Integer width){
		this.width = width;
	}

	
	public Integer getWidth(){
		return this.width;
	}

	
	public void setHeight(Integer height){
		this.height = height;
	}

	
	public Integer getHeight(){
		return this.height;
	}

}