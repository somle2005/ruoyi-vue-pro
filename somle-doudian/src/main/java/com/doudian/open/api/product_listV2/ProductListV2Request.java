package com.doudian.open.api.product_listV2;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_listV2.param.*;

//auto generated, do not edit

public class ProductListV2Request extends DoudianOpRequest<ProductListV2Param> {



	@Override
	public String getUrlPath(){
		return "/product/listV2";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductListV2Response.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}