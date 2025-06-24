package com.doudian.open.api.order_AddressAppliedSwitch;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_AddressAppliedSwitch.param.*;

//auto generated, do not edit

public class OrderAddressAppliedSwitchRequest extends DoudianOpRequest<OrderAddressAppliedSwitchParam> {



	@Override
	public String getUrlPath(){
		return "/order/AddressAppliedSwitch";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderAddressAppliedSwitchResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}