package com.doudian.open.api.order_addresSwitchConfig;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_addresSwitchConfig.param.*;

//auto generated, do not edit

public class OrderAddresSwitchConfigRequest extends DoudianOpRequest<OrderAddresSwitchConfigParam> {



	@Override
	public String getUrlPath(){
		return "/order/addresSwitchConfig";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderAddresSwitchConfigResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}