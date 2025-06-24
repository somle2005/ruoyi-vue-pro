package com.doudian.open.api.product_getProductShopRule;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getProductShopRule.param.*;

//auto generated, do not edit

public class ProductGetProductShopRuleRequest extends DoudianOpRequest<ProductGetProductShopRuleParam> {



	@Override
	public String getUrlPath(){
		return "/product/getProductShopRule";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetProductShopRuleResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}