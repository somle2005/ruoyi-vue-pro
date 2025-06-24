package com.doudian.open.api.afterSale_Detail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class GivenSkuDetailsItem {


	@SerializedName("item_order_num")
	@OpField(desc = "赠品个数", example = "1")
	private Long itemOrderNum;

	@SerializedName("shop_sku_code")
	@OpField(desc = "赠品商家编码", example = "123")
	private String shopSkuCode;

	@SerializedName("product_id")
	@OpField(desc = "赠品商品ID", example = "361124732503867950")
	private String productId;

	@SerializedName("sku_order_id")
	@OpField(desc = "赠品商品订单ID", example = "4866736775786465058")
	private String skuOrderId;

	@SerializedName("product_name")
	@OpField(desc = "赠品名称", example = "赠品1衣服")
	private String productName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setItemOrderNum(Long itemOrderNum){
		this.itemOrderNum = itemOrderNum;
	}

	
	public Long getItemOrderNum(){
		return this.itemOrderNum;
	}

	
	public void setShopSkuCode(String shopSkuCode){
		this.shopSkuCode = shopSkuCode;
	}

	
	public String getShopSkuCode(){
		return this.shopSkuCode;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setSkuOrderId(String skuOrderId){
		this.skuOrderId = skuOrderId;
	}

	
	public String getSkuOrderId(){
		return this.skuOrderId;
	}

	
	public void setProductName(String productName){
		this.productName = productName;
	}

	
	public String getProductName(){
		return this.productName;
	}

}