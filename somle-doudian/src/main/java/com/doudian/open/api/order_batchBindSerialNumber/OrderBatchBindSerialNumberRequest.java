package com.doudian.open.api.order_batchBindSerialNumber;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_batchBindSerialNumber.param.*;

//auto generated, do not edit

public class OrderBatchBindSerialNumberRequest extends DoudianOpRequest<OrderBatchBindSerialNumberParam> {



	@Override
	public String getUrlPath(){
		return "/order/batchBindSerialNumber";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderBatchBindSerialNumberResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}