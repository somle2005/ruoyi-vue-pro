package com.doudian.open.api.product_getPublishProductLimit.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductLimitResultItem {


	@SerializedName("limit_type")
	@OpField(desc = "open店铺发品限制, 1-天级发品限制，2-一级类目在架商品数限制", example = "1")
	private Long limitType;

	@SerializedName("has_limit")
	@OpField(desc = "是否有限制", example = "true")
	private Boolean hasLimit;

	@SerializedName("hit_limit")
	@OpField(desc = "是否命中限制", example = "true")
	private Boolean hitLimit;

	@SerializedName("remain_count")
	@OpField(desc = "剩余数量", example = "0")
	private Long remainCount;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setLimitType(Long limitType){
		this.limitType = limitType;
	}

	
	public Long getLimitType(){
		return this.limitType;
	}

	
	public void setHasLimit(Boolean hasLimit){
		this.hasLimit = hasLimit;
	}

	
	public Boolean getHasLimit(){
		return this.hasLimit;
	}

	
	public void setHitLimit(Boolean hitLimit){
		this.hitLimit = hitLimit;
	}

	
	public Boolean getHitLimit(){
		return this.hitLimit;
	}

	
	public void setRemainCount(Long remainCount){
		this.remainCount = remainCount;
	}

	
	public Long getRemainCount(){
		return this.remainCount;
	}

}