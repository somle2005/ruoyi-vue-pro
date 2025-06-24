package com.doudian.open.api.material_easyShuttle;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_easyShuttle.param.*;

//auto generated, do not edit

public class MaterialEasyShuttleRequest extends DoudianOpRequest<MaterialEasyShuttleParam> {



	@Override
	public String getUrlPath(){
		return "/material/easyShuttle";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialEasyShuttleResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}