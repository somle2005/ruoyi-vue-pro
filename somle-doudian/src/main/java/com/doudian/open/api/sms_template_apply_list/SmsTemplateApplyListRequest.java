package com.doudian.open.api.sms_template_apply_list;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_template_apply_list.param.*;

//auto generated, do not edit

public class SmsTemplateApplyListRequest extends DoudianOpRequest<SmsTemplateApplyListParam> {



	@Override
	public String getUrlPath(){
		return "/sms/template/apply/list";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsTemplateApplyListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}