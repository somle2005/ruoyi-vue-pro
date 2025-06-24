package com.doudian.open.api.product_updateChannelProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_updateChannelProduct.param.*;

//auto generated, do not edit

public class ProductUpdateChannelProductRequest extends DoudianOpRequest<ProductUpdateChannelProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/updateChannelProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductUpdateChannelProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}