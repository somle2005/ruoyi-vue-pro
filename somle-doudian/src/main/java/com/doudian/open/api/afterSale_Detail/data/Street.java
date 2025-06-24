package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class Street {


	@SerializedName("id")
	@OpField(desc = "街道ID", example = "342")
	private String id;

	@SerializedName("name")
	@OpField(desc = "街道名字", example = "name")
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