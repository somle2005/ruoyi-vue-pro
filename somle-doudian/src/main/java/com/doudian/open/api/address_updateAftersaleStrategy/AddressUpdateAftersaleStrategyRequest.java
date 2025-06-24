package com.doudian.open.api.address_updateAftersaleStrategy;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_updateAftersaleStrategy.param.*;

//auto generated, do not edit

public class AddressUpdateAftersaleStrategyRequest extends DoudianOpRequest<AddressUpdateAftersaleStrategyParam> {



	@Override
	public String getUrlPath(){
		return "/address/updateAftersaleStrategy";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressUpdateAftersaleStrategyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}