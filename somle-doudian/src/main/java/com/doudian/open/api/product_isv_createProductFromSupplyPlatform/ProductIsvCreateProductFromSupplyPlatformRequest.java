package com.doudian.open.api.product_isv_createProductFromSupplyPlatform;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_isv_createProductFromSupplyPlatform.param.*;

//auto generated, do not edit

public class ProductIsvCreateProductFromSupplyPlatformRequest extends DoudianOpRequest<ProductIsvCreateProductFromSupplyPlatformParam> {



	@Override
	public String getUrlPath(){
		return "/product/isv/createProductFromSupplyPlatform";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductIsvCreateProductFromSupplyPlatformResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}