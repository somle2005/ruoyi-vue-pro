package com.doudian.open.api.sku_editPrice.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuEditPriceParam {


	@SerializedName("price")
	@OpField(required = true , desc = "售价 (单位 分)", example= "3200")
	private Long price;

	@SerializedName("code")
	@OpField(required = false , desc = "sku编码", example= "aaa")
	private String code;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "skuid", example= "1233245")
	private Long skuId;

	@SerializedName("out_sku_id")
	@OpField(required = false , desc = "外部skuid", example= "132345654")
	private Long outSkuId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品id", example= "322315645454655")
	private Long productId;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商品id", example= "2634786238745687465")
	private Long outProductId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "即时零售连锁版，通过传入主品id+门店id对该门店下的子品进行操作，即时零售单店版，无需使用", example= "12345")
	private Long storeId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setOutSkuId(Long outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public Long getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}