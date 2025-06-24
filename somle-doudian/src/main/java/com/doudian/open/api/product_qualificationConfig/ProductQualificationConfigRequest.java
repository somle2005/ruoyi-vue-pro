package com.doudian.open.api.product_qualificationConfig;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_qualificationConfig.param.*;

//auto generated, do not edit

public class ProductQualificationConfigRequest extends DoudianOpRequest<ProductQualificationConfigParam> {



	@Override
	public String getUrlPath(){
		return "/product/qualificationConfig";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductQualificationConfigResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}