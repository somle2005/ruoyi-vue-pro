package com.doudian.open.api.product_isv_createProductFromSupplyPlatform.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductIsvCreateProductFromSupplyPlatformParam {


	@SerializedName("query_id")
	@OpField(required = false , desc = "搜索词id", example= "qwe11411")
	private String queryId;

	@SerializedName("product_id")
	@OpField(required = true , desc = "商品id", example= "123445234234344")
	private Long productId;

	@SerializedName("origin")
	@OpField(required = true , desc = "来源", example= "2")
	private Integer origin;

	@SerializedName("clue_id")
	@OpField(required = false , desc = "线索id", example= "123")
	private Long clueId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setQueryId(String queryId){
		this.queryId = queryId;
	}

	
	public String getQueryId(){
		return this.queryId;
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setOrigin(Integer origin){
		this.origin = origin;
	}

	
	public Integer getOrigin(){
		return this.origin;
	}

	
	public void setClueId(Long clueId){
		this.clueId = clueId;
	}

	
	public Long getClueId(){
		return this.clueId;
	}

}