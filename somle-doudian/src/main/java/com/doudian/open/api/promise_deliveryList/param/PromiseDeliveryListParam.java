package com.doudian.open.api.promise_deliveryList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class PromiseDeliveryListParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "123")
	private Long productId;

	@SerializedName("page")
	@OpField(required = true , desc = "页码，从1开始", example= "1")
	private Long page;

	@SerializedName("size")
	@OpField(required = true , desc = "每页数量", example= "10")
	private Long size;


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

	
	public void setPage(Long page){
		this.page = page;
	}

	
	public Long getPage(){
		return this.page;
	}

	
	public void setSize(Long size){
		this.size = size;
	}

	
	public Long getSize(){
		return this.size;
	}

}