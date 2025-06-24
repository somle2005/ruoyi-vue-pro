package com.doudian.open.api.instantShopping_trade_freightList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.instantShopping_trade_freightList.param.*;

//auto generated, do not edit

public class InstantShoppingTradeFreightListRequest extends DoudianOpRequest<InstantShoppingTradeFreightListParam> {



	@Override
	public String getUrlPath(){
		return "/instantShopping/trade/freightList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return InstantShoppingTradeFreightListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}