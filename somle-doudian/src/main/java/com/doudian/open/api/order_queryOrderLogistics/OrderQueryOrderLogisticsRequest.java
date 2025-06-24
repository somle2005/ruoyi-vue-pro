package com.doudian.open.api.order_queryOrderLogistics;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_queryOrderLogistics.param.*;

//auto generated, do not edit

public class OrderQueryOrderLogisticsRequest extends DoudianOpRequest<OrderQueryOrderLogisticsParam> {



	@Override
	public String getUrlPath(){
		return "/order/queryOrderLogistics";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderQueryOrderLogisticsResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}