package com.doudian.open.api.product_editComponentTemplate;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_editComponentTemplate.param.*;

//auto generated, do not edit

public class ProductEditComponentTemplateRequest extends DoudianOpRequest<ProductEditComponentTemplateParam> {



	@Override
	public String getUrlPath(){
		return "/product/editComponentTemplate";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductEditComponentTemplateResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}