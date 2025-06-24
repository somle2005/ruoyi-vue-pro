package com.doudian.open.api.coupons_abandon;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.coupons_abandon.param.*;

//auto generated, do not edit

public class CouponsAbandonRequest extends DoudianOpRequest<CouponsAbandonParam> {



	@Override
	public String getUrlPath(){
		return "/coupons/abandon";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return CouponsAbandonResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}