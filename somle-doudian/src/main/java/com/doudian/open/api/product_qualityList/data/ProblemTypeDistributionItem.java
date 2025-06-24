package com.doudian.open.api.product_qualityList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProblemTypeDistributionItem {


	@SerializedName("type_name")
	@OpField(desc = "待优化问题类型", example = "关键信息需优化")
	private String typeName;

	@SerializedName("num")
	@OpField(desc = "问题数量", example = "1")
	private Long num;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTypeName(String typeName){
		this.typeName = typeName;
	}

	
	public String getTypeName(){
		return this.typeName;
	}

	
	public void setNum(Long num){
		this.num = num;
	}

	
	public Long getNum(){
		return this.num;
	}

}