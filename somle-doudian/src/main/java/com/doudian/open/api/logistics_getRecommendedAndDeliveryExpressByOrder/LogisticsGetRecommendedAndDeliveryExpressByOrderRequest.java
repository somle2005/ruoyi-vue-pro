package com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_getRecommendedAndDeliveryExpressByOrder.param.*;

//auto generated, do not edit

public class LogisticsGetRecommendedAndDeliveryExpressByOrderRequest extends DoudianOpRequest<LogisticsGetRecommendedAndDeliveryExpressByOrderParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/getRecommendedAndDeliveryExpressByOrder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsGetRecommendedAndDeliveryExpressByOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}