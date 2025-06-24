package com.doudian.open.api.order_addSerialNumber;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_addSerialNumber.param.*;

//auto generated, do not edit

public class OrderAddSerialNumberRequest extends DoudianOpRequest<OrderAddSerialNumberParam> {



	@Override
	public String getUrlPath(){
		return "/order/addSerialNumber";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderAddSerialNumberResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}