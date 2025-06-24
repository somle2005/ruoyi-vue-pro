package com.doudian.open.api.order_insurance;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_insurance.param.*;

//auto generated, do not edit

public class OrderInsuranceRequest extends DoudianOpRequest<OrderInsuranceParam> {



	@Override
	public String getUrlPath(){
		return "/order/insurance";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderInsuranceResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}