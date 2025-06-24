package com.doudian.open.api.order_batchBindSerialNumber.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SuccessBindListItem {


	@SerializedName("shop_order_id")
	@OpField(desc = "店铺单单号：", example = "6940658920780535662")
	private String shopOrderId;

	@SerializedName("sku_order_id")
	@OpField(desc = "sku单单号;", example = "6940658920780535662")
	private String skuOrderId;

	@SerializedName("fail_reason")
	@OpField(desc = "失败原因;", example = "参数错误")
	private String failReason;

	@SerializedName("fail_code")
	@OpField(desc = "失败原因的code;", example = "2001")
	private String failCode;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setSkuOrderId(String skuOrderId){
		this.skuOrderId = skuOrderId;
	}

	
	public String getSkuOrderId(){
		return this.skuOrderId;
	}

	
	public void setFailReason(String failReason){
		this.failReason = failReason;
	}

	
	public String getFailReason(){
		return this.failReason;
	}

	
	public void setFailCode(String failCode){
		this.failCode = failCode;
	}

	
	public String getFailCode(){
		return this.failCode;
	}

}