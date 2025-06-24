package com.doudian.open.api.address_getAftersaleStrategy;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_getAftersaleStrategy.param.*;

//auto generated, do not edit

public class AddressGetAftersaleStrategyRequest extends DoudianOpRequest<AddressGetAftersaleStrategyParam> {



	@Override
	public String getUrlPath(){
		return "/address/getAftersaleStrategy";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressGetAftersaleStrategyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}