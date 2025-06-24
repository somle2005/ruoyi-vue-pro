package com.doudian.open.api.material_mGetPlayInfo;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_mGetPlayInfo.param.*;

//auto generated, do not edit

public class MaterialMGetPlayInfoRequest extends DoudianOpRequest<MaterialMGetPlayInfoParam> {



	@Override
	public String getUrlPath(){
		return "/material/mGetPlayInfo";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialMGetPlayInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}