package com.doudian.open.api.logistics_cancelOrder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_cancelOrder.param.*;

//auto generated, do not edit

public class LogisticsCancelOrderRequest extends DoudianOpRequest<LogisticsCancelOrderParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/cancelOrder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsCancelOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}