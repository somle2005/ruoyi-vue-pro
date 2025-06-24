package com.doudian.open.api.instantShopping_trade_freightCreate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.instantShopping_trade_freightCreate.param.*;

//auto generated, do not edit

public class InstantShoppingTradeFreightCreateRequest extends DoudianOpRequest<InstantShoppingTradeFreightCreateParam> {



	@Override
	public String getUrlPath(){
		return "/instantShopping/trade/freightCreate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return InstantShoppingTradeFreightCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}