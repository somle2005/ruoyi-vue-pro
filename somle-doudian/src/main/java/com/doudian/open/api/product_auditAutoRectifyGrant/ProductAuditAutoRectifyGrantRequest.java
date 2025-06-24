package com.doudian.open.api.product_auditAutoRectifyGrant;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_auditAutoRectifyGrant.param.*;

//auto generated, do not edit

public class ProductAuditAutoRectifyGrantRequest extends DoudianOpRequest<ProductAuditAutoRectifyGrantParam> {



	@Override
	public String getUrlPath(){
		return "/product/auditAutoRectifyGrant";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductAuditAutoRectifyGrantResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}