package com.doudian.open.api.product_addChannelProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_addChannelProduct.param.*;

//auto generated, do not edit

public class ProductAddChannelProductRequest extends DoudianOpRequest<ProductAddChannelProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/addChannelProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductAddChannelProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}