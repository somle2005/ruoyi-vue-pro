package com.doudian.open.api.order_updatePostAmount;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_updatePostAmount.param.*;

//auto generated, do not edit

public class OrderUpdatePostAmountRequest extends DoudianOpRequest<OrderUpdatePostAmountParam> {



	@Override
	public String getUrlPath(){
		return "/order/updatePostAmount";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderUpdatePostAmountResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}