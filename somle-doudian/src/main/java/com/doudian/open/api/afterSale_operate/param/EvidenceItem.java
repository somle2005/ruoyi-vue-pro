package com.doudian.open.api.afterSale_operate.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class EvidenceItem {


	@SerializedName("type")
	@OpField(required = false , desc = "凭证类型，1:图片，2:视频(暂不支持)，3:音频(暂不支持展示)，4:文字(暂不支持展示)。“用户可见备注”为remark字段", example= "0")
	private Integer type;

	@SerializedName("url")
	@OpField(required = false , desc = "凭证url", example= "http://xxxxxxxx.jpg")
	private String url;

	@SerializedName("desc")
	@OpField(required = false , desc = "凭证描述", example= "过敏部位图片")
	private String desc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setType(Integer type){
		this.type = type;
	}

	
	public Integer getType(){
		return this.type;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setDesc(String desc){
		this.desc = desc;
	}

	
	public String getDesc(){
		return this.desc;
	}

}