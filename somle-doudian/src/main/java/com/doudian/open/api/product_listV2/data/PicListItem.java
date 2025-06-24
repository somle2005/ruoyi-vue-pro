package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PicListItem {


	@SerializedName("index")
	@OpField(desc = "图片下标", example = "略")
	private Long index;

	@SerializedName("url")
	@OpField(desc = "图片url", example = "略")
	private String url;

	@SerializedName("pic_type")
	@OpField(desc = "图片类型", example = "略")
	private Integer picType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIndex(Long index){
		this.index = index;
	}

	
	public Long getIndex(){
		return this.index;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setPicType(Integer picType){
		this.picType = picType;
	}

	
	public Integer getPicType(){
		return this.picType;
	}

}