package com.doudian.open.api.product_batchGetProductLocks;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_batchGetProductLocks.param.*;

//auto generated, do not edit

public class ProductBatchGetProductLocksRequest extends DoudianOpRequest<ProductBatchGetProductLocksParam> {



	@Override
	public String getUrlPath(){
		return "/product/batchGetProductLocks";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductBatchGetProductLocksResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}