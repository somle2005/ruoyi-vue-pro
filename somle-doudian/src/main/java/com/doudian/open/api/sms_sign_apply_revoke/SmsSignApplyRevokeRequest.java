package com.doudian.open.api.sms_sign_apply_revoke;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_sign_apply_revoke.param.*;

//auto generated, do not edit

public class SmsSignApplyRevokeRequest extends DoudianOpRequest<SmsSignApplyRevokeParam> {



	@Override
	public String getUrlPath(){
		return "/sms/sign/apply/revoke";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsSignApplyRevokeResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}