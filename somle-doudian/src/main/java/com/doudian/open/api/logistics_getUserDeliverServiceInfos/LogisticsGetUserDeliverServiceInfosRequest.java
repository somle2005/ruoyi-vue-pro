package com.doudian.open.api.logistics_getUserDeliverServiceInfos;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_getUserDeliverServiceInfos.param.*;

//auto generated, do not edit

public class LogisticsGetUserDeliverServiceInfosRequest extends DoudianOpRequest<LogisticsGetUserDeliverServiceInfosParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/getUserDeliverServiceInfos";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsGetUserDeliverServiceInfosResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}