package com.doudian.open.api.product_recommendProperties;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_recommendProperties.param.*;

//auto generated, do not edit

public class ProductRecommendPropertiesRequest extends DoudianOpRequest<ProductRecommendPropertiesParam> {



	@Override
	public String getUrlPath(){
		return "/product/recommendProperties";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductRecommendPropertiesResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}