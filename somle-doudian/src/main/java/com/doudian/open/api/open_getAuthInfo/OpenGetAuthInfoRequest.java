package com.doudian.open.api.open_getAuthInfo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.open_getAuthInfo.param.*;

//auto generated, do not edit

public class OpenGetAuthInfoRequest extends DoudianOpRequest<OpenGetAuthInfoParam> {



	@Override
	public String getUrlPath(){
		return "/open/getAuthInfo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OpenGetAuthInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}