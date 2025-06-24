package com.doudian.open.api.product_detail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductDetailParam {


	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID，抖店系统生成，店铺下唯一；长度19位", example= "3558192687276554544")
	private String productId;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商家编码，商家自定义字段", example= "dy001")
	private String outProductId;

	@SerializedName("show_draft")
	@OpField(required = false , desc = "true：读取草稿数据；false：读取线上数据；不传默认为false", example= "false")
	private String showDraft;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID，不建议小时达一期用，即时零售单店版，无需使用", example= "1111420330")
	private Long storeId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setOutProductId(String outProductId){
		this.outProductId = outProductId;
	}

	
	public String getOutProductId(){
		return this.outProductId;
	}

	
	public void setShowDraft(String showDraft){
		this.showDraft = showDraft;
	}

	
	public String getShowDraft(){
		return this.showDraft;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}