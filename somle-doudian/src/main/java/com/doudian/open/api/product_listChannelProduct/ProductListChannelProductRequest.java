package com.doudian.open.api.product_listChannelProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_listChannelProduct.param.*;

//auto generated, do not edit

public class ProductListChannelProductRequest extends DoudianOpRequest<ProductListChannelProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/listChannelProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductListChannelProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}