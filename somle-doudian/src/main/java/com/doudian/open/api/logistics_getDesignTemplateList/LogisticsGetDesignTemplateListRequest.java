package com.doudian.open.api.logistics_getDesignTemplateList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.logistics_getDesignTemplateList.param.*;

//auto generated, do not edit

public class LogisticsGetDesignTemplateListRequest extends DoudianOpRequest<LogisticsGetDesignTemplateListParam> {



	@Override
	public String getUrlPath(){
		return "/logistics/getDesignTemplateList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return LogisticsGetDesignTemplateListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}