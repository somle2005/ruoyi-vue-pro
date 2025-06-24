package com.doudian.open.api.order_logisticsAddSinglePack;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_logisticsAddSinglePack.param.*;

//auto generated, do not edit

public class OrderLogisticsAddSinglePackRequest extends DoudianOpRequest<OrderLogisticsAddSinglePackParam> {



	@Override
	public String getUrlPath(){
		return "/order/logisticsAddSinglePack";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderLogisticsAddSinglePackResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}