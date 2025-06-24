package com.doudian.open.api.brand_convert;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.brand_convert.param.*;

//auto generated, do not edit

public class BrandConvertRequest extends DoudianOpRequest<BrandConvertParam> {



	@Override
	public String getUrlPath(){
		return "/brand/convert";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BrandConvertResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}