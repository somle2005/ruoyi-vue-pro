package com.doudian.open.api.coupons_certVerifyUpdate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.coupons_certVerifyUpdate.param.*;

//auto generated, do not edit

public class CouponsCertVerifyUpdateRequest extends DoudianOpRequest<CouponsCertVerifyUpdateParam> {



	@Override
	public String getUrlPath(){
		return "/coupons/certVerifyUpdate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return CouponsCertVerifyUpdateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}