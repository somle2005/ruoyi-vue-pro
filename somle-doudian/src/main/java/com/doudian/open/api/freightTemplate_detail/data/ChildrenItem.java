package com.doudian.open.api.freightTemplate_detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ChildrenItem {


	@SerializedName("id")
	@OpField(desc = "地址id，第一级是省份、第二级是城市、第三级是区、第四级是街道", example = "1")
	private String id;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setId(String id){
		this.id = id;
	}

	
	public String getId(){
		return this.id;
	}

}