package com.doudian.open.api.sms_sign_delete;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_sign_delete.param.*;

//auto generated, do not edit

public class SmsSignDeleteRequest extends DoudianOpRequest<SmsSignDeleteParam> {



	@Override
	public String getUrlPath(){
		return "/sms/sign/delete";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsSignDeleteResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}