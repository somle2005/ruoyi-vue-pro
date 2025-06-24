package com.doudian.open.api.freightTemplate_create.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ChildrenItem {


	@SerializedName("id")
	@OpField(required = false , desc = "地址id，第一级是省份、第二级是城市、第三级是区、第四级是街道", example= "222222")
	private Long id;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(Long id){
		this.id = id;
	}

	
	public Long getId(){
		return this.id;
	}

}