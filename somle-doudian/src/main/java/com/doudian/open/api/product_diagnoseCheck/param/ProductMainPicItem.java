package com.doudian.open.api.product_diagnoseCheck.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductMainPicItem {


	@SerializedName("url")
	@OpField(required = false , desc = "图片url", example= "https://p3-aio.ecombdimg.com/obj/ecom-shop-material/png_m_abf25b2634afc5710defa529796f97bd_sx_859041_www600-800")
	private String url;

	@SerializedName("type")
	@OpField(required = false , desc = "图片类型", example= "2")
	private Long type;

	@SerializedName("pic_id")
	@OpField(required = false , desc = "图片id", example= "0")
	private Long picId;


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

	
	public void setType(Long type){
		this.type = type;
	}

	
	public Long getType(){
		return this.type;
	}

	
	public void setPicId(Long picId){
		this.picId = picId;
	}

	
	public Long getPicId(){
		return this.picId;
	}

}