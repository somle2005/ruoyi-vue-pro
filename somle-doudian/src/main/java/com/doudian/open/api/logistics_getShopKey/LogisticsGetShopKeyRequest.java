package com.doudian.open.api.logistics_getShopKey;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_getShopKey.param.*;

//auto generated, do not edit

public class LogisticsGetShopKeyRequest extends DoudianOpRequest<LogisticsGetShopKeyParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/getShopKey";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsGetShopKeyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}