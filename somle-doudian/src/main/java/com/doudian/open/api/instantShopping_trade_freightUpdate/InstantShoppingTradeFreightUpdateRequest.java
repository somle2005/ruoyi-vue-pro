package com.doudian.open.api.instantShopping_trade_freightUpdate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.instantShopping_trade_freightUpdate.param.*;

//auto generated, do not edit

public class InstantShoppingTradeFreightUpdateRequest extends DoudianOpRequest<InstantShoppingTradeFreightUpdateParam> {



	@Override
	public String getUrlPath(){
		return "/instantShopping/trade/freightUpdate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return InstantShoppingTradeFreightUpdateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}