package com.doudian.open.api.order_serviceDetail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_serviceDetail.param.*;

//auto generated, do not edit

public class OrderServiceDetailRequest extends DoudianOpRequest<OrderServiceDetailParam> {



	@Override
	public String getUrlPath(){
		return "/order/serviceDetail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderServiceDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}