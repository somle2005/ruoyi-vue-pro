package com.doudian.open.api.product_qualityList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_qualityList.param.*;

//auto generated, do not edit

public class ProductQualityListRequest extends DoudianOpRequest<ProductQualityListParam> {



	@Override
	public String getUrlPath(){
		return "/product/qualityList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductQualityListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}