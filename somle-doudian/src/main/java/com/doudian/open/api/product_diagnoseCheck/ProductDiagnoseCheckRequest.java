package com.doudian.open.api.product_diagnoseCheck;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_diagnoseCheck.param.*;

//auto generated, do not edit

public class ProductDiagnoseCheckRequest extends DoudianOpRequest<ProductDiagnoseCheckParam> {



	@Override
	public String getUrlPath(){
		return "/product/diagnoseCheck";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductDiagnoseCheckResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}