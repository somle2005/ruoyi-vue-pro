package com.doudian.open.api.order_getServiceList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getServiceList.param.*;

//auto generated, do not edit

public class OrderGetServiceListRequest extends DoudianOpRequest<OrderGetServiceListParam> {



	@Override
	public String getUrlPath(){
		return "/order/getServiceList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetServiceListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}