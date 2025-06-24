package com.doudian.open.api.logistics_pushOnlineServiceConfig;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_pushOnlineServiceConfig.param.*;

//auto generated, do not edit

public class LogisticsPushOnlineServiceConfigRequest extends DoudianOpRequest<LogisticsPushOnlineServiceConfigParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/pushOnlineServiceConfig";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsPushOnlineServiceConfigResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}