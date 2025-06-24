package com.doudian.open.api.instantShopping_trade_freightList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class InstantShoppingTradeFreightListParam {


	@SerializedName("size")
	@OpField(required = false , desc = "每页返回数量", example= "10")
	private String size;

	@SerializedName("name")
	@OpField(required = false , desc = "模板名称搜索", example= "包邮")
	private String name;

	@SerializedName("page")
	@OpField(required = false , desc = "页码", example= "1")
	private String page;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSize(String size){
		this.size = size;
	}

	
	public String getSize(){
		return this.size;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPage(String page){
		this.page = page;
	}

	
	public String getPage(){
		return this.page;
	}

}