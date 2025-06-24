package com.doudian.open.api.logistics_templateList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_templateList.param.*;

//auto generated, do not edit

public class LogisticsTemplateListRequest extends DoudianOpRequest<LogisticsTemplateListParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/templateList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsTemplateListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}