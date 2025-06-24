package com.doudian.open.api.open_openId_replace;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.open_openId_replace.param.*;

//auto generated, do not edit

public class OpenOpenIdReplaceRequest extends DoudianOpRequest<OpenOpenIdReplaceParam> {



	@Override
	public String getUrlPath(){
		return "/open/openId/replace";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OpenOpenIdReplaceResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}