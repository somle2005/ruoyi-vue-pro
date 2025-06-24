package com.doudian.open.api.logistics_customTemplateList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_customTemplateList.param.*;

//auto generated, do not edit

public class LogisticsCustomTemplateListRequest extends DoudianOpRequest<LogisticsCustomTemplateListParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/customTemplateList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsCustomTemplateListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}