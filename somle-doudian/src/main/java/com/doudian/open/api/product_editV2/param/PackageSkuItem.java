package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PackageSkuItem {


	@SerializedName("short_name")
	@OpField(required = false , desc = "组套名称", example= "组套名称")
	private String shortName;

	@SerializedName("combo_num")
	@OpField(required = false , desc = "组套包子品数量", example= "2")
	private Long comboNum;

	@SerializedName("sub_sku_id")
	@OpField(required = false , desc = "组套包子品skuId", example= "111")
	private Long subSkuId;

	@SerializedName("sub_product_id")
	@OpField(required = false , desc = "组套包子品商品id", example= "12")
	private Long subProductId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShortName(String shortName){
		this.shortName = shortName;
	}

	
	public String getShortName(){
		return this.shortName;
	}

	
	public void setComboNum(Long comboNum){
		this.comboNum = comboNum;
	}

	
	public Long getComboNum(){
		return this.comboNum;
	}

	
	public void setSubSkuId(Long subSkuId){
		this.subSkuId = subSkuId;
	}

	
	public Long getSubSkuId(){
		return this.subSkuId;
	}

	
	public void setSubProductId(Long subProductId){
		this.subProductId = subProductId;
	}

	
	public Long getSubProductId(){
		return this.subProductId;
	}

}