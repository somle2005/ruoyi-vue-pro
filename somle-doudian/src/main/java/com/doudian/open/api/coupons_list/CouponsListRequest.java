package com.doudian.open.api.coupons_list;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.coupons_list.param.*;

//auto generated, do not edit

public class CouponsListRequest extends DoudianOpRequest<CouponsListParam> {



	@Override
	public String getUrlPath(){
		return "/coupons/list";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return CouponsListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}