package com.doudian.open.api.product_addCbProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class QualityAttachmentsItem {


	@SerializedName("media_type")
	@OpField(required = false , desc = "1-图片，2-pdf", example= "1")
	private Long mediaType;

	@SerializedName("url")
	@OpField(required = false , desc = "凭证url", example= "http://www.byted***.com/YYYY")
	private String url;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setMediaType(Long mediaType){
		this.mediaType = mediaType;
	}

	
	public Long getMediaType(){
		return this.mediaType;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}