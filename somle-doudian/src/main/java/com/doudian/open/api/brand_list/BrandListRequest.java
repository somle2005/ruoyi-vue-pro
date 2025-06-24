package com.doudian.open.api.brand_list;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.brand_list.param.*;

//auto generated, do not edit

public class BrandListRequest extends DoudianOpRequest<BrandListParam> {



	@Override
	public String getUrlPath(){
		return "/brand/list";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return BrandListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}