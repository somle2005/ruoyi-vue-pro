package com.doudian.open.api.product_isv_scanClue;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_isv_scanClue.param.*;

//auto generated, do not edit

public class ProductIsvScanClueRequest extends DoudianOpRequest<ProductIsvScanClueParam> {



	@Override
	public String getUrlPath(){
		return "/product/isv/scanClue";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductIsvScanClueResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}