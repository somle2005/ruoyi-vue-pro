package com.doudian.open.api.logistics_getOutRange;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_getOutRange.param.*;

//auto generated, do not edit

public class LogisticsGetOutRangeRequest extends DoudianOpRequest<LogisticsGetOutRangeParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/getOutRange";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsGetOutRangeResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}