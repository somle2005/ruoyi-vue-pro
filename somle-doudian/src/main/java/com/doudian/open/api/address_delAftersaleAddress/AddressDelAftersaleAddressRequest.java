package com.doudian.open.api.address_delAftersaleAddress;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_delAftersaleAddress.param.*;

//auto generated, do not edit

public class AddressDelAftersaleAddressRequest extends DoudianOpRequest<AddressDelAftersaleAddressParam> {



	@Override
	public String getUrlPath(){
		return "/address/delAftersaleAddress";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressDelAftersaleAddressResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}