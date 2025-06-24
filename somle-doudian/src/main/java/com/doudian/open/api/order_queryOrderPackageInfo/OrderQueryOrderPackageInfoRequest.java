package com.doudian.open.api.order_queryOrderPackageInfo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_queryOrderPackageInfo.param.*;

//auto generated, do not edit

public class OrderQueryOrderPackageInfoRequest extends DoudianOpRequest<OrderQueryOrderPackageInfoParam> {



	@Override
	public String getUrlPath(){
		return "/order/queryOrderPackageInfo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderQueryOrderPackageInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}