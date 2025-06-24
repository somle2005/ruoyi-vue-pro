package com.doudian.open.api.product_getCatePropertyV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getCatePropertyV2.param.*;

//auto generated, do not edit

public class ProductGetCatePropertyV2Request extends DoudianOpRequest<ProductGetCatePropertyV2Param> {



	@Override
	public String getUrlPath(){
		return "/product/getCatePropertyV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetCatePropertyV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}