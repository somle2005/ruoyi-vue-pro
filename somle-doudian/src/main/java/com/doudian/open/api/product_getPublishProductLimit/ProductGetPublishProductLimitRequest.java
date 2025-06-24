package com.doudian.open.api.product_getPublishProductLimit;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getPublishProductLimit.param.*;

//auto generated, do not edit

public class ProductGetPublishProductLimitRequest extends DoudianOpRequest<ProductGetPublishProductLimitParam> {



	@Override
	public String getUrlPath(){
		return "/product/getPublishProductLimit";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetPublishProductLimitResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}