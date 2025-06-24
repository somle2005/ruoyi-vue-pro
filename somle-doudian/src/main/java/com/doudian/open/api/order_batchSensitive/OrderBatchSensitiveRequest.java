package com.doudian.open.api.order_batchSensitive;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_batchSensitive.param.*;

//auto generated, do not edit

public class OrderBatchSensitiveRequest extends DoudianOpRequest<OrderBatchSensitiveParam> {



	@Override
	public String getUrlPath(){
		return "/order/batchSensitive";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderBatchSensitiveResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}