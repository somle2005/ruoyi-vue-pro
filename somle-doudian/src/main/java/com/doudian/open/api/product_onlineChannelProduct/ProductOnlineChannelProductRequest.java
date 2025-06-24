package com.doudian.open.api.product_onlineChannelProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_onlineChannelProduct.param.*;

//auto generated, do not edit

public class ProductOnlineChannelProductRequest extends DoudianOpRequest<ProductOnlineChannelProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/onlineChannelProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductOnlineChannelProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}