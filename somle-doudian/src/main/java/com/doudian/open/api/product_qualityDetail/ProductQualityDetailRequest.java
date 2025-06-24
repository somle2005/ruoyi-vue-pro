package com.doudian.open.api.product_qualityDetail;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_qualityDetail.param.*;

//auto generated, do not edit

public class ProductQualityDetailRequest extends DoudianOpRequest<ProductQualityDetailParam> {



	@Override
	public String getUrlPath(){
		return "/product/qualityDetail";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductQualityDetailResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}