package com.doudian.open.api.address_areaList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.address_areaList.param.*;

//auto generated, do not edit

public class AddressAreaListRequest extends DoudianOpRequest<AddressAreaListParam> {



	@Override
	public String getUrlPath(){
		return "/address/areaList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AddressAreaListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}