package com.doudian.open.api.product_editV2.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class AfterSaleServiceV2 {


	@SerializedName("three_guarantees")
	@OpField(required = false , desc = "三包服务配置", example= "")
	private ThreeGuarantees threeGuarantees;

	@SerializedName("is_large_product")
	@OpField(required = false , desc = "当前商品是否是大件商品", example= "1-是")
	private Long isLargeProduct;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setThreeGuarantees(ThreeGuarantees threeGuarantees){
		this.threeGuarantees = threeGuarantees;
	}

	
	public ThreeGuarantees getThreeGuarantees(){
		return this.threeGuarantees;
	}

	
	public void setIsLargeProduct(Long isLargeProduct){
		this.isLargeProduct = isLargeProduct;
	}

	
	public Long getIsLargeProduct(){
		return this.isLargeProduct;
	}

}