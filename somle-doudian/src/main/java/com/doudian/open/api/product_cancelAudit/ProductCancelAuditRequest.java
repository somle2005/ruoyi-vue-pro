package com.doudian.open.api.product_cancelAudit;

import com.doudian.open.core.DoudianOpRequest;
import com.doudian.open.core.DoudianOpResponse;
import com.doudian.open.utils.JsonUtil;
import com.doudian.open.api.product_cancelAudit.param.*;

//auto generated, do not edit

public class ProductCancelAuditRequest extends DoudianOpRequest<ProductCancelAuditParam> {



	@Override
	public String getUrlPath(){
		return "/product/cancelAudit";
	}

	@Override
	public  Class<? extends DoudianOpResponse<?>> getResponseClass(){
		return ProductCancelAuditResponse.class;
	}

	@Override
	public String toString(){
		return JsonUtil.toJson(this);
	}

}