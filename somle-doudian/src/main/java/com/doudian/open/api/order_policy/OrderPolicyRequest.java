package com.doudian.open.api.order_policy;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_policy.param.*;

//auto generated, do not edit

public class OrderPolicyRequest extends DoudianOpRequest<OrderPolicyParam> {



	@Override
	public String getUrlPath(){
		return "/order/policy";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderPolicyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}