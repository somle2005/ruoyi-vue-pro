package com.doudian.open.api.product_editBuyerLimit.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class ProductEditBuyerLimitParam {


	@SerializedName("product_id")
	@OpField(required = true , desc = "商品ID", example= "41231241241")
	private Long productId;

	@SerializedName("maximum_per_order")
	@OpField(required = false , desc = "每个用户每次下单限购件数", example= "200")
	private Long maximumPerOrder;

	@SerializedName("limit_per_buyer")
	@OpField(required = false , desc = "每个用户累计限购件数", example= "1")
	private Long limitPerBuyer;

	@SerializedName("minimum_per_order")
	@OpField(required = false , desc = "每个用户每次下单至少购买的件数 ", example= "2")
	private Long minimumPerOrder;


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

	
	public void setMaximumPerOrder(Long maximumPerOrder){
		this.maximumPerOrder = maximumPerOrder;
	}

	
	public Long getMaximumPerOrder(){
		return this.maximumPerOrder;
	}

	
	public void setLimitPerBuyer(Long limitPerBuyer){
		this.limitPerBuyer = limitPerBuyer;
	}

	
	public Long getLimitPerBuyer(){
		return this.limitPerBuyer;
	}

	
	public void setMinimumPerOrder(Long minimumPerOrder){
		this.minimumPerOrder = minimumPerOrder;
	}

	
	public Long getMinimumPerOrder(){
		return this.minimumPerOrder;
	}

}