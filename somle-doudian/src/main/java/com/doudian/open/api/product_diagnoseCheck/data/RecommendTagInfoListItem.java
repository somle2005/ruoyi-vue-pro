package com.doudian.open.api.product_diagnoseCheck.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class RecommendTagInfoListItem {


	@SerializedName("tag_type")
	@OpField(desc = "hot normal", example = "无")
	private String tagType;

	@SerializedName("name")
	@OpField(desc = "推荐词内容", example = "无")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTagType(String tagType){
		this.tagType = tagType;
	}

	
	public String getTagType(){
		return this.tagType;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}