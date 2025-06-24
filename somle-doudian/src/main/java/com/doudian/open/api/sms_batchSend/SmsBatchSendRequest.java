package com.doudian.open.api.sms_batchSend;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_batchSend.param.*;

//auto generated, do not edit

public class SmsBatchSendRequest extends DoudianOpRequest<SmsBatchSendParam> {



	@Override
	public String getUrlPath(){
		return "/sms/batchSend";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsBatchSendResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}