package com.doudian.open.api.material_get_cap_info;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.material_get_cap_info.param.*;

//auto generated, do not edit

public class MaterialGetCapInfoRequest extends DoudianOpRequest<MaterialGetCapInfoParam> {



	@Override
	public String getUrlPath(){
		return "/material/get_cap_info";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return MaterialGetCapInfoResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}