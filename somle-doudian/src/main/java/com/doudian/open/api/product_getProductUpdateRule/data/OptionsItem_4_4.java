package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OptionsItem_4_4 {


	@SerializedName("example")
	@OpField(desc = "sku分类对应举例", example = "标题/主图主要售卖洗发水，洗发水1瓶为主售款（单品）。主要销售成箱装饮料，饮料1箱为主售款单品")
	private String example;

	@SerializedName("description")
	@OpField(desc = "sku分类对应介绍", example = "SKU为单个商品，与标题、主图、叶子类目描述一致，为该商品主要售卖款式")
	private String description;

	@SerializedName("value")
	@OpField(desc = "sku分类枚举信息", example = "main_sale_single_product")
	private String value;

	@SerializedName("name")
	@OpField(desc = "sku分类信息中文名称", example = "主售款（单品）")
	private String name;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setExample(String example){
		this.example = example;
	}

	
	public String getExample(){
		return this.example;
	}

	
	public void setDescription(String description){
		this.description = description;
	}

	
	public String getDescription(){
		return this.description;
	}

	
	public void setValue(String value){
		this.value = value;
	}

	
	public String getValue(){
		return this.value;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

}