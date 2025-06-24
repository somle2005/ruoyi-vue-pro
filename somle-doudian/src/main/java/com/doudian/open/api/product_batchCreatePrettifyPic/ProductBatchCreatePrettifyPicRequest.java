package com.doudian.open.api.product_batchCreatePrettifyPic;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_batchCreatePrettifyPic.param.*;

//auto generated, do not edit

public class ProductBatchCreatePrettifyPicRequest extends DoudianOpRequest<ProductBatchCreatePrettifyPicParam> {



	@Override
	public String getUrlPath(){
		return "/product/batchCreatePrettifyPic";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductBatchCreatePrettifyPicResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}