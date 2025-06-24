package com.doudian.open.api.order_policy.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class GoodsInfoListItem {


	@SerializedName("name")
	@OpField(desc = "商品名称", example = "商品名称")
	private String name;

	@SerializedName("product_id")
	@OpField(desc = "商品id", example = "3436088998672617334")
	private Long productId;

	@SerializedName("category_id")
	@OpField(desc = "类目", example = "13-3004-3006")
	private String categoryId;

	@SerializedName("show_page_url")
	@OpField(desc = "url", example = "https://sf1-ttcdn-tos.pstatp.com/obj/temai/6535e88c983f735cabb99f5b00f6212awww800-800,")
	private String showPageUrl;

	@SerializedName("count")
	@OpField(desc = "数量", example = "1")
	private Integer count;


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

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}

	
	public String getCategoryId(){
		return this.categoryId;
	}

	
	public void setShowPageUrl(String showPageUrl){
		this.showPageUrl = showPageUrl;
	}

	
	public String getShowPageUrl(){
		return this.showPageUrl;
	}

	
	public void setCount(Integer count){
		this.count = count;
	}

	
	public Integer getCount(){
		return this.count;
	}

}