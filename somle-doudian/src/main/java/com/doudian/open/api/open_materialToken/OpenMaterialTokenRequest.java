package com.doudian.open.api.open_materialToken;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.open_materialToken.param.*;

//auto generated, do not edit

public class OpenMaterialTokenRequest extends DoudianOpRequest<OpenMaterialTokenParam> {



	@Override
	public String getUrlPath(){
		return "/open/materialToken";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return OpenMaterialTokenResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}