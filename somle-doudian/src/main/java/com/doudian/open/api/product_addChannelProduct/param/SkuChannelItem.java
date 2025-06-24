package com.doudian.open.api.product_addChannelProduct.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuChannelItem {


	@SerializedName("stock_set_mode")
	@OpField(required = false , desc = "库存编辑模式，0=设置绝对值，1=增量设置", example= "1")
	private Integer stockSetMode;

	@SerializedName("code")
	@OpField(required = false , desc = "渠道品定制SKU商家编码。可忽略，默认使用主商品SKU商家编码。", example= "49374")
	private String code;

	@SerializedName("sku_id")
	@OpField(required = true , desc = "主商品SkuID", example= "1771295549374468")
	private Long skuId;

	@SerializedName("price")
	@OpField(required = false , desc = "价格，单位分。设置价格跟随主品时，可不填", example= "10")
	private Long price;

	@SerializedName("stock_num")
	@OpField(required = false , desc = "库存，勿大于主SKU的可售库存。设置库存与主商品共享时，可不填", example= "100")
	private Long stockNum;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setStockSetMode(Integer stockSetMode){
		this.stockSetMode = stockSetMode;
	}

	
	public Integer getStockSetMode(){
		return this.stockSetMode;
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