package com.doudian.open.api.order_queryOrderPackageInfo.data;

import com.doudian.open.gson.annotations.SerializedName;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.annotation.OpField;

//auto generated, do not edit

public class OrderQueryOrderPackageInfoData {


	@SerializedName("order_package_info")
	@OpField(desc = "订单包裹信息", example = "")
	private OrderPackageInfo orderPackageInfo;


	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

	
	public void setOrderPackageInfo(OrderPackageInfo orderPackageInfo){
		this.orderPackageInfo = orderPackageInfo;
	}

	
	public OrderPackageInfo getOrderPackageInfo(){
		return this.orderPackageInfo;
	}

}