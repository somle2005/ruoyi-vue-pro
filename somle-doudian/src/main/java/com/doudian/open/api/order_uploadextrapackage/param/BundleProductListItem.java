package com.doudian.open.api.order_uploadextrapackage.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class BundleProductListItem {


	@SerializedName("count")
	@OpField(required = false , desc = "关联的组合商品的件数", example= "1")
	private Long count;

	@SerializedName("sku_id")
	@OpField(required = false , desc = "组合商品中子商品的SkuID", example= "1235")
	private String skuId;

	@SerializedName("product_id")
	@OpField(required = false , desc = "组合商品中子商品的商品ID", example= "1235")
	private String productId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCount(Long count){
		this.count = count;
	}

	
	public Long getCount(){
		return this.count;
	}

	
	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	
	public String getSkuId(){
		return this.skuId;
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

}