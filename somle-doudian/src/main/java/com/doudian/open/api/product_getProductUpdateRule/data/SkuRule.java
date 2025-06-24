package com.doudian.open.api.product_getProductUpdateRule.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuRule {


	@SerializedName("support_barcode")
	@OpField(desc = "是否支持填写条形码", example = "true")
	private Boolean supportBarcode;

	@SerializedName("sku_classification_rule")
	@OpField(desc = "sku分类信息填写规则", example = "")
	private SkuClassificationRule skuClassificationRule;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setSupportBarcode(Boolean supportBarcode){
		this.supportBarcode = supportBarcode;
	}

	
	public Boolean getSupportBarcode(){
		return this.supportBarcode;
	}

	
	public void setSkuClassificationRule(SkuClassificationRule skuClassificationRule){
		this.skuClassificationRule = skuClassificationRule;
	}

	
	public SkuClassificationRule getSkuClassificationRule(){
		return this.skuClassificationRule;
	}

}