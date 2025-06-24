package com.doudian.open.api.address_listAftersaleStrategy;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_listAftersaleStrategy.param.*;

//auto generated, do not edit

public class AddressListAftersaleStrategyRequest extends DoudianOpRequest<AddressListAftersaleStrategyParam> {



	@Override
	public String getUrlPath(){
		return "/address/listAftersaleStrategy";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressListAftersaleStrategyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}