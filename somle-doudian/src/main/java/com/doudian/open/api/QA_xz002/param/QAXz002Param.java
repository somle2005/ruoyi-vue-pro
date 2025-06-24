package com.doudian.open.api.QA_xz002.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class QAXz002Param {


	@SerializedName("order_tag")
	@OpField(required = true , desc = "wojiu777", example= "wojiu777")
	private String orderTag;

	@SerializedName("tags")
	@OpField(required = true , desc = "wojiu777", example= "wojiu777")
	private List<String> tags;

	@SerializedName("is_searchable")
	private Boolean isSearchable;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderTag(String orderTag){
		this.orderTag = orderTag;
	}

	
	public String getOrderTag(){
		return this.orderTag;
	}

	
	public void setTags(List<String> tags){
		this.tags = tags;
	}

	
	public List<String> getTags(){
		return this.tags;
	}

	
	public void setIsSearchable(Boolean isSearchable){
		this.isSearchable = isSearchable;
	}

	
	public Boolean getIsSearchable(){
		return this.isSearchable;
	}

}