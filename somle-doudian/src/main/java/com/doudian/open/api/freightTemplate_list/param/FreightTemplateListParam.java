package com.doudian.open.api.freightTemplate_list.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class FreightTemplateListParam {


	@SerializedName("name")
	@OpField(required = false , desc = "运费模板名称，支持模糊搜索", example= "模版1")
	private String name;

	@SerializedName("page")
	@OpField(required = false , desc = "页数（默认为0，第一页从0开始）", example= "0")
	private String page;

	@SerializedName("size")
	@OpField(required = false , desc = "每页模板数（默认为10），最大值是100", example= "10")
	private String size;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

	
	public void setSize(String size){
		this.size = size;
	}

	
	public String getSize(){
		return this.size;
	}

}