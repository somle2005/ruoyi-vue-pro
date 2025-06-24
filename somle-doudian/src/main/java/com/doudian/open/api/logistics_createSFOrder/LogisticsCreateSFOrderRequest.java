package com.doudian.open.api.logistics_createSFOrder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_createSFOrder.param.*;

//auto generated, do not edit

public class LogisticsCreateSFOrderRequest extends DoudianOpRequest<LogisticsCreateSFOrderParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/createSFOrder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsCreateSFOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}