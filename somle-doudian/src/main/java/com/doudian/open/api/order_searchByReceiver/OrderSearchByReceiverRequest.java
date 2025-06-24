package com.doudian.open.api.order_searchByReceiver;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_searchByReceiver.param.*;

//auto generated, do not edit

public class OrderSearchByReceiverRequest extends DoudianOpRequest<OrderSearchByReceiverParam> {



	@Override
	public String getUrlPath(){
		return "/order/searchByReceiver";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderSearchByReceiverResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}