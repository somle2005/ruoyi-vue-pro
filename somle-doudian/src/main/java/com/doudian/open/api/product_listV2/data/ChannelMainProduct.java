package com.doudian.open.api.product_listV2.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ChannelMainProduct {


	@SerializedName("product_id")
	@OpField(desc = "主品的商品id", example = "3570226807****00909")
	private Long productId;

	@SerializedName("shop_id")
	@OpField(desc = "店铺id", example = "90**9")
	private Long shopId;


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

	
	public void setShopId(Long shopId){
		this.shopId = shopId;
	}

	
	public Long getShopId(){
		return this.shopId;
	}

}