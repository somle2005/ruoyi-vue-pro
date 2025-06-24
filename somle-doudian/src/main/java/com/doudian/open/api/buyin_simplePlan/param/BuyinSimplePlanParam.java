package com.doudian.open.api.buyin_simplePlan.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class BuyinSimplePlanParam {


	@SerializedName("is_create")
	@OpField(required = true , desc = "是否创建", example= "true")
	private Boolean isCreate;

	@SerializedName("status")
	@OpField(required = false , desc = "状态，修改时必填，创建推广时默认开启。1：开启普通计划；2：关闭普通计划", example= "2")
	private Integer status;

	@SerializedName("products")
	@OpField(required = false , desc = "总个数不超过20，不可重复", example= "")
	private List<ProductsItem> products;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setIsCreate(Boolean isCreate){
		this.isCreate = isCreate;
	}

	
	public Boolean getIsCreate(){
		return this.isCreate;
	}

	
	public void setStatus(Integer status){
		this.status = status;
	}

	
	public Integer getStatus(){
		return this.status;
	}

	
	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	
	public List<ProductsItem> getProducts(){
		return this.products;
	}

}