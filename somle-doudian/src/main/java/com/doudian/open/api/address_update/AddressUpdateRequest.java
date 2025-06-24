package com.doudian.open.api.address_update;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_update.param.*;

//auto generated, do not edit

public class AddressUpdateRequest extends DoudianOpRequest<AddressUpdateParam> {



	@Override
	public String getUrlPath(){
		return "/address/update";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressUpdateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}