package com.doudian.open.api.token_create;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.token_create.param.*;

//auto generated, do not edit

public class TokenCreateRequest extends DoudianOpRequest<TokenCreateParam> {



	@Override
	public String getUrlPath(){
		return "/token/create";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return TokenCreateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}