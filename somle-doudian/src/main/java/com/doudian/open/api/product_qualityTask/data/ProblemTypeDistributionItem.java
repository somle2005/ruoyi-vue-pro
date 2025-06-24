package com.doudian.open.api.product_qualityTask.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProblemTypeDistributionItem {


	@SerializedName("type_key")
	@OpField(desc = "优化项代号，1-商品信息不规范，2-关键信息待优化，3-商品素材缺失", example = "1")
	private Long typeKey;

	@SerializedName("type_name")
	@OpField(desc = "优化项具体名字", example = "商品信息不规范")
	private String typeName;

	@SerializedName("num")
	@OpField(desc = "具体问题数量", example = "2")
	private Long num;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setTypeKey(Long typeKey){
		this.typeKey = typeKey;
	}

	
	public Long getTypeKey(){
		return this.typeKey;
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