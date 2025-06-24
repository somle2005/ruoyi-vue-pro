package com.doudian.open.api.product_openPropAutoOptimize;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_openPropAutoOptimize.param.*;

//auto generated, do not edit

public class ProductOpenPropAutoOptimizeRequest extends DoudianOpRequest<ProductOpenPropAutoOptimizeParam> {



	@Override
	public String getUrlPath(){
		return "/product/openPropAutoOptimize";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductOpenPropAutoOptimizeResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}