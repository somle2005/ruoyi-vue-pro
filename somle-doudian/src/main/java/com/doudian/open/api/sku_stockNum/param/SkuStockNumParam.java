package com.doudian.open.api.sku_stockNum.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuStockNumParam {


	@SerializedName("sku_id")
	@OpField(required = false , desc = "商品规格id，店铺商品id下唯一，抖店平台生成", example= "12345")
	private Long skuId;

	@SerializedName("code")
	@OpField(required = false , desc = "sku商家编码，对应抖店后台商品sku商家编码。外部开发者自定义商品规格id，会校验在店铺下唯一性", example= "abc")
	private String code;

	@SerializedName("out_warehouse_id")
	@OpField(required = false , desc = "仓库编码（供应商编码）", example= "AN871")
	private String outWarehouseId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuId(Long skuId){
		this.skuId = skuId;
	}

	
	public Long getSkuId(){
		return this.skuId;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

}