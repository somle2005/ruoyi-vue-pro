package com.doudian.open.api.logistics_getCustomTemplateList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_getCustomTemplateList.param.*;

//auto generated, do not edit

public class LogisticsGetCustomTemplateListRequest extends DoudianOpRequest<LogisticsGetCustomTemplateListParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/getCustomTemplateList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsGetCustomTemplateListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}