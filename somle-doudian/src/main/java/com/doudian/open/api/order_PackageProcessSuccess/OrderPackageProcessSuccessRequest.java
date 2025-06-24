package com.doudian.open.api.order_PackageProcessSuccess;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_PackageProcessSuccess.param.*;

//auto generated, do not edit

public class OrderPackageProcessSuccessRequest extends DoudianOpRequest<OrderPackageProcessSuccessParam> {



	@Override
	public String getUrlPath(){
		return "/order/PackageProcessSuccess";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderPackageProcessSuccessResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}