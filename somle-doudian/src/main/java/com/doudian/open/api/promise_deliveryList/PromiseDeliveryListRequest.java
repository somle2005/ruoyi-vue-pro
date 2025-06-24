package com.doudian.open.api.promise_deliveryList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.promise_deliveryList.param.*;

//auto generated, do not edit

public class PromiseDeliveryListRequest extends DoudianOpRequest<PromiseDeliveryListParam> {



	@Override
	public String getUrlPath(){
		return "/promise/deliveryList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return PromiseDeliveryListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}