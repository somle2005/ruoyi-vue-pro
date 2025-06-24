package com.doudian.open.api.logistics_updateOrder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_updateOrder.param.*;

//auto generated, do not edit

public class LogisticsUpdateOrderRequest extends DoudianOpRequest<LogisticsUpdateOrderParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/updateOrder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsUpdateOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}