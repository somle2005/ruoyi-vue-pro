package com.doudian.open.api.address_list;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_list.param.*;

//auto generated, do not edit

public class AddressListRequest extends DoudianOpRequest<AddressListParam> {



	@Override
	public String getUrlPath(){
		return "/address/list";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}