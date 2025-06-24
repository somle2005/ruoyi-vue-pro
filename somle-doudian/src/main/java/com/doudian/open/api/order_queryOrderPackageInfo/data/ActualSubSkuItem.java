package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ActualSubSkuItem {


	@SerializedName("product_id")
	@OpField(desc = "子商品id", example = "3520562294461467745")
	private Long productId;

	@SerializedName("product_name")
	@OpField(desc = "商品名称", example = "XX行李箱")
	private String productName;

	@SerializedName("sku_id")
	@OpField(desc = "子商品skuid", example = "1719024557525047")
	private Long skuId;

	@SerializedName("sku_img")
	@OpField(desc = "子商品图片", example = "https:xxxx")
	private String skuImg;

	@SerializedName("num")
	@OpField(desc = "子商品数量", example = "3")
	private Long num;

	@SerializedName("is_free")
	@OpField(desc = "是否是赠品", example = "true")
	private Boolean isFree;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

}