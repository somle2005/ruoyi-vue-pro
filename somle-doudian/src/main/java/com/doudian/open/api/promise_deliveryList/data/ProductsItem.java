package com.doudian.open.api.promise_deliveryList.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductsItem {


	@SerializedName("product_id")
	@OpField(desc = "商品ID", example = "123")
	private Long productId;

	@SerializedName("ship_mode")
	@OpField(desc = "1：当日发；2：次日发", example = "1")
	private Integer shipMode;


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

	
	public void setShipMode(Integer shipMode){
		this.shipMode = shipMode;
	}

	
	public Integer getShipMode(){
		return this.shipMode;
	}

}