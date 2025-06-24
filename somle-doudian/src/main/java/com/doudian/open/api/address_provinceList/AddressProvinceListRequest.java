package com.doudian.open.api.address_provinceList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_provinceList.param.*;

//auto generated, do not edit

public class AddressProvinceListRequest extends DoudianOpRequest<AddressProvinceListParam> {



	@Override
	public String getUrlPath(){
		return "/address/provinceList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressProvinceListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}