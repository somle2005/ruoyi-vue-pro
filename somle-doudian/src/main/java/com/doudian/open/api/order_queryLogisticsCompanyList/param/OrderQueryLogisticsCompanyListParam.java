package com.doudian.open.api.order_queryLogisticsCompanyList.param;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;
import java.util.List;

//auto generated, do not edit

public class OrderQueryLogisticsCompanyListParam {


	@SerializedName("shop_order_ids")
	@OpField(required = false , desc = "订单号列表", example= "[6918554369549276303,6918522115348698631]")
	private List<String> shopOrderIds;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setShopOrderIds(List<String> shopOrderIds){
		this.shopOrderIds = shopOrderIds;
	}

	
	public List<String> getShopOrderIds(){
		return this.shopOrderIds;
	}

}