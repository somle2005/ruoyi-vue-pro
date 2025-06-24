package com.doudian.open.api.product_addCbProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_addCbProduct.param.*;

//auto generated, do not edit

public class ProductAddCbProductRequest extends DoudianOpRequest<ProductAddCbProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/addCbProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductAddCbProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}