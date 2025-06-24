package com.doudian.open.api.coupons_extendCertValidEndByOrder;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.coupons_extendCertValidEndByOrder.param.*;

//auto generated, do not edit

public class CouponsExtendCertValidEndByOrderRequest extends DoudianOpRequest<CouponsExtendCertValidEndByOrderParam> {



	@Override
	public String getUrlPath(){
		return "/coupons/extendCertValidEndByOrder";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return CouponsExtendCertValidEndByOrderResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}