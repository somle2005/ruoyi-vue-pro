package com.doudian.open.api.sms_sign_search;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_sign_search.param.*;

//auto generated, do not edit

public class SmsSignSearchRequest extends DoudianOpRequest<SmsSignSearchParam> {



	@Override
	public String getUrlPath(){
		return "/sms/sign/search";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsSignSearchResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}