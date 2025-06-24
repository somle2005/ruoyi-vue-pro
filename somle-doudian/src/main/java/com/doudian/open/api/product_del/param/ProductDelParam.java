package com.doudian.open.api.product_del.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductDelParam {


	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID", example= "356545645645454")
	private Long productId;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商品ID", example= "4156451")
	private Long outProductId;

	@SerializedName("delete_forever")
	@OpField(required = false , desc = "是否彻底删除", example= "false")
	private Boolean deleteForever;

	@SerializedName("store_id")
	@OpField(required = false , desc = "门店ID，不建议小时达一期用，即时零售单店版，无需使用", example= "1111420330")
	private Long storeId;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setProductId(Long productId){
		this.productId = productId;
	}

	
	public Long getProductId(){
		return this.productId;
	}

	
	public void setOutProductId(Long outProductId){
		this.outProductId = outProductId;
	}

	
	public Long getOutProductId(){
		return this.outProductId;
	}

	
	public void setDeleteForever(Boolean deleteForever){
		this.deleteForever = deleteForever;
	}

	
	public Boolean getDeleteForever(){
		return this.deleteForever;
	}

	
	public void setStoreId(Long storeId){
		this.storeId = storeId;
	}

	
	public Long getStoreId(){
		return this.storeId;
	}

}