package com.doudian.open.api.sku_detail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sku_detail.param.*;

//auto generated, do not edit

public class SkuDetailRequest extends DoudianOpRequest<SkuDetailParam> {



	@Override
	public String getUrlPath(){
		return "/sku/detail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SkuDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}