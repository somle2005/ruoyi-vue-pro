package com.doudian.open.api.logistics_registerPackageRoute;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_registerPackageRoute.param.*;

//auto generated, do not edit

public class LogisticsRegisterPackageRouteRequest extends DoudianOpRequest<LogisticsRegisterPackageRouteParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/registerPackageRoute";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsRegisterPackageRouteResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}