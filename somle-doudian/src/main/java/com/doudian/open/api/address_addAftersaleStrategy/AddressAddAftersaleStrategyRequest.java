package com.doudian.open.api.address_addAftersaleStrategy;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_addAftersaleStrategy.param.*;

//auto generated, do not edit

public class AddressAddAftersaleStrategyRequest extends DoudianOpRequest<AddressAddAftersaleStrategyParam> {



	@Override
	public String getUrlPath(){
		return "/address/addAftersaleStrategy";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressAddAftersaleStrategyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}