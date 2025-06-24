package com.doudian.open.api.product_getSchema.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductGetSchemaParam {


	@SerializedName("category_id")
	@OpField(required = false , desc = "类目Id", example= "31860")
	private Long categoryId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品Id", example= "1232")
	private Long productId;

	@SerializedName("spu_id")
	@OpField(required = false , desc = "SPU id", example= "1232")
	private Long spuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

}