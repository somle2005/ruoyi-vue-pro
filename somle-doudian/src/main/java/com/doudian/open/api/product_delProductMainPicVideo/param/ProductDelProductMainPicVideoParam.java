package com.doudian.open.api.product_delProductMainPicVideo.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductDelProductMainPicVideoParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品id", example= "3718561388407423310")
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