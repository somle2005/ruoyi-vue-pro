package com.doudian.open.api.order_getCrossBorderFulfillInfo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_getCrossBorderFulfillInfo.param.*;

//auto generated, do not edit

public class OrderGetCrossBorderFulfillInfoRequest extends DoudianOpRequest<OrderGetCrossBorderFulfillInfoParam> {



	@Override
	public String getUrlPath(){
		return "/order/getCrossBorderFulfillInfo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderGetCrossBorderFulfillInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}