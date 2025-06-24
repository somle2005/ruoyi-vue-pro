package com.doudian.open.api.product_GetRecommendCategory.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PicItem {


	@SerializedName("url")
	@OpField(required = true , desc = "图片链接，必须是素材中心的url", example= "https://p3-aio.ecombdimg.com/obj/ecom-shop-material/v1_GhxlaZ_70852585116381186630419_c55b8401b00e96e4114431a1dbd7c99c_sx_582346_www1000-1000")
	private String url;


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

}