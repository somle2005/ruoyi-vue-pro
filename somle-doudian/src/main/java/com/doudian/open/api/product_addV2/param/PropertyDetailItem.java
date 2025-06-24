package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PropertyDetailItem {


	@SerializedName("extra_info")
	@OpField(required = false , desc = "定制属性扩展信息", example= "")
	private ExtraInfo extraInfo;

	@SerializedName("name")
	@OpField(required = false , desc = "定制属性名称", example= "宰杀")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExtraInfo(ExtraInfo extraInfo){
		this.extraInfo = extraInfo;
	}

	
	public ExtraInfo getExtraInfo(){
		return this.extraInfo;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}