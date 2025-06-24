package com.doudian.open.api.product_getRecommendName;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getRecommendName.param.*;

//auto generated, do not edit

public class ProductGetRecommendNameRequest extends DoudianOpRequest<ProductGetRecommendNameParam> {



	@Override
	public String getUrlPath(){
		return "/product/getRecommendName";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetRecommendNameResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}