package com.doudian.open.api.product_getCategoryPropertyValue;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getCategoryPropertyValue.param.*;

//auto generated, do not edit

public class ProductGetCategoryPropertyValueRequest extends DoudianOpRequest<ProductGetCategoryPropertyValueParam> {



	@Override
	public String getUrlPath(){
		return "/product/getCategoryPropertyValue";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetCategoryPropertyValueResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}