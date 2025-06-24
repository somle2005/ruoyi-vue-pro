package com.doudian.open.api.order_queryLogisticsCompanyList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class LogistcisCompanyListByIdsItem {


	@SerializedName("code")
	@OpField(desc = "订单能够使用的物流code", example = "qita")
	private String code;

	@SerializedName("name")
	@OpField(desc = "订单能够使用的物流名称", example = "其他物流")
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