package com.doudian.open.api.product_previewChannelProduct.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuChannel {


	@SerializedName("code")
	@OpField(desc = "渠道品定制SKU商家编码。可忽略，默认使用主商品SKU商家编码。", example = "11111")
	private String code;

	@SerializedName("sku_id")
	@OpField(desc = "主品SKU ID", example = "12323232132")
	private Long skuId;

	@SerializedName("price")
	@OpField(desc = "渠道品SKU价格", example = "1111")
	private Long price;

	@SerializedName("stock_num")
	@OpField(desc = "渠道品SKU库存", example = "11")
	private Long stockNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setPrice(Long price){
		this.price = price;
	}

	
	public Long getPrice(){
		return this.price;
	}

	
	public void setStockNum(Long stockNum){
		this.stockNum = stockNum;
	}

	
	public Long getStockNum(){
		return this.stockNum;
	}

}