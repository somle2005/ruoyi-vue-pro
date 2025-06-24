package com.doudian.open.api.order_addressConfirm;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_addressConfirm.param.*;

//auto generated, do not edit

public class OrderAddressConfirmRequest extends DoudianOpRequest<OrderAddressConfirmParam> {



	@Override
	public String getUrlPath(){
		return "/order/addressConfirm";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderAddressConfirmResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}