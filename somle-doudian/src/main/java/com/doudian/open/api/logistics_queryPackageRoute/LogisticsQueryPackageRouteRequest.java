package com.doudian.open.api.logistics_queryPackageRoute;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_queryPackageRoute.param.*;

//auto generated, do not edit

public class LogisticsQueryPackageRouteRequest extends DoudianOpRequest<LogisticsQueryPackageRouteParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/queryPackageRoute";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsQueryPackageRouteResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}