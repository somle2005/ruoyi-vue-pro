package com.doudian.open.api.order_addressModify;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_addressModify.param.*;

//auto generated, do not edit

public class OrderAddressModifyRequest extends DoudianOpRequest<OrderAddressModifyParam> {



	@Override
	public String getUrlPath(){
		return "/order/addressModify";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderAddressModifyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}