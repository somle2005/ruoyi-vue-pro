package com.doudian.open.api.product_getCascadeValue;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getCascadeValue.param.*;

//auto generated, do not edit

public class ProductGetCascadeValueRequest extends DoudianOpRequest<ProductGetCascadeValueParam> {



	@Override
	public String getUrlPath(){
		return "/product/getCascadeValue";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetCascadeValueResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}