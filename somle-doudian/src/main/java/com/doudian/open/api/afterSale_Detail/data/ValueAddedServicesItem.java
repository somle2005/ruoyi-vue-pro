package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ValueAddedServicesItem {


	@SerializedName("code")
	@OpField(desc = "标签编码", example = "SVC-WBHOMEDELIVERY")
	private String code;

	@SerializedName("name")
	@OpField(desc = "标签名称", example = "送货上门")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}