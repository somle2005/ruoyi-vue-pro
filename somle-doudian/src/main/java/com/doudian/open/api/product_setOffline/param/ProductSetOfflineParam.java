package com.doudian.open.api.product_setOffline.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductSetOfflineParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "356654869456454")
	private Long productId;

	@SerializedName("outer_product_id")
	@OpField(required = false , desc = "推荐使用，外部商家编码，支持字符串。", example= "2333424")
	private String outerProductId;

	@SerializedName("store_id")
	@OpField(required = false , desc = "小时达二期店铺场景才可以传，小时达二期场景可以通过传入主品id+门店id对该门店下的子品进行操作", example= "12345")
	private Long storeId;


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

	
	public void setOuterProductId(String outerProductId){
		this.outerProductId = outerProductId;
	}

	
	public String getOuterProductId(){
		return this.outerProductId;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}