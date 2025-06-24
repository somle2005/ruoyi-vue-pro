package com.doudian.open.api.product_editCbProduct;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_editCbProduct.param.*;

//auto generated, do not edit

public class ProductEditCbProductRequest extends DoudianOpRequest<ProductEditCbProductParam> {



	@Override
	public String getUrlPath(){
		return "/product/editCbProduct";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductEditCbProductResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}