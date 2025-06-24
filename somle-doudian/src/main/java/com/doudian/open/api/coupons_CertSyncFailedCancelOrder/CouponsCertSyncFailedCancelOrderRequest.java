package com.doudian.open.api.coupons_CertSyncFailedCancelOrder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.coupons_CertSyncFailedCancelOrder.param.*;

//auto generated, do not edit

public class CouponsCertSyncFailedCancelOrderRequest extends DoudianOpRequest<CouponsCertSyncFailedCancelOrderParam> {



	@Override
	public String getUrlPath(){
		return "/coupons/CertSyncFailedCancelOrder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return CouponsCertSyncFailedCancelOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}