package com.doudian.open.api.product_CategoryDimList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("id")
	@OpField(desc = "类目ID", example = "无需填写")
	private Long id;

	@SerializedName("name")
	@OpField(desc = "类目名", example = "无需填写")
	private String name;

	@SerializedName("level")
	@OpField(desc = "类目层级", example = "无需填写")
	private Integer level;

	@SerializedName("parent_id")
	@OpField(desc = "上级ID，一级类目上级ID为0", example = "无需填写")
	private Long parentId;

	@SerializedName("is_leaf")
	@OpField(desc = "是否叶子类目", example = "无需填写")
	private Integer isLeaf;

	@SerializedName("vertical_category_new")
	@OpField(desc = "行业名", example = "无需填写")
	private String verticalCategoryNew;

	@SerializedName("vertical_category_code_new")
	@OpField(desc = "行业英文名", example = "无需填写")
	private String verticalCategoryCodeNew;


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

	
	public void setLevel(Integer level){
		this.level = level;
	}

	
	public Integer getLevel(){
		return this.level;
	}

	
	public void setParentId(Long parentId){
		this.parentId = parentId;
	}

	
	public Long getParentId(){
		return this.parentId;
	}

	
	public void setIsLeaf(Integer isLeaf){
		this.isLeaf = isLeaf;
	}

	
	public Integer getIsLeaf(){
		return this.isLeaf;
	}

	
	public void setVerticalCategoryNew(String verticalCategoryNew){
		this.verticalCategoryNew = verticalCategoryNew;
	}

	
	public String getVerticalCategoryNew(){
		return this.verticalCategoryNew;
	}

	
	public void setVerticalCategoryCodeNew(String verticalCategoryCodeNew){
		this.verticalCategoryCodeNew = verticalCategoryCodeNew;
	}

	
	public String getVerticalCategoryCodeNew(){
		return this.verticalCategoryCodeNew;
	}

}