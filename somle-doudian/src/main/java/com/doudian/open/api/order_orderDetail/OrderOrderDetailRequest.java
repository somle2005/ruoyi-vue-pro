package com.doudian.open.api.order_orderDetail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_orderDetail.param.*;

//auto generated, do not edit

public class OrderOrderDetailRequest extends DoudianOpRequest<OrderOrderDetailParam> {



	@Override
	public String getUrlPath(){
		return "/order/orderDetail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderOrderDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}