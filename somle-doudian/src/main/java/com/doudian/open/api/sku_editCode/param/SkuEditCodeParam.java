package com.doudian.open.api.sku_editCode.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuEditCodeParam {


	@SerializedName("code")
	@OpField(required = false , desc = "编码", example= "abc")
	private String code;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "skuid", example= "123246")
	private Long skuId;

	@SerializedName("out_sku_id")
	@OpField(required = false , desc = "外部skuid", example= "32135135")
	private Long outSkuId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "商品id", example= "321545421545474")
	private Long productId;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商品id", example= "3234156453136545")
	private Long outProductId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
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

}