package com.doudian.open.api.buyin_simplePlan.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductsItem {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "3276187891830787600")
	private Long productId;

	@SerializedName("cos_ratio")
	@OpField(required = false , desc = "佣金比例（创建推广计划时必填）普通计划范围：[1, 50]。每个商品的佣金率下调次日0点生效，最小下调1%；上调最高到50%，立即生效", example= "30")
	private Long cosRatio;


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

	
	public void setCosRatio(Long cosRatio){
		this.cosRatio = cosRatio;
	}

	
	public Long getCosRatio(){
		return this.cosRatio;
	}

}