package com.doudian.open.api.product_datchDelComponentTemplate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_datchDelComponentTemplate.param.*;

//auto generated, do not edit

public class ProductDatchDelComponentTemplateRequest extends DoudianOpRequest<ProductDatchDelComponentTemplateParam> {



	@Override
	public String getUrlPath(){
		return "/product/datchDelComponentTemplate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductDatchDelComponentTemplateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}