package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Town {


	@SerializedName("id")
	@OpField(desc = "县ID", example = "34")
	private String id;

	@SerializedName("name")
	@OpField(desc = "县名字", example = "曹县")
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