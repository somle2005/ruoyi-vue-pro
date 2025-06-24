package com.doudian.open.api.product_previewChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuMain {


	@SerializedName("price")
	@OpField(desc = "主品SKU价格", example = "1111")
	private Long price;

	@SerializedName("stock")
	@OpField(desc = "主品SKU库存", example = "11")
	private Long stock;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setStock(Long stock){
		this.stock = stock;
	}

	
	public Long getStock(){
		return this.stock;
	}

}