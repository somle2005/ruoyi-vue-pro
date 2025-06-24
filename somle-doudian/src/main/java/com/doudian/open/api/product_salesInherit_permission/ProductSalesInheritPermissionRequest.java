package com.doudian.open.api.product_salesInherit_permission;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_salesInherit_permission.param.*;

//auto generated, do not edit

public class ProductSalesInheritPermissionRequest extends DoudianOpRequest<ProductSalesInheritPermissionParam> {



	@Override
	public String getUrlPath(){
		return "/product/salesInherit/permission";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductSalesInheritPermissionResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}