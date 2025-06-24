package com.doudian.open.api.sms_template_apply;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_template_apply.param.*;

//auto generated, do not edit

public class SmsTemplateApplyRequest extends DoudianOpRequest<SmsTemplateApplyParam> {



	@Override
	public String getUrlPath(){
		return "/sms/template/apply";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsTemplateApplyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}