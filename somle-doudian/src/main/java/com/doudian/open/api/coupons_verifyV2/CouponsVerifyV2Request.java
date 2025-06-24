package com.doudian.open.api.coupons_verifyV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.coupons_verifyV2.param.*;

//auto generated, do not edit

public class CouponsVerifyV2Request extends DoudianOpRequest<CouponsVerifyV2Param> {



	@Override
	public String getUrlPath(){
		return "/coupons/verifyV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return CouponsVerifyV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}