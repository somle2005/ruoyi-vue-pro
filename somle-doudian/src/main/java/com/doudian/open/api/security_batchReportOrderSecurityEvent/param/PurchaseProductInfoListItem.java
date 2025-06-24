package com.doudian.open.api.security_batchReportOrderSecurityEvent.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PurchaseProductInfoListItem {


	@SerializedName("purchase_platform_type")
	@OpField(required = false , desc = "采购平台 1：拼多多 2：淘宝 3：1688 4：其它", example= "1")
	private Integer purchasePlatformType;

	@SerializedName("purchase_product_url")
	@OpField(required = false , desc = "采购商品链接", example= "https://www.abc.com/")
	private String purchaseProductUrl;

	@SerializedName("external_purchaser_id")
	@OpField(required = false , desc = "采购人id（外部）", example= "12345")
	private String externalPurchaserId;

	@SerializedName("product_name")
	@OpField(required = false , desc = "本平台订单的商品名称", example= "商品名")
	private String productName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPurchasePlatformType(Integer purchasePlatformType){
		this.purchasePlatformType = purchasePlatformType;
	}

	
	public Integer getPurchasePlatformType(){
		return this.purchasePlatformType;
	}

	
	public void setPurchaseProductUrl(String purchaseProductUrl){
		this.purchaseProductUrl = purchaseProductUrl;
	}

	
	public String getPurchaseProductUrl(){
		return this.purchaseProductUrl;
	}

	
	public void setExternalPurchaserId(String externalPurchaserId){
		this.externalPurchaserId = externalPurchaserId;
	}

	
	public String getExternalPurchaserId(){
		return this.externalPurchaserId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

}