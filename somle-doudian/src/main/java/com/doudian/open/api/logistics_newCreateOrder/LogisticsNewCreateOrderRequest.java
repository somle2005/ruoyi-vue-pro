package com.doudian.open.api.logistics_newCreateOrder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_newCreateOrder.param.*;

//auto generated, do not edit

public class LogisticsNewCreateOrderRequest extends DoudianOpRequest<LogisticsNewCreateOrderParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/newCreateOrder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsNewCreateOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}