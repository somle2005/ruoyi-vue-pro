package com.doudian.open.api.order_PackageProcessFail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.order_PackageProcessFail.param.*;

//auto generated, do not edit

public class OrderPackageProcessFailRequest extends DoudianOpRequest<OrderPackageProcessFailParam> {



	@Override
	public String getUrlPath(){
		return "/order/PackageProcessFail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OrderPackageProcessFailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}