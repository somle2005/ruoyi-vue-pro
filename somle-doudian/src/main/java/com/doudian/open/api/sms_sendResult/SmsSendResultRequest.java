package com.doudian.open.api.sms_sendResult;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_sendResult.param.*;

//auto generated, do not edit

public class SmsSendResultRequest extends DoudianOpRequest<SmsSendResultParam> {



	@Override
	public String getUrlPath(){
		return "/sms/sendResult";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsSendResultResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}