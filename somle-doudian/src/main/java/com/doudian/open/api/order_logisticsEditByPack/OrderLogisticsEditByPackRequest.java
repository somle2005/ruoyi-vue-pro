package com.doudian.open.api.order_logisticsEditByPack;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_logisticsEditByPack.param.*;

//auto generated, do not edit

public class OrderLogisticsEditByPackRequest extends DoudianOpRequest<OrderLogisticsEditByPackParam> {



	@Override
	public String getUrlPath(){
		return "/order/logisticsEditByPack";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderLogisticsEditByPackResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}