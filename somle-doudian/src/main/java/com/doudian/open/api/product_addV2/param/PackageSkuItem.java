package com.doudian.open.api.product_addV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PackageSkuItem {


	@SerializedName("sub_product_id")
	@OpField(required = false , desc = "组套子品id", example= "11")
	private Long subProductId;

	@SerializedName("sub_sku_id")
	@OpField(required = false , desc = "组套子品skuid", example= "12")
	private Long subSkuId;

	@SerializedName("combo_num")
	@OpField(required = false , desc = "组合数量", example= "2")
	private Long comboNum;

	@SerializedName("short_name")
	@OpField(required = false , desc = "组套名称", example= "xx套装")
	private String shortName;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSubProductId(Long subProductId){
		this.subProductId = subProductId;
	}

	
	public Long getSubProductId(){
		return this.subProductId;
	}

	
	public void setSubSkuId(Long subSkuId){
		this.subSkuId = subSkuId;
	}

	
	public Long getSubSkuId(){
		return this.subSkuId;
	}

	
	public void setComboNum(Long comboNum){
		this.comboNum = comboNum;
	}

	
	public Long getComboNum(){
		return this.comboNum;
	}

	
	public void setShortName(String shortName){
		this.shortName = shortName;
	}

	
	public String getShortName(){
		return this.shortName;
	}

}