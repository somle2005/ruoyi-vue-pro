package com.doudian.open.api.coupons_cancelVerify;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.coupons_cancelVerify.param.*;

//auto generated, do not edit

public class CouponsCancelVerifyRequest extends DoudianOpRequest<CouponsCancelVerifyParam> {



	@Override
	public String getUrlPath(){
		return "/coupons/cancelVerify";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return CouponsCancelVerifyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}