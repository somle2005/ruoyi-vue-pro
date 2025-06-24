package com.doudian.open.api.afterSale_List.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ExchangeSkuInfo {


	@SerializedName("sku_id")
	@OpField(desc = "换货SkuID", example = "1709160688834615")
	private String skuId;

	@SerializedName("code")
	@OpField(desc = "换货SKU code", example = "10000")
	private String code;

	@SerializedName("num")
	@OpField(desc = "换货数目", example = "1")
	private Long num;

	@SerializedName("out_sku_id")
	@OpField(desc = "商家编号", example = "10000")
	private String outSkuId;

	@SerializedName("out_warehouse_id")
	@OpField(desc = "区域库存仓ID", example = "10000")
	private String outWarehouseId;

	@SerializedName("supplier_id")
	@OpField(desc = "sku外部供应商编码供应商ID", example = "10000")
	private String supplierId;

	@SerializedName("url")
	@OpField(desc = "商品图片url", example = "http://xxxxx")
	private String url;

	@SerializedName("name")
	@OpField(desc = "商品名称", example = "xxx")
	private String name;

	@SerializedName("price")
	@OpField(desc = "换货商品的价格，单位分", example = "100")
	private String price;

	@SerializedName("spec_desc")
	@OpField(desc = "sku规格信息", example = "xx/xx/xx")
	private String specDesc;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	
	public String getSkuId(){
		return this.skuId;
	}

	
	public void setCode(String code){
		this.code = code;
	}

	
	public String getCode(){
		return this.code;
	}

	
	public void setNum(Long num){
		this.num = num;
	}

	
	public Long getNum(){
		return this.num;
	}

	
	public void setOutSkuId(String outSkuId){
		this.outSkuId = outSkuId;
	}

	
	public String getOutSkuId(){
		return this.outSkuId;
	}

	
	public void setOutWarehouseId(String outWarehouseId){
		this.outWarehouseId = outWarehouseId;
	}

	
	public String getOutWarehouseId(){
		return this.outWarehouseId;
	}

	
	public void setSupplierId(String supplierId){
		this.supplierId = supplierId;
	}

	
	public String getSupplierId(){
		return this.supplierId;
	}

	
	public void setUrl(String url){
		this.url = url;
	}

	
	public String getUrl(){
		return this.url;
	}

	
	public void setName(String name){
		this.name = name;
	}

	
	public String getName(){
		return this.name;
	}

	
	public void setPrice(String price){
		this.price = price;
	}

	
	public String getPrice(){
		return this.price;
	}

	
	public void setSpecDesc(String specDesc){
		this.specDesc = specDesc;
	}

	
	public String getSpecDesc(){
		return this.specDesc;
	}

}