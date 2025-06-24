package com.doudian.open.api.product_addSchema;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_addSchema.param.*;

//auto generated, do not edit

public class ProductAddSchemaRequest extends DoudianOpRequest<ProductAddSchemaParam> {



	@Override
	public String getUrlPath(){
		return "/product/addSchema";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductAddSchemaResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}