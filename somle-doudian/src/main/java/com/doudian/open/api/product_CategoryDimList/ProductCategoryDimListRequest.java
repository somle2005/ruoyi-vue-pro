package com.doudian.open.api.product_CategoryDimList;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_CategoryDimList.param.*;

//auto generated, do not edit

public class ProductCategoryDimListRequest extends DoudianOpRequest<ProductCategoryDimListParam> {



	@Override
	public String getUrlPath(){
		return "/product/CategoryDimList";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductCategoryDimListResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}