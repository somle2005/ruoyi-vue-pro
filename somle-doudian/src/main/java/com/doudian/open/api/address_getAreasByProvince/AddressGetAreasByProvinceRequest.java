package com.doudian.open.api.address_getAreasByProvince;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_getAreasByProvince.param.*;

//auto generated, do not edit

public class AddressGetAreasByProvinceRequest extends DoudianOpRequest<AddressGetAreasByProvinceParam> {



	@Override
	public String getUrlPath(){
		return "/address/getAreasByProvince";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressGetAreasByProvinceResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}