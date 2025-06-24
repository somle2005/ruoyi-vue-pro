package com.doudian.open.api.product_editSchema;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_editSchema.param.*;

//auto generated, do not edit

public class ProductEditSchemaRequest extends DoudianOpRequest<ProductEditSchemaParam> {



	@Override
	public String getUrlPath(){
		return "/product/editSchema";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductEditSchemaResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}