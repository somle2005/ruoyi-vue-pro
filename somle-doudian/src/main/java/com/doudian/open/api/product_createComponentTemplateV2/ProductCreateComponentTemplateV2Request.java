package com.doudian.open.api.product_createComponentTemplateV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_createComponentTemplateV2.param.*;

//auto generated, do not edit

public class ProductCreateComponentTemplateV2Request extends DoudianOpRequest<ProductCreateComponentTemplateV2Param> {



	@Override
	public String getUrlPath(){
		return "/product/createComponentTemplateV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductCreateComponentTemplateV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}