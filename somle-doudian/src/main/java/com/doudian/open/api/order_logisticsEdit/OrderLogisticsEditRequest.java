package com.doudian.open.api.order_logisticsEdit;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_logisticsEdit.param.*;

//auto generated, do not edit

public class OrderLogisticsEditRequest extends DoudianOpRequest<OrderLogisticsEditParam> {



	@Override
	public String getUrlPath(){
		return "/order/logisticsEdit";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderLogisticsEditResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}