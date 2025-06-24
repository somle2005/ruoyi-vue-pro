package com.doudian.open.api.sms_template_revoke;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_template_revoke.param.*;

//auto generated, do not edit

public class SmsTemplateRevokeRequest extends DoudianOpRequest<SmsTemplateRevokeParam> {



	@Override
	public String getUrlPath(){
		return "/sms/template/revoke";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsTemplateRevokeResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}