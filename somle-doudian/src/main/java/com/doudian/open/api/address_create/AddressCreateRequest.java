package com.doudian.open.api.address_create;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_create.param.*;

//auto generated, do not edit

public class AddressCreateRequest extends DoudianOpRequest<AddressCreateParam> {



	@Override
	public String getUrlPath(){
		return "/address/create";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}