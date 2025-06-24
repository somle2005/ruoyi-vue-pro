package com.doudian.open.api.order_addressModify.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Town {


	@SerializedName("id")
	@OpField(required = false , desc = "镇id", example= "110108")
	private String id;

	@SerializedName("name")
	@OpField(required = false , desc = "镇名称", example= "海淀区")
	private String name;


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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}