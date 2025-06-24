package com.doudian.open.api.product_getSchema;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getSchema.param.*;

//auto generated, do not edit

public class ProductGetSchemaRequest extends DoudianOpRequest<ProductGetSchemaParam> {



	@Override
	public String getUrlPath(){
		return "/product/getSchema";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetSchemaResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}