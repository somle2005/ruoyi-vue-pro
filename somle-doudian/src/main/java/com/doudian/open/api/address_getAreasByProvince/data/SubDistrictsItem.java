package com.doudian.open.api.address_getAreasByProvince.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SubDistrictsItem {


	@SerializedName("code")
	@OpField(desc = "镇或者街道ID", example = "410522107")
	private Long code;

	@SerializedName("father_code")
	@OpField(desc = "父ID", example = "410522")
	private Long fatherCode;

	@SerializedName("level")
	@OpField(desc = "地址等级", example = "Street")
	private String level;

	@SerializedName("name")
	@OpField(desc = "镇或者街道名称", example = "伦掌镇")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(Long code){
		this.code = code;
	}

	
	public Long getCode(){
		return this.code;
	}

	
	public void setFatherCode(Long fatherCode){
		this.fatherCode = fatherCode;
	}

	
	public Long getFatherCode(){
		return this.fatherCode;
	}

	
	public void setLevel(String level){
		this.level = level;
	}

	
	public String getLevel(){
		return this.level;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}