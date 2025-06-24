package com.doudian.open.api.coupons_syncV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.coupons_syncV2.param.*;

//auto generated, do not edit

public class CouponsSyncV2Request extends DoudianOpRequest<CouponsSyncV2Param> {



	@Override
	public String getUrlPath(){
		return "/coupons/syncV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return CouponsSyncV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}