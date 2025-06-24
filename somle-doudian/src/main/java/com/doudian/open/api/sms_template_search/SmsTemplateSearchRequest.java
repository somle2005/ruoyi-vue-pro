package com.doudian.open.api.sms_template_search;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_template_search.param.*;

//auto generated, do not edit

public class SmsTemplateSearchRequest extends DoudianOpRequest<SmsTemplateSearchParam> {



	@Override
	public String getUrlPath(){
		return "/sms/template/search";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsTemplateSearchResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}