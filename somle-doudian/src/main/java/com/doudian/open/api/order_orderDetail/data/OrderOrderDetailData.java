package com.doudian.open.api.order_orderDetail.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderOrderDetailData {


	@SerializedName("shop_order_detail")
	@OpField(desc = "订单信息", example = "")
	private ShopOrderDetail shopOrderDetail;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderDetail(ShopOrderDetail shopOrderDetail){
		this.shopOrderDetail = shopOrderDetail;
	}

	
	public ShopOrderDetail getShopOrderDetail(){
		return this.shopOrderDetail;
	}

}