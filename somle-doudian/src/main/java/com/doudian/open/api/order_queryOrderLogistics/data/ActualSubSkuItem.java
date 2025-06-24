package com.doudian.open.api.order_queryOrderLogistics.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ActualSubSkuItem {


	@SerializedName("sku_id")
	@OpField(desc = "商品ID", example = "12345")
	private Long skuId;

	@SerializedName("sku_img")
	@OpField(desc = "sku图片", example = "1")
	private String skuImg;

	@SerializedName("num")
	@OpField(desc = "sku件数", example = "1")
	private Long num;

	@SerializedName("is_free")
	@OpField(desc = "是否是赠品，true赠品", example = "true")
	private Boolean isFree;

	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "1")
	private Long productId;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "1")
	private String productName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setSkuImg(String skuImg){
		this.skuImg = skuImg;
	}

	
	public String getSkuImg(){
		return this.skuImg;
	}

	
	public void setNum(Long num){
		this.num = num;
	}

	
	public Long getNum(){
		return this.num;
	}

	
	public void setIsFree(Boolean isFree){
		this.isFree = isFree;
	}

	
	public Boolean getIsFree(){
		return this.isFree;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

}