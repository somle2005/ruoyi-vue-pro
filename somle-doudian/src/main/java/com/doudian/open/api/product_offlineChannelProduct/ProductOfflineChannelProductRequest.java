package com.doudian.open.api.product_offlineChannelProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_offlineChannelProduct.param.*;

//auto generated, do not edit

public class ProductOfflineChannelProductRequest extends DoudianOpRequest<ProductOfflineChannelProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/offlineChannelProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductOfflineChannelProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}