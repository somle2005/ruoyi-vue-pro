package com.doudian.open.api.order_updateOrderAmount;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_updateOrderAmount.param.*;

//auto generated, do not edit

public class OrderUpdateOrderAmountRequest extends DoudianOpRequest<OrderUpdateOrderAmountParam> {



	@Override
	public String getUrlPath(){
		return "/order/updateOrderAmount";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderUpdateOrderAmountResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}