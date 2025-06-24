package com.doudian.open.api.product_publishPreCheck;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_publishPreCheck.param.*;

//auto generated, do not edit

public class ProductPublishPreCheckRequest extends DoudianOpRequest<ProductPublishPreCheckParam> {



	@Override
	public String getUrlPath(){
		return "/product/publishPreCheck";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductPublishPreCheckResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}