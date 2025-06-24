package com.doudian.open.api.product_getProductUpdateRule;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getProductUpdateRule.param.*;

//auto generated, do not edit

public class ProductGetProductUpdateRuleRequest extends DoudianOpRequest<ProductGetProductUpdateRuleParam> {



	@Override
	public String getUrlPath(){
		return "/product/getProductUpdateRule";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetProductUpdateRuleResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}