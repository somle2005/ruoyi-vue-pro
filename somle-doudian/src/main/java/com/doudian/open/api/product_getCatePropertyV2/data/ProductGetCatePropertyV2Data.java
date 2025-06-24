package com.doudian.open.api.product_getCatePropertyV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetCatePropertyV2Data {


	@SerializedName("data")
	@OpField(desc = "返回参数列表", example = "")
	private List<DataItem> data;

	@SerializedName("tpl_type")
	@OpField(desc = "模板类型，SPU为1，结构化为2，默认为0（无特殊需求忽略该字段即可）", example = "2")
	private Long tplType;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setData(List<DataItem> data){
		this.data = data;
	}

	
	public List<DataItem> getData(){
		return this.data;
	}

	
	public void setTplType(Long tplType){
		this.tplType = tplType;
	}

	
	public Long getTplType(){
		return this.tplType;
	}

}