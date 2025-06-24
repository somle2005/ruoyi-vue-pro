package com.doudian.open.api.shop_getShopCategory.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class DataItem {


	@SerializedName("id")
	@OpField(desc = "类目id，用于商品发布和更新，对应请求参数category_leaf_id字段", example = "20005")
	private Long id;

	@SerializedName("name")
	@OpField(desc = "类目名称", example = "女装")
	private String name;

	@SerializedName("level")
	@OpField(desc = "类目级别：1，2，3级类目", example = "1")
	private Long level;

	@SerializedName("parent_id")
	@OpField(desc = "类目父级父类目id", example = "20215")
	private Long parentId;

	@SerializedName("is_leaf")
	@OpField(desc = "是否是叶子节点；is_leaf=true表示是叶子节点，最小层级类目id。is_leaf=false表示不是子节点，请求参数cid=上一次响应参数id，直到获取最小层级类目id", example = "true")
	private Boolean isLeaf;

	@SerializedName("enable")
	@OpField(desc = "类目使用有效；enable=true有效，如果enable=false表示该类目已经失效，请勿使用", example = "true")
	private Boolean enable;


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

	
	public void setLevel(Long level){
		this.level = level;
	}

	
	public Long getLevel(){
		return this.level;
	}

	
	public void setParentId(Long parentId){
		this.parentId = parentId;
	}

	
	public Long getParentId(){
		return this.parentId;
	}

	
	public void setIsLeaf(Boolean isLeaf){
		this.isLeaf = isLeaf;
	}

	
	public Boolean getIsLeaf(){
		return this.isLeaf;
	}

	
	public void setEnable(Boolean enable){
		this.enable = enable;
	}

	
	public Boolean getEnable(){
		return this.enable;
	}

}