package com.doudian.open.api.product_getProductUpdateRule.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class ProductGetProductUpdateRuleParam {


	@SerializedName("category_id")
	@OpField(required = true , desc = "类目id", example= "20219")
	private Long categoryId;

	@SerializedName("senses")
	@OpField(required = false , desc = "闪购定制参数，普通发品忽略", example= "1001")
	private List<Integer> senses;

	@SerializedName("standard_brand_id")
	@OpField(required = false , desc = "品牌id", example= "20319")
	private Long standardBrandId;

	@SerializedName("spu_id")
	@OpField(required = false , desc = "spu_id", example= "23291")
	private Long spuId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setCategoryId(Long categoryId){
		this.categoryId = categoryId;
	}

	
	public Long getCategoryId(){
		return this.categoryId;
	}

	
	public void setSenses(List<Integer> senses){
		this.senses = senses;
	}

	
	public List<Integer> getSenses(){
		return this.senses;
	}

	
	public void setStandardBrandId(Long standardBrandId){
		this.standardBrandId = standardBrandId;
	}

	
	public Long getStandardBrandId(){
		return this.standardBrandId;
	}

	
	public void setSpuId(Long spuId){
		this.spuId = spuId;
	}

	
	public Long getSpuId(){
		return this.spuId;
	}

}