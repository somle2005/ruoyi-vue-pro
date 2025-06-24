package com.doudian.open.api.product_detail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_detail.param.*;

//auto generated, do not edit

public class ProductDetailRequest extends DoudianOpRequest<ProductDetailParam> {



	@Override
	public String getUrlPath(){
		return "/product/detail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}