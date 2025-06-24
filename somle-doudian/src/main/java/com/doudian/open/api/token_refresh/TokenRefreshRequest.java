package com.doudian.open.api.token_refresh;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.token_refresh.param.*;

//auto generated, do not edit

public class TokenRefreshRequest extends DoudianOpRequest<TokenRefreshParam> {



	@Override
	public String getUrlPath(){
		return "/token/refresh";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return TokenRefreshResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}