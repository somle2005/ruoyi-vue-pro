package com.doudian.open.api.logistics_trackNoRouteDetail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_trackNoRouteDetail.param.*;

//auto generated, do not edit

public class LogisticsTrackNoRouteDetailRequest extends DoudianOpRequest<LogisticsTrackNoRouteDetailParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/trackNoRouteDetail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsTrackNoRouteDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}