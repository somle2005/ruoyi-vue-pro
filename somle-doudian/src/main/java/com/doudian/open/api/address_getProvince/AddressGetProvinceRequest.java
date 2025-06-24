package com.doudian.open.api.address_getProvince;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_getProvince.param.*;

//auto generated, do not edit

public class AddressGetProvinceRequest extends DoudianOpRequest<AddressGetProvinceParam> {



	@Override
	public String getUrlPath(){
		return "/address/getProvince";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressGetProvinceResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}