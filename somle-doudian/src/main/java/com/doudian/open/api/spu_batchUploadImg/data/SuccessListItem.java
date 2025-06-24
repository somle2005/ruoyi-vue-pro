package com.doudian.open.api.spu_batchUploadImg.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SuccessListItem {


	@SerializedName("name")
	@OpField(desc = "图片名称", example = "demo2")
	private String name;

	@SerializedName("origin_url")
	@OpField(desc = "入参URL", example = "https://static.runoob.com/images/demo/demo2.jpg")
	private String originUrl;

	@SerializedName("spu_url")
	@OpField(desc = "抖店SPU专用URL", example = "https://p-boe.byted.org/tos-boe-i-c1s52z2b8k/47aae92445314984b27c3854ce2ec569~tplv-c1s52z2b8k-image.image")
	private String spuUrl;


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

	
	public void setOriginUrl(String originUrl){
		this.originUrl = originUrl;
	}

	
	public String getOriginUrl(){
		return this.originUrl;
	}

	
	public void setSpuUrl(String spuUrl){
		this.spuUrl = spuUrl;
	}

	
	public String getSpuUrl(){
		return this.spuUrl;
	}

}