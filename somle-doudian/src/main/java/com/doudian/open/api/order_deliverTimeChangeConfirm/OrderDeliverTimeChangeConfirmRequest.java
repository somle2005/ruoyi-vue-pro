package com.doudian.open.api.order_deliverTimeChangeConfirm;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_deliverTimeChangeConfirm.param.*;

//auto generated, do not edit

public class OrderDeliverTimeChangeConfirmRequest extends DoudianOpRequest<OrderDeliverTimeChangeConfirmParam> {



	@Override
	public String getUrlPath(){
		return "/order/deliverTimeChangeConfirm";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderDeliverTimeChangeConfirmResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}