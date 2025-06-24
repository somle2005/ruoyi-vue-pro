package com.doudian.open.api.product_addV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_addV2.param.*;

//auto generated, do not edit

public class ProductAddV2Request extends DoudianOpRequest<ProductAddV2Param> {



	@Override
	public String getUrlPath(){
		return "/product/addV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductAddV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}