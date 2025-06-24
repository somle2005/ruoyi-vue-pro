package com.doudian.open.api.order_orderDetail.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderOrderDetailParam {


	@SerializedName("shop_order_id")
	@OpField(required = true , desc = "店铺父订单号，抖店平台生成，平台下唯一；", example= "6917533224570258991")
	private String shopOrderId;

	@SerializedName("is_searchable")
	private Boolean isSearchable;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderId(String shopOrderId){
		this.shopOrderId = shopOrderId;
	}

	
	public String getShopOrderId(){
		return this.shopOrderId;
	}

	
	public void setIsSearchable(Boolean isSearchable){
		this.isSearchable = isSearchable;
	}

	
	public Boolean getIsSearchable(){
		return this.isSearchable;
	}

}