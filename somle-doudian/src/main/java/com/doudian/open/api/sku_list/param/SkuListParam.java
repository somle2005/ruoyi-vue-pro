package com.doudian.open.api.sku_list.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class SkuListParam {


	@SerializedName("product_id")
	@OpField(required = false , desc = "商品ID；抖店系统生成。", example= "3213654123157")
	private Long productId;

	@SerializedName("out_product_id")
	@OpField(required = false , desc = "外部商品ID；商家创建商品时自定义。", example= "243523452435")
	private Long outProductId;


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

}