package com.doudian.open.api.logistics_listShopNetsite;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_listShopNetsite.param.*;

//auto generated, do not edit

public class LogisticsListShopNetsiteRequest extends DoudianOpRequest<LogisticsListShopNetsiteParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/listShopNetsite";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsListShopNetsiteResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}