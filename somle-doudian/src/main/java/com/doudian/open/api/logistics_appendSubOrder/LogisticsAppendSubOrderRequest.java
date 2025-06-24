package com.doudian.open.api.logistics_appendSubOrder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_appendSubOrder.param.*;

//auto generated, do not edit

public class LogisticsAppendSubOrderRequest extends DoudianOpRequest<LogisticsAppendSubOrderParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/appendSubOrder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsAppendSubOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}