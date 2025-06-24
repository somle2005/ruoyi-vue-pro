package com.doudian.open.api.order_orderCancel;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_orderCancel.param.*;

//auto generated, do not edit

public class OrderOrderCancelRequest extends DoudianOpRequest<OrderOrderCancelParam> {



	@Override
	public String getUrlPath(){
		return "/order/orderCancel";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderOrderCancelResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}