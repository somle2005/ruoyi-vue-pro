package com.doudian.open.api.product_qualityTask;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_qualityTask.param.*;

//auto generated, do not edit

public class ProductQualityTaskRequest extends DoudianOpRequest<ProductQualityTaskParam> {



	@Override
	public String getUrlPath(){
		return "/product/qualityTask";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductQualityTaskResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}