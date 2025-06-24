package com.doudian.open.api.order_logisticsAddMultiPack;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_logisticsAddMultiPack.param.*;

//auto generated, do not edit

public class OrderLogisticsAddMultiPackRequest extends DoudianOpRequest<OrderLogisticsAddMultiPackParam> {



	@Override
	public String getUrlPath(){
		return "/order/logisticsAddMultiPack";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderLogisticsAddMultiPackResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}