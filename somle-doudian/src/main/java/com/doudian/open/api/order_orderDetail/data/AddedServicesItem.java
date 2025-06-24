package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AddedServicesItem {


	@SerializedName("key")
	@OpField(desc = "标签key", example = "VC-WBHOMEDELIVERY")
	private String key;

	@SerializedName("text")
	@OpField(desc = "物流服务名称", example = "音尊达")
	private String text;

	@SerializedName("help_doc")
	@OpField(desc = "抖音大学介绍地址", example = "抖音大学介绍地址")
	private String helpDoc;

	@SerializedName("url")
	@OpField(desc = "业务跳转地址", example = "http")
	private String url;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setKey(String key){
		this.key = key;
	}

	
	public String getKey(){
		return this.key;
	}

	
	public void setText(String text){
		this.text = text;
	}

	
	public String getText(){
		return this.text;
	}

	
	public void setHelpDoc(String helpDoc){
		this.helpDoc = helpDoc;
	}

	
	public String getHelpDoc(){
		return this.helpDoc;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

}