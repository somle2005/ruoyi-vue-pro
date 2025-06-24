package com.doudian.open.api.product_launchProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductLaunchProductParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品id", example= "3658097271523938018")
	private Long productId;


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

}