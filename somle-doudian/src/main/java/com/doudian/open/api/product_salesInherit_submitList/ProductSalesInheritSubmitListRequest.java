package com.doudian.open.api.product_salesInherit_submitList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_salesInherit_submitList.param.*;

//auto generated, do not edit

public class ProductSalesInheritSubmitListRequest extends DoudianOpRequest<ProductSalesInheritSubmitListParam> {



	@Override
	public String getUrlPath(){
		return "/product/salesInherit/submitList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductSalesInheritSubmitListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}