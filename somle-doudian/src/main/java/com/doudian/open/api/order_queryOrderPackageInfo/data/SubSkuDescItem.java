package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SubSkuDescItem {


	@SerializedName("product_id")
	@OpField(desc = "子商品id", example = "3520562294461467745")
	private String productId;

	@SerializedName("unit_num")
	@OpField(desc = "标准数量", example = "3")
	private Long unitNum;

	@SerializedName("sku_id")
	@OpField(desc = "子商品在抖店的SkuId", example = "1719024557525047")
	private String skuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(String productId){
		this.productId = productId;
	}

	
	public String getProductId(){
		return this.productId;
	}

	
	public void setUnitNum(Long unitNum){
		this.unitNum = unitNum;
	}

	
	public Long getUnitNum(){
		return this.unitNum;
	}

	
	public void setSkuId(String skuId){
		this.skuId = skuId;
	}

	
	public String getSkuId(){
		return this.skuId;
	}

}