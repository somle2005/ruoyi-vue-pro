package com.doudian.open.api.sku_list;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.sku_list.param.*;

//auto generated, do not edit

public class SkuListRequest extends DoudianOpRequest<SkuListParam> {



	@Override
	public String getUrlPath(){
		return "/sku/list";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return SkuListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}