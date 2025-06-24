package com.doudian.open.api.order_logisticsAdd;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_logisticsAdd.param.*;

//auto generated, do not edit

public class OrderLogisticsAddRequest extends DoudianOpRequest<OrderLogisticsAddParam> {



	@Override
	public String getUrlPath(){
		return "/order/logisticsAdd";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderLogisticsAddResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}