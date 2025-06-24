package com.doudian.open.api.product_GetRecommendCategory;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_GetRecommendCategory.param.*;

//auto generated, do not edit

public class ProductGetRecommendCategoryRequest extends DoudianOpRequest<ProductGetRecommendCategoryParam> {



	@Override
	public String getUrlPath(){
		return "/product/GetRecommendCategory";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetRecommendCategoryResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}