package com.doudian.open.api.antispam_userLogin;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.antispam_userLogin.param.*;

//auto generated, do not edit

public class AntispamUserLoginRequest extends DoudianOpRequest<AntispamUserLoginParam> {



	@Override
	public String getUrlPath(){
		return "/antispam/userLogin";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return AntispamUserLoginResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}