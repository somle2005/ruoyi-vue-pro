package com.doudian.open.api.sms_sign_apply;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_sign_apply.param.*;

//auto generated, do not edit

public class SmsSignApplyRequest extends DoudianOpRequest<SmsSignApplyParam> {



	@Override
	public String getUrlPath(){
		return "/sms/sign/apply";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsSignApplyResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}