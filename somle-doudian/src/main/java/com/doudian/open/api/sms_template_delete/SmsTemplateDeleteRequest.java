package com.doudian.open.api.sms_template_delete;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_template_delete.param.*;

//auto generated, do not edit

public class SmsTemplateDeleteRequest extends DoudianOpRequest<SmsTemplateDeleteParam> {



	@Override
	public String getUrlPath(){
		return "/sms/template/delete";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsTemplateDeleteResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}