package com.doudian.open.api.brand_getSug;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.brand_getSug.param.*;

//auto generated, do not edit

public class BrandGetSugRequest extends DoudianOpRequest<BrandGetSugParam> {



	@Override
	public String getUrlPath(){
		return "/brand/getSug";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BrandGetSugResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}