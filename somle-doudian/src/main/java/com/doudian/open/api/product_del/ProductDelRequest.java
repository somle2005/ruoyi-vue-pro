package com.doudian.open.api.product_del;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_del.param.*;

//auto generated, do not edit

public class ProductDelRequest extends DoudianOpRequest<ProductDelParam> {



	@Override
	public String getUrlPath(){
		return "/product/del";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductDelResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}