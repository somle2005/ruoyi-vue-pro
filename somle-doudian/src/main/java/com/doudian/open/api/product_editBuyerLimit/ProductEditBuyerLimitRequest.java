package com.doudian.open.api.product_editBuyerLimit;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_editBuyerLimit.param.*;

//auto generated, do not edit

public class ProductEditBuyerLimitRequest extends DoudianOpRequest<ProductEditBuyerLimitParam> {



	@Override
	public String getUrlPath(){
		return "/product/editBuyerLimit";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductEditBuyerLimitResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}