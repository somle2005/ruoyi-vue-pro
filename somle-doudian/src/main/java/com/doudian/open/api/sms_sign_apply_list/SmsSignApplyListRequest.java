package com.doudian.open.api.sms_sign_apply_list;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sms_sign_apply_list.param.*;

//auto generated, do not edit

public class SmsSignApplyListRequest extends DoudianOpRequest<SmsSignApplyListParam> {



	@Override
	public String getUrlPath(){
		return "/sms/sign/apply/list";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SmsSignApplyListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}