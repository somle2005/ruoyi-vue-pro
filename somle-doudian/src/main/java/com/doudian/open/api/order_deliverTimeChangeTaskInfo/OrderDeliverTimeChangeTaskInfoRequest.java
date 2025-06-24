package com.doudian.open.api.order_deliverTimeChangeTaskInfo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_deliverTimeChangeTaskInfo.param.*;

//auto generated, do not edit

public class OrderDeliverTimeChangeTaskInfoRequest extends DoudianOpRequest<OrderDeliverTimeChangeTaskInfoParam> {



	@Override
	public String getUrlPath(){
		return "/order/deliverTimeChangeTaskInfo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderDeliverTimeChangeTaskInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}