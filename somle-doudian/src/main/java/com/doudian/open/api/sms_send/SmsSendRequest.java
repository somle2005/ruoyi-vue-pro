package com.doudian.open.api.sms_send;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_send.param.*;

//auto generated, do not edit

public class SmsSendRequest extends DoudianOpRequest<SmsSendParam> {



	@Override
	public String getUrlPath(){
		return "/sms/send";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsSendResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}