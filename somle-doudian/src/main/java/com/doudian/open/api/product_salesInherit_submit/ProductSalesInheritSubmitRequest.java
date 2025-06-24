package com.doudian.open.api.product_salesInherit_submit;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_salesInherit_submit.param.*;

//auto generated, do not edit

public class ProductSalesInheritSubmitRequest extends DoudianOpRequest<ProductSalesInheritSubmitParam> {



	@Override
	public String getUrlPath(){
		return "/product/salesInherit/submit";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductSalesInheritSubmitResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}