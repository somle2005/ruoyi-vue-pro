package com.doudian.open.api.order_logisticsCompanyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("id")
	@OpField(desc = "物流公司id", example = "7")
	private Long id;

	@SerializedName("name")
	@OpField(desc = "物流公司名字", example = "圆通快递")
	private String name;

	@SerializedName("code")
	@OpField(desc = "物流公司code", example = "yuantong")
	private String code;


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

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

}