package com.doudian.open.api.product_launchProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_launchProduct.param.*;

//auto generated, do not edit

public class ProductLaunchProductRequest extends DoudianOpRequest<ProductLaunchProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/launchProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductLaunchProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}