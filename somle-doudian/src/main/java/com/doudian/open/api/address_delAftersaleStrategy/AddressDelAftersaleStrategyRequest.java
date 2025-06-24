package com.doudian.open.api.address_delAftersaleStrategy;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_delAftersaleStrategy.param.*;

//auto generated, do not edit

public class AddressDelAftersaleStrategyRequest extends DoudianOpRequest<AddressDelAftersaleStrategyParam> {



	@Override
	public String getUrlPath(){
		return "/address/delAftersaleStrategy";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressDelAftersaleStrategyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}