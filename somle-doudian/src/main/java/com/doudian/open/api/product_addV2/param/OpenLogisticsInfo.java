package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OpenLogisticsInfo {


	@SerializedName("customs_clear_type")
	@OpField(required = false , desc = "通关模式，1：BBC 2：BC 3：CC邮关", example= "1")
	private Long customsClearType;

	@SerializedName("origin_country_id")
	@OpField(required = false , desc = "原产国id", example= "6251999")
	private Long originCountryId;

	@SerializedName("source_country_id")
	@OpField(required = false , desc = "货源国id", example= "2963597")
	private Long sourceCountryId;

	@SerializedName("brand_country_id")
	@OpField(required = false , desc = "品牌所在地id", example= "6251999")
	private Long brandCountryId;

	@SerializedName("tax_payer")
	@OpField(required = false , desc = "税金承担方（一般都填0，走商家承担）：0商家承担，1用户承担", example= "0")
	private Long taxPayer;

	@SerializedName("net_weight_qty")
	@OpField(required = false , desc = "商品净重", example= "1")
	private Double netWeightQty;

	@SerializedName("cross_warehouse_id")
	@OpField(required = false , desc = "商家仓id", example= "FOURPLTEST")
	private String crossWarehouseId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCustomsClearType(Long customsClearType){
		this.customsClearType = customsClearType;
	}

	
	public Long getCustomsClearType(){
		return this.customsClearType;
	}

	
	public void setOriginCountryId(Long originCountryId){
		this.originCountryId = originCountryId;
	}

	
	public Long getOriginCountryId(){
		return this.originCountryId;
	}

	
	public void setSourceCountryId(Long sourceCountryId){
		this.sourceCountryId = sourceCountryId;
	}

	
	public Long getSourceCountryId(){
		return this.sourceCountryId;
	}

	
	public void setBrandCountryId(Long brandCountryId){
		this.brandCountryId = brandCountryId;
	}

	
	public Long getBrandCountryId(){
		return this.brandCountryId;
	}

	
	public void setTaxPayer(Long taxPayer){
		this.taxPayer = taxPayer;
	}

	
	public Long getTaxPayer(){
		return this.taxPayer;
	}

	
	public void setNetWeightQty(Double netWeightQty){
		this.netWeightQty = netWeightQty;
	}

	
	public Double getNetWeightQty(){
		return this.netWeightQty;
	}

	
	public void setCrossWarehouseId(String crossWarehouseId){
		this.crossWarehouseId = crossWarehouseId;
	}

	
	public String getCrossWarehouseId(){
		return this.crossWarehouseId;
	}

}