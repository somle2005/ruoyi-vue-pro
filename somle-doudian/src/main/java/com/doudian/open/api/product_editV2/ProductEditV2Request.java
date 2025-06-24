package com.doudian.open.api.product_editV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_editV2.param.*;

//auto generated, do not edit

public class ProductEditV2Request extends DoudianOpRequest<ProductEditV2Param> {



	@Override
	public String getUrlPath(){
		return "/product/editV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductEditV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}