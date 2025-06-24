package com.doudian.open.api.sms_public_template;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_public_template.param.*;

//auto generated, do not edit

public class SmsPublicTemplateRequest extends DoudianOpRequest<SmsPublicTemplateParam> {



	@Override
	public String getUrlPath(){
		return "/sms/public/template";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsPublicTemplateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}