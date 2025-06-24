package com.doudian.open.api.instantShopping_trade_freightDetail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.instantShopping_trade_freightDetail.param.*;

//auto generated, do not edit

public class InstantShoppingTradeFreightDetailRequest extends DoudianOpRequest<InstantShoppingTradeFreightDetailParam> {



	@Override
	public String getUrlPath(){
		return "/instantShopping/trade/freightDetail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return InstantShoppingTradeFreightDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}