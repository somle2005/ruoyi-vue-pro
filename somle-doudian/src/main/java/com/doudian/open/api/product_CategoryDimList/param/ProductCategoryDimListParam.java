package com.doudian.open.api.product_CategoryDimList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductCategoryDimListParam {


	@SerializedName("level")
	@OpField(required = false , desc = "类目层级", example= "1")
	private Integer level;

	@SerializedName("name")
	@OpField(required = false , desc = "类目名, 模糊搜索", example= "家居")
	private String name;

	@SerializedName("parent_id")
	@OpField(required = false , desc = "上级类目ID，一级类目上级类目ID为0，可选", example= "0")
	private Long parentId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLevel(Integer level){
		this.level = level;
	}

	
	public Integer getLevel(){
		return this.level;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setParentId(Long parentId){
		this.parentId = parentId;
	}

	
	public Long getParentId(){
		return this.parentId;
	}

}