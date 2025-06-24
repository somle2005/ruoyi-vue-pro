package com.doudian.open.api.product_getComponentTemplate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_getComponentTemplate.param.*;

//auto generated, do not edit

public class ProductGetComponentTemplateRequest extends DoudianOpRequest<ProductGetComponentTemplateParam> {



	@Override
	public String getUrlPath(){
		return "/product/getComponentTemplate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductGetComponentTemplateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}